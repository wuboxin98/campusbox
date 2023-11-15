package com.campusbox.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.main.entity.DeliveryRecordEntity;

import java.util.Map;

/**
 * 投递记录状态
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
public interface DeliveryRecordService extends IService<DeliveryRecordEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

