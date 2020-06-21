package com.search.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BookQueryVo {
    private Integer userId;
    private String queryString;
    private String bookName;
}
