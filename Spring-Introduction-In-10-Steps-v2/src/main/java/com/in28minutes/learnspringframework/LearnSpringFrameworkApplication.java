package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.enterprise.flow.web.WebController;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

    public static void main(String[] args) {

        GamingConsole game2 = new MarioGame();
        GameRunner runner2 = new GameRunner(game2);
        runner2.run();

        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();

        WebController controller = context.getBean(WebController.class);
        long num = controller.returnValueFromBusinessService();
        System.out.println(num);
    }

}
