package com.kongxiang.project.service;

import com.kongxiang.project.entity.User;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.kongxiang.project.service
 * @className: SpringBootRW
 * @author:谭农春
 * @createTime:2018/5/4 21:57
 */
public interface UserService {
  public List<User> getAll();
}
