package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User yusuf = new User();
        yusuf.setName("Yusuf");
        yusuf.setEmpId(1111);
        yusuf.setSalary(12000);

        User ziyad = new User();
        ziyad.setName("Ziyad");
        ziyad.setEmpId(1112);
        ziyad.setSalary(32000);
        User zaina = new User();
        zaina.setName("Zaina");
        zaina.setEmpId(1113);
        zaina.setSalary(16000);

        users.put(yusuf.getName(), yusuf);
        users.put(ziyad.getName(), ziyad);
        users.put(zaina.getName(), zaina);
    }

    public User getUsers(String name) {
        return users.get(name);
    }

}
