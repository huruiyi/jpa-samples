package com.in28minutes.spring.basics.springin5steps.game.service.impl;

import com.in28minutes.spring.basics.springin5steps.game.service.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("SuperContraGame up");
    }

    public void down() {
        System.out.println("SuperContraGame down");
    }

    public void left() {
        System.out.println("SuperContraGame left");
    }

    public void right() {
        System.out.println("SuperContraGame right");
    }


}
