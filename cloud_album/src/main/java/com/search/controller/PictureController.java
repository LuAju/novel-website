package com.search.controller;

import com.search.entity.PicInfo;
import com.search.result.CommonResult;
import com.search.service.PicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/picture")
@Api("图片的上传和下载接口")
public class PictureController {
    private static final Logger logger = LoggerFactory.getLogger(PictureController.class);

    @Value("${uploadDir}")
    private String realPath;

    // 服务器地址及端口
    @Value("${websiteUrl}")
    private String picUrl;

    @Autowired
    private PicInfoService picInfoService;

    @RequestMapping("/upload")
    @ApiOperation(value = "文件上传接口")
    public Object uploadPic(MultipartFile multipartFile, HttpServletRequest request) {
        if (multipartFile == null) {
            return CommonResult.buildFailed("文件为空");
        }
        String originalFilename = multipartFile.getOriginalFilename();
        String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileDir = "D://pic//";
        String uuidName = UUID.randomUUID() + suffixName;
        // 获取服务器上的路径（不知道是绝对还是相对）
        // String realPath = request.getSession().getServletContext().getRealPath("/");
        String newFileName = fileDir + uuidName;

        File destinationFile = new File(newFileName);

        // 检测是否存在目录
        if (!destinationFile.getParentFile().exists()) {
            destinationFile.getParentFile().mkdirs();
        }

        try {
            multipartFile.transferTo(destinationFile);
            // 存入数据库时，返回前台时，存入数据库时不加前缀
            logger.info("图片上传成功，图片名：--->" + uuidName);
            return (uuidName);
        } catch (IOException e) {
            e.printStackTrace();
            return CommonResult.buildFailed("文件存储失败");
        }
    }

    @RequestMapping("/download")
    public Object downloadPic() {
        return "http://localhost:8083/pic/dec36a7e-39f5-42e7-8f0e-c39a0c2b2940.jpg";
    }

    @RequestMapping("/select/{info}")
    // 根据用户的输入信息，模糊查找
    public Object getInfo(@PathVariable("info") String info) {
        List<PicInfo> picInfos = picInfoService.selectByInfoLike(info);
        for (PicInfo picInfo : picInfos) {
            // 将服务地址添加到文件名前，以支持前端的预览
            picInfo.setPicUrl(picUrl + picInfo.getPicUrl());
        }
        return CommonResult.buildSucceed(picInfos);
    }

    @RequestMapping("/insert")
    // 将照片名称及地址插入数据库
    public Object insert(@RequestBody PicInfo picInfo) {
        int insert = picInfoService.insert(picInfo);
        if (insert > 0) {
            return CommonResult.buildSucceed();
        } else {
            return CommonResult.buildFailed("插入失敗");
        }
    }
}
