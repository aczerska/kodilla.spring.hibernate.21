package com.kodilla.lifecycle;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifecycleApplication {

    private final static Logger logger = (Logger) LoggerFactory.getLogger(BeanLifecycleApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfiguration.class);
        context.refresh();

        LibraryManager manager = context.getBean(LibraryManager.class);
        logger.debug("Context and beans are set up and ready to work");
        context.close();
    }

}
