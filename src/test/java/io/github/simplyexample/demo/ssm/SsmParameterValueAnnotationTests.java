package io.github.simplyexample.demo.ssm;

import io.github.simplyexample.demo.ssm.service.SimpleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class SsmParameterValueAnnotationTests {

    @Autowired
    private SimpleService simpleService;

    @Test
    public void test_ssm_string_parameter() {
        String username = simpleService.getUsername();
        Assertions.assertNotNull(username);
        System.out.println("simpleService.username: " + username);
    }

    @Test
    public void test_ssm_single_map() {
        Map<String, String> info = simpleService.getInfo();
        Assertions.assertTrue(info.containsKey("username"));
        System.out.println("simpleService.usermap: " + simpleService.getUsermap());
    }

    @Test
    public void test_ssm_map_parameters() {
        Map<String, String> info = simpleService.getInfo();
        Assertions.assertNotNull(info);
        System.out.println("simpleService.usermap: " + simpleService.getUsermap());
        System.out.println("simpleService.info: " + info);
        System.out.println("demoService.infoFull: " + simpleService.getInfoFull());
    }

}

