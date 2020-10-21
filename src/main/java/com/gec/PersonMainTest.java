package com.gec;

import com.gec.domain.Person;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : PersonMainTest  //类名
 * @date 2020/10/21 15:46
 */
public class PersonMainTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("老王")
        .setPhone("18027761141")
        .setAddress("广州天河")
        .setEmail("3186345427@qq.com");
        System.out.println(p);
    }
}
