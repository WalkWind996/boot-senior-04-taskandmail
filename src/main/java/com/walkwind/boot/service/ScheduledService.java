package com.walkwind.boot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-26-23:37
 **/
@Service
public class ScheduledService {
    /**
     * second(秒), minute（分）, hour（时）, day of month（日）, month（月）, day of week（周几）.
     * 格式0 * * * * MON-FRI
     *  【0 0/5 14,18 * * ?】 每天14点整，和18点整，每隔5分钟执行一次
     *  【0 15 10 ? * 1-6】 每个月的周一至周六10:15分执行一次
     *  【0 0 2 ? * 6L】每个月的最后一个周六凌晨2点执行一次
     *  【0 0 2 LW * ?】每个月的最后一个工作日凌晨2点执行一次
     *  【0 0 2-4 ? * 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次；
     */
    //@Scheduled(cron = "0 * * * * MON-SAT")周一周六每整分钟都执行
    //@Scheduled(cron = "0,1,4 * * * * MON-SAT")周一周六每分钟的0,1,4秒都执行
    // @Scheduled(cron = "0-4 * * * * MON-SAT")周一周六每0,1,2,3,4秒执行一次
    @Scheduled(cron = "0/4 * * * * MON-SAT")  //每4秒执行一次
    public void task(){
        System.out.println("定时任务.........");
    }
}
