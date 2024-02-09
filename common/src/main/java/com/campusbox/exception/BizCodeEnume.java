package com.campusbox.exception;

/**
 * ClassName: BizCodeEnum
 * Package: com.atguigu.common.exception
 *
 * @Author boxin
 * @Create 2023/8/16 23:35
 * @Version 1.0
 * @Description:
 */
public enum BizCodeEnume {
    UNKOWN_EXCEPTION(100, "未知异常"),
    VALIDATE_EXCEPTION(101,"数据校验异常"),
    TO_MANY_REQUEST(102,"请求流量过大，请稍后再试"),
    LOGINACCT_PASSWORD_EXCEPTION(153,"账号或密码错误"),;

    private Integer code;
    private String msg;

    BizCodeEnume(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
