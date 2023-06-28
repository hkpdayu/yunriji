package com.lezijie.note.vo;

import lombok.Getter;
import lombok.Setter;

/**
 *
 *消息模型
 * 状态码  1=成功   0=失败
 * 提示消息
 * 返回对象
 */
@Getter
@Setter
public class ResultInfo<T> {
    private Integer code;//状态码，1=成功 0 =失败
    private String msg;//提示信息
    private T result;//返回对象（字符串，JavaBean，集合，Map）
}
