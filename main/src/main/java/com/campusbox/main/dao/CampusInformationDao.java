package com.campusbox.main.dao;

import com.campusbox.main.entity.CampusInformationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户校园信息
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
@Mapper
public interface CampusInformationDao extends BaseMapper<CampusInformationEntity> {
	
}
