package com.springapp.mvc;

import com.springapp.mvc.domain.FieldError;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice(annotations = {Controller.class, RestController.class})
public class MyControllerAdvice {

    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String validationError(BindException e, HttpServletRequest request) {
        request.setAttribute("errors", getErrors(e.getBindingResult()));
        return "error";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String validationError(MethodArgumentNotValidException e, HttpServletRequest request) {
        request.setAttribute("errors", getErrors(e.getBindingResult()));
        return "error";
    }

    private List<FieldError> getErrors(BindingResult bindingResult) {
        List<FieldError> errors = new ArrayList<>();
        for (org.springframework.validation.FieldError fieldError : bindingResult.getFieldErrors()) {
            FieldError error = new FieldError();
            error.setField(fieldError.getField());
            error.setMessage(fieldError.getDefaultMessage());
            errors.add(error);
        }
        return errors;
    }
}
