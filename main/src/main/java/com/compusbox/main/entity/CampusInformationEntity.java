package com.compusbox.main.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户校园信息
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
@Data
@TableName("campus_information")
public class CampusInformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 校园信息
	 */
	@TableId
	private Integer campusInformationId;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 学校
	 */
	private String shool;
	/**
	 * 专业
	 */
	private String major;
	/**
	 * 研究方向
	 */
	private String researchDirection;
	/**
	 * 实验室信息
	 */
	private String lab;
	/**
	 * 是否认证
	 */
	private String isAuthentication;
	/**
	 * 认证材料文件连接
	 */
	private String certificationmaterial;
	/**
	 * 学历
	 */
	private String educationalBackground;
	/**
	 * 导师信息
	 */
	private String supervisor;
	/**
	 * 入学日期
	 */
	private Date entryTime;
	/**
	 * 毕业日期
	 */
	private Date graduateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
