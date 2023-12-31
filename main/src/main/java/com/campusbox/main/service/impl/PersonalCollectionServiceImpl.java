package com.campusbox.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.Query;

import com.campusbox.main.dao.PersonalCollectionDao;
import com.campusbox.main.entity.PersonalCollectionEntity;
import com.campusbox.main.service.PersonalCollectionService;


@Service("personalCollectionService")
public class PersonalCollectionServiceImpl extends ServiceImpl<PersonalCollectionDao, PersonalCollectionEntity> implements PersonalCollectionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PersonalCollectionEntity> page = this.page(
                new Query<PersonalCollectionEntity>().getPage(params),
                new QueryWrapper<PersonalCollectionEntity>()
        );

        return new PageUtils(page);
    }

}