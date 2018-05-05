package com.kongxiang.project.dao.impl;

import com.kongxiang.project.dao.UserDAO;
import com.kongxiang.project.dao.mapper.UserMapper;
import com.kongxiang.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.kongxiang.project.dao
 * @className: SpringBootRW
 * @author:谭农春
 * @createTime:2018/5/4 21:56
 */
@Service
public class UserDAOImpl implements UserDAO {

  @Autowired
  private UserMapper userMapper;
  /**
   * 获取所有的用户
   *
   * @return
   */
  @Override
  public List<User> getAll() {
    return userMapper.selectAll("");
  }
}
