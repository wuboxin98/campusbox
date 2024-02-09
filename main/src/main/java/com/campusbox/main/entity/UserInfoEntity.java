package com.campusbox.main.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户信息表
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
@Data
@TableName("user_info")
public class UserInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId
	private Integer userId;
	/**
	 * 用户名
	 */
	private String userAme;
	/**
	 * 密码
	 */
	private String userPasswd;
	/**
	 * 手机号
	 */
	private String userPhone;
	/**
	 * 邮箱
	 */
	private String userEmail;
	/**
	 * 性别
	 */
	private String userSex;
	/**
	 * 日期
	 */
	private String userBirthday;
	/**
	 * 头像
	 */
	private String userAvatar;
	/**
	 * 签名
	 */
	private String userSignature;
	/**
	 * 邀请码
	 */
	private String userInvitationCode;
	/**
	 * 注册码
	 */
	private String userRegistrationInvitationCode;
	/**
	 * 创建时间
	 */
	private Date creationTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
