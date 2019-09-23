package com.example;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author jiangqw
 * @date 2019/9/21 23:39
 */
public class BeerAttributeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object o = event.getValue();

        System.out.println("Attribute added: " + name + ": " + o);
    }
}
