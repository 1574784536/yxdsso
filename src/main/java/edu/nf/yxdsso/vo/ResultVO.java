package edu.nf.yxdsso.vo;

import lombok.Data;

/**
 * @author YXD
 * @date 2024/8/31
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private Object message;
    private T data;
}
