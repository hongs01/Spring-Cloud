package com.lantaiyuan.microservice.svcb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lantaiyuan.microservice.api.IPrintService;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@org.springframework.stereotype.Service
@Service(version = "1.0.0")
public class PrintServerImpl implements IPrintService {
    @Override
    public String print(String str) {
        System.out.println(str);
        return str+" from server";
    }
}
