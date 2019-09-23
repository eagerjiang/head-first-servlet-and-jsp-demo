package com.example;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 在配置文件中注册监听器
 *
 * @author jiangqw
 * @date 2019/9/21 16:13
 */
public class BeerSessionCounter implements HttpSessionListener {
    private static int activeCounter;

    public static int getActiveCounter() {
        return activeCounter;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        activeCounter++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        activeCounter--;
    }
}
