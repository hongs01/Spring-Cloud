package com.lantaiyuan.microservice.svca;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lantaiyuan.microservice.api.IPrintService;
import org.springframework.stereotype.Component;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@Component
public class PrintClient {
    @Reference(version = "1.0.0")
    public IPrintService printService;
}
