package com.github.springbooth2.controller;

import com.github.springbooth2.pojo.UserDO;
import com.github.springbooth2.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 19:51 2019-04-12
 * 项目名称 spring-boot-h2
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class UserController {

    @Resource
    private UserRepository repository;

    @PostMapping("user")
    public UserDO save(@RequestBody UserDO userDO) {
        return repository.save(userDO);
    }

}
