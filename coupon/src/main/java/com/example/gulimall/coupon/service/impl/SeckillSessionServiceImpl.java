package com.example.gulimall.coupon.service.impl;

import com.example.common.utils.PageUtils;
import com.example.common.utils.Query;
import com.example.gulimall.coupon.dao.SeckillSessionDao;
import com.example.gulimall.coupon.entity.SeckillSessionEntity;
import com.example.gulimall.coupon.service.SeckillSessionService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionDao, SeckillSessionEntity> implements SeckillSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSessionEntity> page = this.page(
                new Query<SeckillSessionEntity>().getPage(params),
                new QueryWrapper<SeckillSessionEntity>()
        );

        return new PageUtils(page);
    }

}