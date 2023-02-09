package com.zhy.wetech_zhy.service.impl;

import com.zhy.wetech_zhy.entity.User;
import com.zhy.wetech_zhy.mapper.UserMapper;
import com.zhy.wetech_zhy.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZHY
 * @since 2023-02-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {
        int result = userMapper.insert(user);
        return result>0;
    }
}
