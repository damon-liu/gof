package com.damon.gof.structure.proxy;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 6:23
 */
public class UserServiceImpl implements UserService {

    @Override
    public UserVo login(String telephone, String password) {
        System.out.println("登录！！");
        return new UserVo();
    }

    @Override
    public UserVo register(String telephone, String password) {
        return null;
    }
}
