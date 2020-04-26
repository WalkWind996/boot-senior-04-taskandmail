package com.walkwind.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class BootSenior04TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;
    @Test
    void contextLoads() throws MessagingException {
        //发送一个简单邮件
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("13721090230@163.com");
        simpleMailMessage.setText("mail ....test");
        simpleMailMessage.setSubject("测试主题");
        simpleMailMessage.setFrom("1035314372@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

    @Test
    void contextLoads1() throws MessagingException {
        //使用MimeMessageHelper发送附件和内联资源
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo("13721090230@163.com");
        helper.setText("<html><body><img src='cid:identifier1234'></body></html>",true);
        helper.setFrom("1035314372@qq.com");
        FileSystemResource res = new FileSystemResource(new File("c:/1.jpg"));
        helper.addInline("identifier1234", res);
        javaMailSender.send(message);
    }


}
