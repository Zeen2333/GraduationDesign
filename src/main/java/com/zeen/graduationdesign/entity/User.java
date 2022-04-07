package com.zeen.graduationdesign.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {

    private int id;
    private String name;
    private String phone;
    private String email;
    private String aboutme;
    private String password;
    private String avatar;
    private boolean type;
    private Date createTime;
    private boolean enable;
    private int agencyId;

}
