package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "<b>hello</b>";
    }

    public String answerHello(String userName) {
        return "hello " + userName;
    }
}
