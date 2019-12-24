package com.example.demo.web.controller;

import com.example.demo.util.Message;
import com.example.demo.util.MessageUtil;
import com.example.demo.util.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class StudentController {
    @GetMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message add(Student student){

        return MessageUtil.success("添加成功");
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParam(name = "stuId",value = "学号",paramType = "query",dataType = "int")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuId",value = "学号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "stuName",value = "姓名",paramType = "query",dataType = "String")
    })
    public Message delete(int stuId,String stuName){
        return MessageUtil.success("学生删除完成") ;
    }
    @GetMapping("/modify")
    public String modify(){
        return "学生信息修改完成";
    }
    @GetMapping("/read")
    public String read(){
        return "学生信息查询完成";
    }
}
