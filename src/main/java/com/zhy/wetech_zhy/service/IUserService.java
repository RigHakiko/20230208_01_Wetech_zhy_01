package com.zhy.wetech_zhy.service;

import com.zhy.wetech_zhy.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZHY
 * @since 2023-02-08
 */
public interface IUserService extends IService<User> {

    boolean save(User user);

}
