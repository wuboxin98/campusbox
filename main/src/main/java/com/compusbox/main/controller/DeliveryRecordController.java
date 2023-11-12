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


import com.compusbox.main.entity.DeliveryRecordEntity;
import com.compusbox.main.service.DeliveryRecordService;
import com.compusbox.common.utils.PageUtils;
import com.compusbox.common.utils.R;



/**
 * 投递记录状态
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-12 15:36:16
 */
@RestController
@RequestMapping("main/deliveryrecord")
public class DeliveryRecordController {
    @Autowired
    private DeliveryRecordService deliveryRecordService;

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("main:deliveryrecord:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deliveryRecordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{deliveryRecordId}")
    //@RequiresPermissions("main:deliveryrecord:info")
    public R info(@PathVariable("deliveryRecordId") Integer deliveryRecordId){
		DeliveryRecordEntity deliveryRecord = deliveryRecordService.getById(deliveryRecordId);

        return R.ok().put("deliveryRecord", deliveryRecord);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("main:deliveryrecord:save")
    public R save(@RequestBody DeliveryRecordEntity deliveryRecord){
		deliveryRecordService.save(deliveryRecord);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    //@RequiresPermissions("main:deliveryrecord:update")
    public R update(@RequestBody DeliveryRecordEntity deliveryRecord){
		deliveryRecordService.updateById(deliveryRecord);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    //@RequiresPermissions("main:deliveryrecord:delete")
    public R delete(@RequestBody Integer[] deliveryRecordIds){
		deliveryRecordService.removeByIds(Arrays.asList(deliveryRecordIds));

        return R.ok();
    }

}
