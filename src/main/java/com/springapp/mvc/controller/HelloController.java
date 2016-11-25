package com.springapp.mvc.controller;

import com.springapp.mvc.request.LoginForm;
import com.springapp.mvc.spring.validator.LoginForm2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        model.addAttribute("loginForm2", new LoginForm2());
        return "hello";
    }

    //BindingResult紧跟在验证对象之后，BindingResult一定要在之后立即生效对象，否则spring将无法验证并且将一个异常抛出。
//    @RequestMapping(value = "login", method = RequestMethod.POST)
//    public String login(@Valid LoginForm loginForm, BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            List<ObjectError> errorList = result.getAllErrors();
//            for (ObjectError error : errorList) {
//                System.out.println(error.getDefaultMessage());
//            }
//            model.put("errors", errorList);
//            return "error";
//        }
//        model.addAttribute("name", loginForm.getNickname());
//        model.addAttribute("message", "login success!");
//        return "success";
//    }

    @RequestMapping(value = "login2", method = RequestMethod.POST)
    public String login2(@Valid LoginForm loginForm, ModelMap model) {
        model.addAttribute("name", loginForm.getNickname());
        model.addAttribute("message", "login success!");
        return "success";
    }
}