package com.gec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : MainController  //类名
 * @date 2020/10/21 10:32
 */
@Controller
public class MainController {
    @RequestMapping("/dumpUser")
    public String dumpUser(){
        return "addUser";
    }
}
