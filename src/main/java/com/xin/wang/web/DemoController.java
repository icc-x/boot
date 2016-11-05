package com.xin.wang.web;

import com.github.pagehelper.PageHelper;
import com.xin.wang.mapper.CustomMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xin.wang on 2016/11/5.
 * 测试
 */
@RestController
@RequestMapping(value="/demo")
public class DemoController {

    @Resource
    private CustomMapper mapper;

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    @Transactional(isolation = Isolation.READ_COMMITTED)
    @ApiOperation(value="获取B1补退列表")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public Object index() {
        PageHelper.startPage(1,10);
        return mapper.getPurchaseList();
    }

    @ApiOperation(value="测试redis取值")
    @RequestMapping(value = "/redis",method = RequestMethod.GET)
    public String redisTest(){
        return stringRedisTemplate.opsForValue().get("ERPUser_10002005");
    }
}
