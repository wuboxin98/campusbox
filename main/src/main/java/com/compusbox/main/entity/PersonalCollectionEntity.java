package com.compusbox.main.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 公司收藏表
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
@Data
@TableName("personal_collection")
public class PersonalCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 公司收藏id
	 */
	@TableId
	private Integer personalCollectionId;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 校招活动id
	 */
	private Integer compusRecruiteactivityId;
	/**
	 * 已投递
	 */
	private String hasDelivered;

}
