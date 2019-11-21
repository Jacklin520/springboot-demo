package com.lin.mapper;

import com.lin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: jacklin
 * @Date: 2019/11/21 16:44
 * @Version 1.0
 */
//这个注解表示了这是一个mybatis的mapper类,或者在主启动类上加上 @MapperScan("com.lin.mapper"),dao层的需要用注解@RRepository
@Mapper
@Repository
public interface UserMapper {
    //查询所有用户
    List<User> queryUserList();
    //通过ID查询用户
    User queryUserById(int id);
    //添加一个用户
    int addUser(User user);
    //修改一个用户
    int updateUser(User user);
    //根据id删除用户
    int deleteUser(int id);
}
