package edu.nf.yxdsso.advice;

import edu.nf.yxdsso.exception.AccessException;
import edu.nf.yxdsso.vo.ResultVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author YXD
 * @date 2024/8/31
 */
@RestControllerAdvice({"edu.nf.yxdsso.controller"})
public class ControllerAspect {
    @ExceptionHandler(AccessException.class)
    public ResultVO handleDataAccessException(AccessException e) {
        ResultVO vo = new ResultVO();
        vo.setMessage(e.getMessage());
        vo.setCode(500);
        return vo;
    }
}
