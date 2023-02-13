package com.zhy.wetech_zhy.service.impl;

import com.zhy.wetech_zhy.entity.KoJinJoHoZhy;
import com.zhy.wetech_zhy.mapper.KoJinJoHoZhyMapper;
import com.zhy.wetech_zhy.service.KoJinJoHoZhyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZHY
 * @since 2023-02-12
 */
@Service
public class KoJinJoHoZhyServiceImpl implements KoJinJoHoZhyService {

    @Autowired
    private KoJinJoHoZhyMapper koJinJoHoZhyMapper;
    @Override
    public int save(KoJinJoHoZhy koJinJoHoZhy) {
        return koJinJoHoZhyMapper.save(koJinJoHoZhy);
    }
}
