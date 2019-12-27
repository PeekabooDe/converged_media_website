package com.dianyou.media.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DemoController {

    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("我最帅", "我是彭于晏");

    @GetMapping("/")
    public String demo(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        model.addAttribute("img1", "https://static.runoob.com/images/mix/img_mountains_wide.jpg");
        model.addAttribute("img2", "https://static.runoob.com/images/mix/img_nature_wide.jpg");
        model.addAttribute("img3", "https://static.runoob.com/images/mix/img_fjords_wide.jpg");

        return "index";
    }

    @GetMapping("/advisoryService")
    public String mainWithParam(Model model) {
        model.addAttribute("img4", "https://static.runoob.com/images/mix/img_fjords_wide.jpg");
        return "productService/advisoryService";
    }

}
