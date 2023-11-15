package com.campusbox.main.web;

import com.campusbox.common.utils.PageUtils;
import com.campusbox.common.utils.R;
import com.campusbox.main.entity.CampusInformationEntity;
import com.campusbox.main.vo.LoginFormVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ClassName: LoginController
 * Package: com.campusbox.main.web
 *
 * @Author boxin
 * @Create 2023/11/15 17:15
 * @Version 1.0
 * @Description:
 */

@Api("登录、退出接口")
@RestController
public class LoginController {

    @PostMapping("/login")
    //@RequiresPermissions("main:campusinformation:update")
    public R update(@RequestBody LoginFormVo loginFormVo){


        return R.ok();
    }
}
