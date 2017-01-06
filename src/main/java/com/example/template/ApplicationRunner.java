package com.example.template;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class);

    @Value("${welcome-text}")
    private String welcomeText;

    @Override
    public void run(final String... args) throws Exception {
        LOGGER.info(welcomeText);
    }
}
