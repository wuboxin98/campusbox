package com.compusbox.main.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 投递记录状态
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
@Data
@TableName("delivery_record")
public class DeliveryRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 投递记录id
	 */
	@TableId
	private Integer deliveryRecordId;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 校招活动id
	 */
	private Integer activityId;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 投递状态
	 */
	private String deliveryStatus;
	/**
	 * 投递时间
	 */
	private Date deliveryTime;
	/**
	 * 
	 */
	private String deliveryRecordcol;
	/**
	 * 岗位名
	 */
	private String postName;
	/**
	 * 公司名
	 */
	private String companyName;
	/**
	 * 工作地点
	 */
	private String workPlace;
	/**
	 * 投递链接
	 */
	private String postUrl;
	/**
	 * 工作职责
	 */
	private String recruitmentResponsibility;
	/**
	 * 岗位要求
	 */
	private String jobRequirement;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
