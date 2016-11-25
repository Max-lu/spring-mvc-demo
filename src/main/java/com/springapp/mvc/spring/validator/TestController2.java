package com.springapp.mvc.spring.validator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Controller
public class TestController2 {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        //this will apply the validator to all request-handling methods
        binder.setValidator(new MySpringValidator());
        binder.validate();
    }
}
