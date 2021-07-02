package org.docker.demo.demo.API;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloAPI {

    private static Logger logger = LoggerFactory.getLogger(HelloAPI.class);

    @RequestMapping("/hi")
    public String hello () {
        logger.info("/hi........");
        return "hey,guys!";
    }

    @RequestMapping("/version")
    public String version () {
        logger.info("/version........");
        return "写死，测试volumes。。。v0.0.8";
    }
}
