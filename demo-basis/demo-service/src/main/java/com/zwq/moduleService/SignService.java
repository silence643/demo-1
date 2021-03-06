package com.zwq.moduleService;


import com.zwq.dto.Result;
import com.zwq.pojo.User;

/**
 * created by zwq on 2018/6/5
 */
public interface SignService {
    /**
     * 校验用户登录
     * @param user
     * @return
     */
    Result<User> logChecking(User user);

    /**
     * 校验用户名是否已存在
     * @param name
     * @return
     */
    Result registerChecking(String name);

    /**
     * 修改用户密码
     * @param user
     * @return
     */
    Result changePassword(User user);

    /**
     * 注册用户，如果注册成功就添加进数据库
     * @param user
     * @return
     */
    Result<User> register(User user);
}
