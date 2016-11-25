package com.springapp.mvc.controller.rest;

import com.springapp.mvc.domain.Pizza;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class TestRestController {
    /* 不需要视图解析器
    * eg:http://localhost:8080/contextPath/rest/test.xml
    * eg:http://localhost:8080/contextPath/rest/test.json
    * */
    @RequestMapping(value = "/rest/test", method = RequestMethod.GET)
    public Pizza getPizza() {
        Pizza pizza = new Pizza();
        pizza.setName("hj");
        pizza.setFlavor("dj");
        pizza.setToppings(Arrays.asList("ss","ssd"));
        return pizza;
    }
}
