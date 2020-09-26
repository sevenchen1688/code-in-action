package com.example.japidocsdemo.controller;

import lombok.Data;

/**
 * @ClassName ApiResult
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 13:58
 */
@Data
public class ApiResult<T> {
    /**
     * 返回状态码
     */
    private int code;
    /**
     * 返回错误信息
     */
    private String errMsg;
    private T data;
}
