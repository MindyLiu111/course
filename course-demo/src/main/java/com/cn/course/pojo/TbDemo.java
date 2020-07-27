package com.cn.course.pojo;


import lombok.Data;

import javax.persistence.Table;

@Table(name = "tb_demo")
@Data
public class TbDemo {

    private Integer id;
    private String name;

}
