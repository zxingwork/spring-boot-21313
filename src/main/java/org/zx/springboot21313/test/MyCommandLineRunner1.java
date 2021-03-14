package org.zx.springboot21313.test;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Runner1>>>"+ Arrays.toString(strings));
    }
}
