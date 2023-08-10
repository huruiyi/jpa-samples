package com.in28minutes.spring.basics.springin5steps.game;

import com.in28minutes.spring.basics.springin5steps.game.service.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerV1 {

    private GamingConsole gamingConsole;

    public GameRunnerV1(GamingConsole game) {
        System.out.println("Using Constructor");
        this.gamingConsole = game;
    }

//	public void setGame(GamingConsole game) {
//		System.out.println("Using Setter");
//		this.game = game;
//	}

    public void run() {
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }

}
