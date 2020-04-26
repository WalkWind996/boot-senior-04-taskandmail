package com.walkwind.boot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-26-23:36
 **/
@Service
public class AsyncService {

    @Async//开启异步执行
    public void AsyncTask() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("异步任务.........执行完毕");
    }
}
