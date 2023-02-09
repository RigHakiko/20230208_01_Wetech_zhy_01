package com.zhy.wetech_zhy.controller;


import com.zhy.wetech_zhy.entity.User;
import com.zhy.wetech_zhy.service.IUserService;
import com.zhy.wetech_zhy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZHY
 * @since 2023-02-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @CrossOrigin
    @PostMapping("/save")
    public boolean save(@RequestBody User user){
        return iUserService.save(user);
    }
}

