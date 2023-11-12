package com.compusbox.main.dao;

import com.compusbox.main.entity.UserInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息表
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
@Mapper
public interface UserInfoDao extends BaseMapper<UserInfoEntity> {
	
}
