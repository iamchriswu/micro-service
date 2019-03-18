package xyz.tostring.micro.service.web.admin.feign.service.hystrix;

import org.springframework.stereotype.Component;
import xyz.tostring.micro.service.web.admin.feign.service.AdminService;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String hello(String message) {
        return String.format("your message is : %s, 200 but request bad", message);
    }
}
