package com.zhangyaotong.exception;

/**
 * @author ZhangYaotong
 * @date 2019/07/29
 *
 * 预约业务异常
 */
public class AppointException extends RuntimeException{

    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
