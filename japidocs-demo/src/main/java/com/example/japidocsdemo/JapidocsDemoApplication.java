package com.example.japidocsdemo;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JapidocsDemoApplication {

	public static void main(String[] args) {
		DocsConfig config = new DocsConfig();
		config.setProjectPath("C:\\work\\workspace\\code-in-action\\japidocs-demo"); // 项目根目录
		config.setProjectName("ProjectName"); // 项目名称
		config.setApiVersion("V1.0");       // 声明该API的版本
		config.setDocsPath("C:\\work\\workspace\\code-in-action\\japidocs-demo\\docs"); // 生成API 文档所在目录
		config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
		Docs.buildHtmlDocs(config); // 执行生成文档
		SpringApplication.run(JapidocsDemoApplication.class, args);
	}

}
