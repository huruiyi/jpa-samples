package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.game.GameRunnerV1;
import com.in28minutes.spring.basics.springin5steps.game.GameRunnerV2;
import com.in28minutes.spring.basics.springin5steps.game.service.GamingConsole;
import com.in28minutes.spring.basics.springin5steps.game.service.impl.MarioGame;
import com.in28minutes.spring.basics.springin5steps.web.WebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch.binarySearch(new int[]{12, 4, 6}, 3));

        WebController controller = applicationContext.getBean(WebController.class);
        System.out.println(controller.returnValueFromBusinessService());

        GamingConsole game2 = new MarioGame();
        GameRunnerV1 gameRunnerV1 = new GameRunnerV1(game2);
        gameRunnerV1.run();

        GameRunnerV2 gameRunnerV2 = applicationContext.getBean(GameRunnerV2.class);
        gameRunnerV2.run();

        GameRunnerV1 runnerV1 = applicationContext.getBean(GameRunnerV1.class);
        runnerV1.run();
    }
}