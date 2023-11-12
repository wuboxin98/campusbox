package com.compusbox.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.main.entity.DeliveryRecordEntity;

import java.util.Map;

/**
 * 投递记录状态
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
public interface DeliveryRecordService extends IService<DeliveryRecordEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

