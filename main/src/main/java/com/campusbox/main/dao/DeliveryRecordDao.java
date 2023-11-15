package com.campusbox.main.dao;

import com.campusbox.main.entity.DeliveryRecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 投递记录状态
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
@Mapper
public interface DeliveryRecordDao extends BaseMapper<DeliveryRecordEntity> {
	
}
