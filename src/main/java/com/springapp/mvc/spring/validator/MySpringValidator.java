package com.springapp.mvc.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MySpringValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return LoginForm2.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginForm2 loginForm = (LoginForm2) target;
        ValidationUtils.rejectIfEmpty(errors, "username", "username.required");
        ValidationUtils.rejectIfEmpty(errors, "password", "password.required");

        if (loginForm.getNickname() != null && loginForm.getNickname().length() > 10) {
            errors.rejectValue("nickname", "nickname.illegal");
        }
    }
}
