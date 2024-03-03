//package com.semi.wdms.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan("com.semi.wdms.user.admin.service.dao")
//public class MybatisConfig {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
//        sqlSessionFactoryBean.setMapperLocations(new
//                PathMatchingResourcePatternResolver().getResources("classpath:com/semi/wdms/user/admin/mapper/*.xml"));
//        // 매퍼파일과 연결
//
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//
//
//    // 스프링에서 트랜잭션 관리
//    @Bean
//    public PlatformTransactionManager transactionManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
//
///*
//SqlSessionFactory
//- 데이터베이스 연결 및 SQL 실행관리
//- 스프링부트, 마이바티스 연동 시 SqlSessionFactory를 빈으로 등록
//
//SqlSessionTemplate
//- mybaits에서 제공하는 sqlsession인터페이스 구현체
//- sql 실행 및 트랜잭션 관리 담당
// */