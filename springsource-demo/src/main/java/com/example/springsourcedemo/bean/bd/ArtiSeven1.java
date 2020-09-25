package com.example.springsourcedemo.bean.bd;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName ArtiSeven1
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/25 15:44
 */
@Component
public class ArtiSeven1 {
	
	@PostConstruct
	public void  init(){
		System.out.println("ArtiSeven1 Created");
	}
}
