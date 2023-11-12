package com.compusbox.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.main.entity.CompusRecruiteActivityEntity;

import java.util.Map;

/**
 * 校招信息
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
public interface CompusRecruiteActivityService extends IService<CompusRecruiteActivityEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

