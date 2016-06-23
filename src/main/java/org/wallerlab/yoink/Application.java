package org.wallerlab.yoink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is Yoink, an application for Adapative QM/MM calculations.
 *
 *
 *
 * {@link http://yoink.wallerlab.org}
 *
 * @author Min Zheng
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}