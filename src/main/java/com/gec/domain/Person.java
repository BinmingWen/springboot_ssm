package com.gec.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : Person  //类名
 * @date 2020/10/21 15:42
 */
@Data
@Accessors(chain = true)
public class Person {
    private String name;
    private String phone;
    private String email;
    private String address;
}
