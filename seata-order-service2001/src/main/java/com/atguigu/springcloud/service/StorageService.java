package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Yue_
 * @create 2020-12-01-17:06
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decreaseStroage(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
