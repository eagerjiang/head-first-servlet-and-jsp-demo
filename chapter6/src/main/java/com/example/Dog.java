package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingListener;
import java.io.Serializable;

/**
 * @author jiangqw
 * @date 2019/9/21 15:08
 */
@AllArgsConstructor
@Getter
@Setter
public class Dog implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {
    private String breed;


}
