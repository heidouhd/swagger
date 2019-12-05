# swagger
该项目主要是spring boot 整合 swagger 并顺便整合了 nacos
整合swagger 主要逻辑如下：

1.pom文件引入:

        <dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
		</dependency>
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        
2.代码添加：
    1)代码再 SwaggerConfig 中 
    2)SwaggerApplication 中添加注释EnableSwagger2
    
3.常用注解说明
    
    1)@Api()：作用于类上，表示这个类是swagger的资源
    tags = ”说明该类的作用“
    
    2)@ApiOperation()：用在请求的方法上，说明的方法的用户和作用
    value=“说明方法的用途、作用”
    notes="方法的备注说明“
    
    3)@ApiImplicitParams()：用在请求的方法上，表示一组参数说明，可以包含多个@ApiImplicitParam()
    
    4)@ApiImplicitParam()：指定一个请求参数的各个方面
    name：参数名
    value：参数的汉字说明
    required：参数是否必须传
    dataType：参数类型
    defaultValue：参数的默认值
    
    5)@ApiParam()用于方法，参数，字段说明； 
      表示对参数的添加元数据（说明或是否必填等） 
    
    6)@ApiResponses()：用在请求的方法上，表示一组响应。可以包含多个@ApiResponse()
    
    7)@ApiResponse()：用于表示一个错误的响应信息
    code：数字
    message：信息
    response：抛出异常的类
    
    8)@ApiModel()：用在响应类上，表示一个返回响应数据的信息。
    
    9)@ApiModelProperty()：用在属性上，描述响应类的属性

