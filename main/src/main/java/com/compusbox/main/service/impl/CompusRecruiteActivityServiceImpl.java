package com.compusbox.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.common.utils.Query;

import com.compusbox.main.dao.CompusRecruiteActivityDao;
import com.compusbox.main.entity.CompusRecruiteActivityEntity;
import com.compusbox.main.service.CompusRecruiteActivityService;


@Service("compusRecruiteActivityService")
public class CompusRecruiteActivityServiceImpl extends ServiceImpl<CompusRecruiteActivityDao, CompusRecruiteActivityEntity> implements CompusRecruiteActivityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CompusRecruiteActivityEntity> page = this.page(
                new Query<CompusRecruiteActivityEntity>().getPage(params),
                new QueryWrapper<CompusRecruiteActivityEntity>()
        );

        return new PageUtils(page);
    }

}