package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//lombok
@Data
@Setter
@Getter
public class User {
    private String name;
    private Integer age;
    private Integer gender;
    private String phone;
}
