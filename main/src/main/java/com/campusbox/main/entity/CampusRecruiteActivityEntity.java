package com.campusbox.main.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 校招信息
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
@Data
@TableName("campus_recruite_activity")
public class CampusRecruiteActivityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 校招活动id
	 */
	@TableId
	private Integer campusRecruiteactivityId;
	/**
	 * 校招公司id
	 */
	private Integer campusCompanyId;
	/**
	 * 公司名
	 */
	private String companyName;
	/**
	 * 公司官网
	 */
	private String companyUrl;
	/**
	 * 公司校招官网
	 */
	private String schoolRecruitmentUrl;
	/**
	 * 宣发链接：比如公众号的宣传链接
	 */
	private String publicizeDistributeUrl;
	/**
	 * 公司标签：互联网、游戏、银行、国企、外企、芯片、新能源
	 */
	private String companyLabel;
	/**
	 * 招聘岗位标签：JavaGoPythonC++、前端、后端、嵌入式
	 */
	private String jobTag;
	/**
	 * 校招活动类型：日常实习、暑期实习、秋招提前批、秋招、秋招补录、春招
	 */
	private String schoolRecruitmentType;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 校招年份（可以有多个，有些公司招往年生源）：2020，2023
	 */
	private String schoolRecruitmentYear;
	/**
	 * 校招活动的截至时间
	 */
	private Date endDate;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
