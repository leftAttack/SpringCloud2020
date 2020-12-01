package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Yue_
 * @create 2020-12-01-17:06
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decreaseAccount(@Param("productId") Long productId, @Param("count") Integer count);
}
