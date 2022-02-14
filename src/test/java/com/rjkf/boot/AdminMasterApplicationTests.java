package com.rjkf.boot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
@Slf4j
class AdminMasterApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(1) from course", Long.class);
        log.info(String.valueOf(dataSource.getClass()));
        log.info("从数据库查询出来的记录数量为：" + aLong);
    }

}
