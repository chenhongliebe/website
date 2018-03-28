package com.frico.website.web;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication(scanBasePackages="com.frico.website")
@EnableAutoConfiguration
@MapperScan(basePackages = "com/frico/website/dao", annotationClass = javax.annotation.Resource.class)
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	//配置mybatis的分页插件pageHelper
      @Bean
      public PageHelper pageHelper(){
		         PageHelper pageHelper = new PageHelper();
		         Properties properties = new Properties();
		         properties.setProperty("offsetAsPageNum","true");
		         properties.setProperty("rowBoundsWithCount","true");
		         properties.setProperty("reasonable","true");
		         properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
		         pageHelper.setProperties(properties);
		         return pageHelper;
		    }
}