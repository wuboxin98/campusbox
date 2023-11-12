package com.compusbox.main.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.compusbox.main.entity.CompusRecruiteActivityEntity;
import com.compusbox.main.service.CompusRecruiteActivityService;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.common.utils.R;



/**
 * 校招信息
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
@RestController
@RequestMapping("main/compusrecruiteactivity")
public class CompusRecruiteActivityController {
    @Autowired
    private CompusRecruiteActivityService compusRecruiteActivityService;

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("main:compusrecruiteactivity:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = compusRecruiteActivityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{compusRecruiteactivityId}")
    //@RequiresPermissions("main:compusrecruiteactivity:info")
    public R info(@PathVariable("compusRecruiteactivityId") Integer compusRecruiteactivityId){
		CompusRecruiteActivityEntity compusRecruiteActivity = compusRecruiteActivityService.getById(compusRecruiteactivityId);

        return R.ok().put("compusRecruiteActivity", compusRecruiteActivity);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("main:compusrecruiteactivity:save")
    public R save(@RequestBody CompusRecruiteActivityEntity compusRecruiteActivity){
		compusRecruiteActivityService.save(compusRecruiteActivity);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    //@RequiresPermissions("main:compusrecruiteactivity:update")
    public R update(@RequestBody CompusRecruiteActivityEntity compusRecruiteActivity){
		compusRecruiteActivityService.updateById(compusRecruiteActivity);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    //@RequiresPermissions("main:compusrecruiteactivity:delete")
    public R delete(@RequestBody Integer[] compusRecruiteactivityIds){
		compusRecruiteActivityService.removeByIds(Arrays.asList(compusRecruiteactivityIds));

        return R.ok();
    }

}
