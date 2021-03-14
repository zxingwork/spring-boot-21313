package org.zx.springboot21313;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan("org.zx.springboot21313.*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBoot21313Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21313Application.class, args);
    }

}
