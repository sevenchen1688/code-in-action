package com.example.japidocsdemo.controller;

import lombok.Data;

/**
 * @ClassName PageForm
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 13:49
 */
@Data
public class PageForm {
    /**
     * 当前页
     */
    private Integer currPage = 1;
    /**
     * 每页大小
     */
    private Integer pageSize = 10;
}
