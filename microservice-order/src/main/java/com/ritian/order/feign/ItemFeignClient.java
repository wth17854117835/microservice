package com.ritian.order.feign;

import com.ritian.order.entity.Item;
import com.ritian.order.fallback.ItemServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: wangth_oup
 * @date: 2020-04-16 11:19
 * @description: 申明这是一个Feign客户端，并且指明服务id
 * 实际开发中ItemFeignClient一般直接继承(extends)服务提供方的接口以避免代码重复（例如Item工程会以jar包的形式提供ItemService接口）
 **/
@FeignClient(value = "app-item",fallback = ItemServiceFallback.class)
@Service
public interface ItemFeignClient {

    /**
     * 这里定义了类似于SpringMVC用法的方法，就可以进行RESTful方式的调用了
     * @param id
     * @return
     * 通过@PathVariable，例如/item/1
     * 通过@RequestParam，例如item?id=1
     */
    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    Item queryItemById(@PathVariable("id") Long id);
}
