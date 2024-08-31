package edu.nf.yxdsso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YXD
 * @date 2024/8/31
 */
@RestController
@RequestMapping("/public")
public class PublicController {
    @GetMapping("/checkHearBeat")
    public String index() {
        return "alive...";
    }
}
