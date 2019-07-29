package com.zhangyaotong.exception;

/**
 * @author ZhangYaotong
 * @date 2019/07/29
 *
 * 重复预约异常
 */
public class RepeatAppointException extends RuntimeException{

    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
