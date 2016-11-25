package com.springapp.mvc.spring.validator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TestController {

    @RequestMapping(value = "/login3", method = RequestMethod.POST)
    public String login2(LoginForm2 loginForm2, BindingResult bindingResult, ModelMap model) {
        MySpringValidator mySpringValidator = new MySpringValidator();
        mySpringValidator.validate(loginForm2, bindingResult);
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getField() + " : " + fieldError.getRejectedValue() + " : " + fieldError.getDefaultMessage());
            }
            model.put("loginForm2", loginForm2);
            return "hello";
        }
        model.addAttribute("name", loginForm2.getNickname());
        model.addAttribute("message", "login success!");
        return "success";
    }
}
