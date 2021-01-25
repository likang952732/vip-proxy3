package com.example.vipproxy3;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 @Description
 *@author kang.li
 *@date 2021/1/22 10:33   
 */
@Mapper
public interface TestMapper {
    public void insert(@Param("name")String name);

    public List<TestModel> getAll();
}
