package com.campusbox.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.Query;

import com.campusbox.main.dao.CampusInformationDao;
import com.campusbox.main.entity.CampusInformationEntity;
import com.campusbox.main.service.CampusInformationService;


@Service("campusInformationService")
public class CampusInformationServiceImpl extends ServiceImpl<CampusInformationDao, CampusInformationEntity> implements CampusInformationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CampusInformationEntity> page = this.page(
                new Query<CampusInformationEntity>().getPage(params),
                new QueryWrapper<CampusInformationEntity>()
        );

        return new PageUtils(page);
    }

}