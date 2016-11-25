package com.springapp.mvc.request;


import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginForm {

    @NotNull(message = "username is required")
    @Size(min = 1, message = "username is required")
    private String username;

    @NotBlank(message = "password is required")
    private String password;

    @Size(max = 10, message = "nickname is limited 10 characters.")
    private String nickname;

    @Max(value = 120, message = "age should be smaller than 120")
    @Min(value = 0, message = "age should be bigger than 0")
    private Integer age;

    @Pattern(regexp = "\\d+", message = "phone number is illegal")
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
