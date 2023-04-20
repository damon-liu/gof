package com.damon.gof.structure.proxy;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 4:29
 */
public interface UserService {

    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);

}
