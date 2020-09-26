package com.example.japidocsdemo.controller;

import lombok.Data;

/**
 * @ClassName UserListForm
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 13:50
 */
@Data
public class UserListForm extends PageForm{
    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 用户姓名
     */
    private String name;
}