package io.github.simplyexample.demo.ssm.service;

import io.symplesims.spring.aws.ssm.autoconfigure.SsmParameterValue;
import io.symplesims.spring.aws.ssm.autoconfigure.ValueType;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SimpleService {

    @SsmParameterValue("/secure/rds/symple/username")
    private String username;

    @SsmParameterValue(value = "/secure/rds/symple/username", type = ValueType.MAP)
    private Map<String, String> usermap;

    @SsmParameterValue(value = "/secure/rds/symple", type = ValueType.MAP)
    private Map<String, String> info;

    @SsmParameterValue(value = "/secure/rds/symple", type = ValueType.MAP, fullname = true)
    private Map<String, String> infoFull;

    public String getUsername() {
        return username;
    }

    public Map<String, String> getUsermap() {
        return usermap;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public Map<String, String> getInfoFull() {
        return infoFull;
    }
}
