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


import com.campusbox.main.entity.PersonalCollectionEntity;
import com.campusbox.main.service.PersonalCollectionService;
import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.R;



/**
 * 公司收藏表
 *
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-11-15 16:23:15
 */
@Api(tags = "个人收藏公司")
@RestController
@RequestMapping("main/personalcollection")
public class PersonalCollectionController {
    @Autowired
    private PersonalCollectionService personalCollectionService;

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("main:personalcollection:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = personalCollectionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{personalCollectionId}")
    //@RequiresPermissions("main:personalcollection:info")
    public R info(@PathVariable("personalCollectionId") Integer personalCollectionId){
		PersonalCollectionEntity personalCollection = personalCollectionService.getById(personalCollectionId);

        return R.ok().put("personalCollection", personalCollection);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("main:personalcollection:save")
    public R save(@RequestBody PersonalCollectionEntity personalCollection){
		personalCollectionService.save(personalCollection);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    //@RequiresPermissions("main:personalcollection:update")
    public R update(@RequestBody PersonalCollectionEntity personalCollection){
		personalCollectionService.updateById(personalCollection);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    //@RequiresPermissions("main:personalcollection:delete")
    public R delete(@RequestBody Integer[] personalCollectionIds){
		personalCollectionService.removeByIds(Arrays.asList(personalCollectionIds));

        return R.ok();
    }

}
