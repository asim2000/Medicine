package com.company.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.company")
@EnableJpaRepositories(basePackages = "com.company.dao")
@EntityScan(basePackages = "com.company.entity")
public class AppConfig {
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/health?createDatabaseIfNotExist=true"); // Veritabanı adını ve diğer bağlantı parametrelerini güncelleyin
//        dataSource.setUsername("root");
//        dataSource.setPassword("qwe!23");
//        return dataSource;
//    }
@Bean
public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
    dataSource.setUsername("MEDICINE");
    dataSource.setPassword("medicine123");
    return dataSource;
}
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);

        return transactionManager;
    }
   
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setPackagesToScan("com.company.entity"); // Package containing your JPA entities

        JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);

        Properties jpaProperties = new Properties();
        jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect"); // Oracle 12c dialect
        jpaProperties.setProperty("hibernate.hbm2ddl.auto", "update"); // DDL strategy
        jpaProperties.setProperty("hibernate.show_sql", "true"); // Show SQL in logs
//        jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//        jpaProperties.setProperty("hibernate.show_sql", "true");
//        jpaProperties.setProperty("hibernate.format_sql", "true"); // Set to true for debugging
//        jpaProperties.setProperty("hibernate.hbm2ddl.auto","update");
        entityManagerFactory.setJpaProperties(jpaProperties);
        return entityManagerFactory;
    }
}

