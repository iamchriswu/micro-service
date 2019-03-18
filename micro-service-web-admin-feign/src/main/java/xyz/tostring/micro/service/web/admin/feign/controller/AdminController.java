package xyz.tostring.micro.service.web.admin.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.tostring.micro.service.web.admin.feign.service.AdminService;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("hello")
    public String hello(String message) {
        return adminService.hello(message);
    }
}
