package cn.tll.mall01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author tll
 * @create 2020/10/14 16:09
 * Mybatis配置类
 */
@Configuration
@MapperScan("cn.tll.mall01.mbg.mapper")
public class MyBatisConfig {

}
