package com.zhy.wetech_zhy.mapper;

import com.zhy.wetech_zhy.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ZHY
 * @since 2023-02-08
 */

@MapperScan
@Repository
public interface UserMapper extends BaseMapper<User> {

}
