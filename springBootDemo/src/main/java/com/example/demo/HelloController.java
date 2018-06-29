package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller  
public class HelloController {  
	
/*	@Value("${cupSize}")
	private String cupSize;
	
	@Value("${age}")
	private Integer age;*/
	
	/*@Value("${content}")
	private String content;*/
	
	@Autowired
	private ConfigProperties configProperties; 
	
    @RequestMapping(value="/hello", method=RequestMethod.GET)  
    public String HelloController() {  
        return "index";  
    }  

}  
