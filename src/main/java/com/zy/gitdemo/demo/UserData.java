package com.zy.gitdemo.demo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class UserData {

    @ExcelProperty(value = "姓名",index = 1)
    private String name;
    @ExcelProperty(value = "性别",index = 2)
    private String  gender;
    @ExcelProperty(value = "年龄",index = 3)
    private int age;

}
