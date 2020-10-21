package com.gec.service;

import com.gec.domain.User;

import java.util.List;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : UserService  //类名
 * @date 2020/10/21 10:34
 */
public interface UserService {
    public void addUser(User user);
    public List<User> findAllUser();
    public void deleteUser(Integer id);
    public User findUserById(Integer id);
    public void updateUser(User user);
}
