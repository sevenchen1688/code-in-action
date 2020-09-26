package com.example.japidocsdemo.controller;

import lombok.Data;

/**
 * @ClassName UserVO
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 13:54
 */
@Data
public class UserVO {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户姓名
     */
    private String userName;
}
