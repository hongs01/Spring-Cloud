package com.lantaiyuan.microservice.svcb.controller;

import com.lantaiyuan.microservice.api.IPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Administrator$
 * @project: microservice$
 * @date: 2018/1/16$ 18:22$
 * @description:
 */
@RestController
public class PrintController {
    @Autowired
    IPrintService printService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return printService.print("server");
    }
}
