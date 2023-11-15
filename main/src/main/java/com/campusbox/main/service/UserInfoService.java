package com.campusbox.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.main.entity.UserInfoEntity;

import java.util.Map;

/**
 * 用户信息表
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
public interface UserInfoService extends IService<UserInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

