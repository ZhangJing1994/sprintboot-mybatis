package com.kongxiang.project.dao.mapper;


import com.kongxiang.project.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.kongxiang.mapper
 * @className: springmvc
 * @author:谭农春
 * @createTime:2018/4/22 9:49
 */
@Mapper
public interface UserMapper {
  /**
   * 添加用户
   * @param user
   * @return
   */
   public int insert(User user) ;

   /**
    * 添加用户
    * @param user
    * @return
    */
   public int update(User user) ;

   /**
    *  删除主键
    * @param id
    * @return
    */
   public int delete(Integer id) ;

  /**
   *  通过name 查询
   * @param name
   * @return
   */
    public List<User> selectAll(String name) ;

  /**
   * 通过用户id 获取用户对象
   * @param id
   * @return
   */
     public User getUserById(Integer id);
}
