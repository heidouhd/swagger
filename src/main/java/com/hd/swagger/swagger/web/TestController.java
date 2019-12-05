package com.hd.swagger.swagger.web;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.hd.swagger.swagger.domain.UserInfo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;


@Api(tags = "测试类")
@RestController
@RequestMapping("/test")
public class TestController {

    @NacosValue(value = "${name:a}", autoRefreshed = true)
    private String name;

    @NacosValue(value = "${userId:0}", autoRefreshed = true)
    private int userId;

    @ApiOperation(value = "查询用户信息",notes = "测试nacos")
    @ApiImplicitParam(name = "userId",value = "用户ID",required = true)
    @PostMapping("/getUser")
    public String getUser(String userId){
        System.out.println("username:"+name+" userId:"+userId);
        return "username:"+name+" userId:"+userId;
    }

    @ApiOperation(value = "通过用户ID查询用户信息",notes = "测试nacos")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "用户ID",required = true),
            @ApiImplicitParam(name = "age",value = "用户年龄",required = false)
    })
    @GetMapping("/getUserById")
    public String getUserById(String userId,int age){
        System.out.println("username:"+name+" userId:"+userId);
        return "username:"+name+" userId:"+userId;
    }

    @ApiOperation(value = "通过用户信息查找",notes = "测试")
    @PostMapping("/getUserByUser")
    public String getUserByUser(@RequestBody @ApiParam(name = "user",value = "用户对象",required = true) UserInfo user, @RequestParam(required = false) @ApiParam(name = "age",value = "用户年龄") int age){
        System.out.println("username:"+name+" userId:"+userId);
        return "username:"+name+" userId:"+userId;
    }
}
