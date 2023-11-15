package com.campusbox.main.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.campusbox.main.entity.CampusRecruiteActivityEntity;
import com.campusbox.main.service.CampusRecruiteActivityService;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.R;



/**
 * 校招信息
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
@Api(tags = "校招信息")
@RestController
@RequestMapping("main/campusrecruiteactivity")
public class CampusRecruiteActivityController {
    @Autowired
    private CampusRecruiteActivityService campusRecruiteActivityService;

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("main:campusrecruiteactivity:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = campusRecruiteActivityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{campusRecruiteactivityId}")
    //@RequiresPermissions("main:campusrecruiteactivity:info")
    public R info(@PathVariable("campusRecruiteactivityId") Integer campusRecruiteactivityId){
		CampusRecruiteActivityEntity campusRecruiteActivity = campusRecruiteActivityService.getById(campusRecruiteactivityId);

        return R.ok().put("campusRecruiteActivity", campusRecruiteActivity);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("main:campusrecruiteactivity:save")
    public R save(@RequestBody CampusRecruiteActivityEntity campusRecruiteActivity){
		campusRecruiteActivityService.save(campusRecruiteActivity);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    //@RequiresPermissions("main:campusrecruiteactivity:update")
    public R update(@RequestBody CampusRecruiteActivityEntity campusRecruiteActivity){
		campusRecruiteActivityService.updateById(campusRecruiteActivity);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    //@RequiresPermissions("main:campusrecruiteactivity:delete")
    public R delete(@RequestBody Integer[] campusRecruiteactivityIds){
		campusRecruiteActivityService.removeByIds(Arrays.asList(campusRecruiteactivityIds));

        return R.ok();
    }

}
