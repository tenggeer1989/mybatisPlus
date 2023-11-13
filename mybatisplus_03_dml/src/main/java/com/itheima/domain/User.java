package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
//テーブル名のマッピング関係を設定する
//@TableName("tbl_user")
public class User {
    //主キー生成戦略の設定
    //@TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    @TableField(value = "pwd",select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;
    //@TableLogic(value = "0" ,delval = "1")
    private Integer deleted;
    @Version
    private Integer version;
}















