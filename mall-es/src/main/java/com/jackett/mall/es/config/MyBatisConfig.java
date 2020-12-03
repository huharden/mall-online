package com.jackett.mall.es.config;

import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.jackett.mall.mapper","com.jackett.mall.search.dao"})
public class MyBatisConfig {
}
