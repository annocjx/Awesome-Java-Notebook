package com.prim.springmvc.controller;

import com.prim.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author prim
 * URL 映射
 */
@Controller
@RequestMapping("/um") //@RequestMapping 增加通用的前缀 当前类的所有的mapping RequestMapping推荐的使用方式
public class UrlMappingController {

    @GetMapping("/g")
//    @RequestMapping(value = "/g", method = RequestMethod.GET) //如果作用在方法上，当前的方法不再区分get/post请求 所有的请求都会访问到
    //也可以通过method 属性设置请求方式
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String managerName) {//RequestParam 映射请求参数名 注入到后面到参数中managerName
        //这样参数命名不需要和请求参数一致了
        return "This is get method -> " + managerName;
    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping(String username, Long password) {//直接通过方法接受参数 命名保持一致
        //简化了request.getParameter
        return "This is post method -> " + username + ":" + password;
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping1(User user, String username) {//使用JavaBean作为参数 Spring mvc 会自动给Bean赋值 寻找同名的请求参数
        //username 参数Spring MVC也会一并赋值 只要命名和请求参数一致
        return "This is java bean post -> " + user.toString() + ":" + username;
    }
}
