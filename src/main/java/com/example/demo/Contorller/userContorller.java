package com.example.demo.Contorller;

import com.example.demo.Pojo.student;
import com.example.demo.Pojo.user;
import com.example.demo.maper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/users")
public class userContorller {
    @Autowired
    private userMapper lin;
    @GetMapping("login")
    public int lin1(@RequestParam String username,@RequestParam String password){
       if (lin.a(username)!=null&&lin.a(username).equals(password)){
           return 1;
       }else {
           return 0;
       }
    }

    @PostMapping("/addUser")
    public int lin2(@RequestBody user user) {
        if (lin.a(user.getUsername())!=null){
            return 0;
        }else {
            lin.aa(user);
            return 1;
        }


    }

}
