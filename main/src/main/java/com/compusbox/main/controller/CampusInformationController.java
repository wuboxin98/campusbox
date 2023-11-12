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


import com.compusbox.main.entity.CampusInformationEntity;
import com.compusbox.main.service.CampusInformationService;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.common.utils.R;



/**
 * 用户校园信息
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
@RestController
@RequestMapping("main/campusinformation")
public class CampusInformationController {
    @Autowired
    private CampusInformationService campusInformationService;

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("main:campusinformation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = campusInformationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{campusInformationId}")
    //@RequiresPermissions("main:campusinformation:info")
    public R info(@PathVariable("campusInformationId") Integer campusInformationId){
		CampusInformationEntity campusInformation = campusInformationService.getById(campusInformationId);

        return R.ok().put("campusInformation", campusInformation);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("main:campusinformation:save")
    public R save(@RequestBody CampusInformationEntity campusInformation){
		campusInformationService.save(campusInformation);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    //@RequiresPermissions("main:campusinformation:update")
    public R update(@RequestBody CampusInformationEntity campusInformation){
		campusInformationService.updateById(campusInformation);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    //@RequiresPermissions("main:campusinformation:delete")
    public R delete(@RequestBody Integer[] campusInformationIds){
		campusInformationService.removeByIds(Arrays.asList(campusInformationIds));

        return R.ok();
    }

}
