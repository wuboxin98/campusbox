package com.campusbox.main.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.campusbox.main.entity.UserInfoEntity;
import com.campusbox.main.service.UserInfoService;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.R;



/**
 * 用户信息表
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("main/userinfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 列表
     */
    @ApiOperation("用户列表")
    @GetMapping("/list")
    //@RequiresPermissions("main:userinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{userId}")
    //@RequiresPermissions("main:userinfo:info")
    public R info(@PathVariable("userId") Integer userId){
		UserInfoEntity userInfo = userInfoService.getById(userId);

        return R.ok().put("userInfo", userInfo);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("main:userinfo:save")
    public R save(@RequestBody UserInfoEntity userInfo){
		userInfoService.save(userInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    //@RequiresPermissions("main:userinfo:update")
    public R update(@RequestBody UserInfoEntity userInfo){
		userInfoService.updateById(userInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    //@RequiresPermissions("main:userinfo:delete")
    public R delete(@RequestBody Integer[] userIds){
		userInfoService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
