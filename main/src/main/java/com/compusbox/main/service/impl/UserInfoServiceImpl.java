package com.compusbox.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.common.utils.Query;

import com.compusbox.main.dao.UserInfoDao;
import com.compusbox.main.entity.UserInfoEntity;
import com.compusbox.main.service.UserInfoService;


@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements UserInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserInfoEntity> page = this.page(
                new Query<UserInfoEntity>().getPage(params),
                new QueryWrapper<UserInfoEntity>()
        );

        return new PageUtils(page);
    }

}