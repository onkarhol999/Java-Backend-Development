package com.TomCat.webApplicationUsingSpringBootProject1;
import java.util.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
        int result = num1+num2;
        model.addAttribute("result", result);
        return "result";
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        return "result";
    }
}
