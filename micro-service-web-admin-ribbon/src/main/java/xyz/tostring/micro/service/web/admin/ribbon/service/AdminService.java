package xyz.tostring.micro.service.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String message) {
        return restTemplate.getForObject("http://micro-service-service-admin/hello?message=" + message, String.class);
    }

    public String helloError(String message) {
        return String.format("your message is : %s , 200 but request bad", message);
    }
}
