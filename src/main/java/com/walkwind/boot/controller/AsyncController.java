package com.walkwind.boot.controller;

import com.walkwind.boot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-27-0:02
 **/
@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;
    @GetMapping("/async")
    public String asyncTask() throws InterruptedException {
        asyncService.AsyncTask();
        return "执行结束返回..异步方法正在执行中";
    }
}
