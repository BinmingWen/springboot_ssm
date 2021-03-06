package com.gec.mapper;

import com.gec.domain.User;

import java.util.List;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : UserMapper  //类名
 * @date 2020/10/21 10:32
 */
public interface UserMapper {
    public void addUser(User user);
    public List<User> findAllUser();
    public void deleteUserById(Integer id);
    public User findUserById(Integer id);
    public void updateUser(User user);
}
