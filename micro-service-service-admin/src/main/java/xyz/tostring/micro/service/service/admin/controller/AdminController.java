package xyz.tostring.micro.service.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    public String hello(String message) {
        return String.format("Hello message is : %s, port : %s", message, this.port);
    }
}
