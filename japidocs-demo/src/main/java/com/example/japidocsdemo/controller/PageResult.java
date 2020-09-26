package com.example.japidocsdemo.controller;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PageResult
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 14:01
 */
@Data
public class PageResult<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Integer total;
    private List<T> list;
}
