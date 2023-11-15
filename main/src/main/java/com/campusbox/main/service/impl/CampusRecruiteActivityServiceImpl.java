package com.campusbox.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.Query;

import com.campusbox.main.dao.CampusRecruiteActivityDao;
import com.campusbox.main.entity.CampusRecruiteActivityEntity;
import com.campusbox.main.service.CampusRecruiteActivityService;


@Service("campusRecruiteActivityService")
public class CampusRecruiteActivityServiceImpl extends ServiceImpl<CampusRecruiteActivityDao, CampusRecruiteActivityEntity> implements CampusRecruiteActivityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CampusRecruiteActivityEntity> page = this.page(
                new Query<CampusRecruiteActivityEntity>().getPage(params),
                new QueryWrapper<CampusRecruiteActivityEntity>()
        );

        return new PageUtils(page);
    }

}