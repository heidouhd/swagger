package com.hd.swagger.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description="用户信息对象",value = "userInfo 用户信息对象")
@Data
public class UserInfo {

    @ApiModelProperty(name = "userId",value = "用户ID",required = true)
    private int userId;
    @ApiModelProperty(name = "userName",value = "用户姓名",required = true)
    private String userName;
    @ApiModelProperty(name = "age",value = "用户年龄",required = false)
    private int age;
}
