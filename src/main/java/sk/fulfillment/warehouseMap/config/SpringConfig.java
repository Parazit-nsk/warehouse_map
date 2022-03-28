package sk.fulfillment.warehouseMap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import sk.fulfillment.warehouseMap.dao.ShopDao;
import sk.fulfillment.warehouseMap.dao.impl.ShopDaoImpl;
import sk.fulfillment.warehouseMap.service.ShopService;
import sk.fulfillment.warehouseMap.service.impl.ShopServiceImpl;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:warehouse.properties")
public class SpringConfig {

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("${db.driver}");
        dataSource.setUrl("${db.url}");
        dataSource.setUsername("${db.user}");
        dataSource.setPassword("${db.password}");
        return dataSource;
    }

    @Bean
    public ShopDao shopDao() {
        return new ShopDaoImpl(jdbcTemplate());
    }

    @Bean
    public ShopService shopService() {
        return new ShopServiceImpl();
    }
}
