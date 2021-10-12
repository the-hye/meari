package com.ktds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/login")
    public String login(){
        return "login/index";
    }
	
	
	//Test ม๘วเม฿ ... 
	@RequestMapping("/loginTest")
    public String loginTest(){
        return "loginTest";
    }

    @RequestMapping("/user")
    public String user(){
        return "user/index";
    }

    @RequestMapping("/home")
    public String main(){
        return "home/index";
    }
    @RequestMapping("/sns/feed")
    public String sns_feed(){
        return "sns/sns_feed";
    }

    @RequestMapping("/sns/new")
    public String sns_new(){
        return "sns/sns_new";
    }

    @RequestMapping("/sns/popular")
    public String sns_popular(){
        return "sns/sns_popular";
    }

    @RequestMapping("/profile")
    public String profile(){
        return "profile/profile";
    }

    @RequestMapping("/commerce")
    public String commerce(){
        return "commerce/commerce";
    }
    
	@RequestMapping("/signup")
	public String signuppage() {
		return "signup";
		
	}
	
	
	
}
