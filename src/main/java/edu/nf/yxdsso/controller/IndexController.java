package edu.nf.yxdsso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YXD
 * @date 2024/8/31
 */
@RestController
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
