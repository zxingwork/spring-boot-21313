package org.zx.springboot21313.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(2)
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Runner2>>>"+ Arrays.toString(strings));
    }
}
