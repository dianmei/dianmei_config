package com.itmuch.cloud.dianmei.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.dianmei.user.entity.User;
import com.itmuch.cloud.dianmei.user.feign.UserFeignClient;


@RestController
public class FeignController {
  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("feign/{id}")
  public User findByIdFeign(@PathVariable Long id) {
    User user = this.userFeignClient.findByIdFeign(id);
    return user;
  }
}
