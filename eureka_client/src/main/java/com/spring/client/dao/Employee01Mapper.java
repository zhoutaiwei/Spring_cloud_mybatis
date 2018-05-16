package com.spring.client.dao;

import com.spring.client.entities.Employee01;
import com.spring.client.entities.Employee01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Employee01Mapper {
    int countByExample(Employee01Example example);

    int deleteByExample(Employee01Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employee01 record);

    int insertSelective(Employee01 record);

    List<Employee01> selectByExample(Employee01Example example);

    Employee01 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employee01 record, @Param("example") Employee01Example example);

    int updateByExample(@Param("record") Employee01 record, @Param("example") Employee01Example example);

    int updateByPrimaryKeySelective(Employee01 record);

    int updateByPrimaryKey(Employee01 record);
}