package com.kongxiang.project.service.impl;

import com.kongxiang.project.dao.UserDAO;
import com.kongxiang.project.entity.User;
import com.kongxiang.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.kongxiang.project.service.impl
 * @className: SpringBootRW
 * @author:谭农春
 * @createTime:2018/5/4 21:58
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDAO userDAO;
  @Override
  public List<User> getAll() {
    return userDAO.getAll();
  }
}
