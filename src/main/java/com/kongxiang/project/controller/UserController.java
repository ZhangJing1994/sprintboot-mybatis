package com.kongxiang.project.controller;

import com.kongxiang.project.entity.User;
import com.kongxiang.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.kongxiang.project.controller
 * @className: SpringBootRW
 * @author:谭农春
 * @createTime:2018/5/4 21:53
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private UserService userService;
  /**
   * 获取所有的用户
   * @return
   * @throws Exception
   */
  @GetMapping("all")
  public List<User> getAll() throws  Exception{
    return  userService.getAll();
  }

}
