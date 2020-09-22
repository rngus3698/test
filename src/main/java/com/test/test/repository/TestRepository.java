package com.test.test.repository;

import com.test.test.domain.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public Menu getDual() {

        return sqlSessionTemplate.selectOne("getDual");
    }
}
