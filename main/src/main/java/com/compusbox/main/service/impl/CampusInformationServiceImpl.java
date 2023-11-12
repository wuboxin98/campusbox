package com.compusbox.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.common.utils.Query;

import com.compusbox.main.dao.CampusInformationDao;
import com.compusbox.main.entity.CampusInformationEntity;
import com.compusbox.main.service.CampusInformationService;


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