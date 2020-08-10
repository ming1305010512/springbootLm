package com.alsa.alsa.springbootActuator.endpoint.customEndpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/8/1
 * @Time:13:48
 */
@Service
@Endpoint(id = "myEndpoint")
public class EndpointService {

    /**
     * 请求参数为表单参数
     *
     * @param name
     * @return
     */
    @ReadOperation
    public Map<String, Object> readOperationTest(String name) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("message", "我是readOperation");
        return map;
    }

    /**
     * 接收json数据
     *
     * @param name
     * @return
     */
    @WriteOperation
    public Map<String, Object> writeOperation(@RequestBody String name) {
        Map map = new HashMap(16);
        map.put("message", "我是writeOperation");
        return map;
    }
}
