package com.example.japidocsdemo.controller;

import lombok.Data;

/**
 * @ClassName UserForm
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 14:00
 */
@Data
public class UserForm {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户姓名
     */
    private String userName;
}
