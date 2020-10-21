package com.gec.controller;

import com.gec.domain.User;
import com.gec.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : UserController  //类名
 * @date 2020/10/21 10:38
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "success";
    }
    @RequestMapping("/findUserList")
    public String findUserList(Model model){
        List<User> allUser = userService.findAllUser();
        model.addAttribute("userList",allUser);
        return "userlist";
    }
    @RequestMapping("/delUser")
    public String deleteUser(Integer id){
        System.out.println(id+"..........");
        userService.deleteUser(id);
        return "redirect:/findUserList";
    }
    @RequestMapping("/findUserById")
    public String findUserById(Integer id,Model model){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "updateUser";
    }
    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/findUserList";
    }


}
