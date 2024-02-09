package com.campusbox.main.exception;


import com.campusbox.common.utils.R;
import com.campusbox.exception.BizCodeEnume;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * ClassName: GulimallExceptionControllerAdvice
 * Package: com.atguigu.gulimall.product.exception
 *
 * @Author boxin
 * @Create 2023/8/16 23:32
 * @Version 1.0
 * @Description:
 */
@RestControllerAdvice
public class CbxExceptionControllerAdvice {

    @ExceptionHandler(value = Throwable.class)
    public R exceptionHandler(Throwable throwable) {
        System.out.println(throwable.toString());
        return R.error(BizCodeEnume.UNKOWN_EXCEPTION.getCode(), BizCodeEnume.UNKOWN_EXCEPTION.getMsg());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R validateExceptionHandler(MethodArgumentNotValidException exception) {

        HashMap<String, String> map = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach((item) -> {
            String message = item.getDefaultMessage();
            String field = item.getField();
            map.put(field, message);
        });
        return R.error(BizCodeEnume.VALIDATE_EXCEPTION.getCode(), BizCodeEnume.VALIDATE_EXCEPTION.getMsg()).put("data", map);
    }
}
