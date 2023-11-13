package com.itheima.domain.query;

import com.itheima.domain.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserQuery extends User {
    private Integer age2;
}
