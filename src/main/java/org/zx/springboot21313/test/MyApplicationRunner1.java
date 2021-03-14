package org.zx.springboot21313.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Order(1)
public class MyApplicationRunner1 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        List<String> nonOptionArgs = applicationArguments.getNonOptionArgs();
        System.out.println("1-nonOptionArgs>>>"+nonOptionArgs);
        Set<String> optionNames = applicationArguments.getOptionNames();
        for (String optionName : optionNames) {
            System.out.println("1-key:"+optionName+";value:"+applicationArguments.getOptionValues(optionName));
        }
    }
}
