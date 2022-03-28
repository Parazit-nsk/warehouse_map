package sk.fulfillment.warehouseMap.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sk.fulfillment.warehouseMap.dao.ShopDao;
import sk.fulfillment.warehouseMap.domain.Shop;

import java.util.List;

@Repository
public class ShopDaoImpl implements ShopDao {
    private final JdbcTemplate jdbcTemplate;
    private final String SQL_FIND_ALL = "SELECT * FROM shops s ORDER BY s.abbreviation";

    @Autowired
    public ShopDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Shop> findAll() {
        return jdbcTemplate.query(SQL_FIND_ALL, MAPPER);
    }
}
