package vip.xingxiaoshuai.custom.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "custom")
public class CustomActuatorEndpoint {


    @ReadOperation
    public Map<String,Object> customEndpoint(String username){
        Map<String,Object> map = new HashMap<>();
        map.put("key","value");
        map.put("username",username);
        return map;
    }



}
