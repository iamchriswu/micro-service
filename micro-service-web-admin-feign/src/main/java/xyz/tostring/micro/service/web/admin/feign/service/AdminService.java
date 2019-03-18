package xyz.tostring.micro.service.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.tostring.micro.service.web.admin.feign.service.hystrix.AdminServiceHystrix;

@FeignClient(value = "micro-service-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping("hello")
    public String hello(@RequestParam(value = "message") String message);
}
