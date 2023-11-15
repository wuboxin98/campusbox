package com.campusbox.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.Query;

import com.campusbox.main.dao.DeliveryRecordDao;
import com.campusbox.main.entity.DeliveryRecordEntity;
import com.campusbox.main.service.DeliveryRecordService;


@Service("deliveryRecordService")
public class DeliveryRecordServiceImpl extends ServiceImpl<DeliveryRecordDao, DeliveryRecordEntity> implements DeliveryRecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeliveryRecordEntity> page = this.page(
                new Query<DeliveryRecordEntity>().getPage(params),
                new QueryWrapper<DeliveryRecordEntity>()
        );

        return new PageUtils(page);
    }

}