package com.campusbox.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.main.entity.PersonalCollectionEntity;

import java.util.Map;

/**
 * 公司收藏表
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
public interface PersonalCollectionService extends IService<PersonalCollectionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

