package sk.fulfillment.warehouseMap.dao;

import org.springframework.jdbc.core.RowMapper;
import sk.fulfillment.warehouseMap.domain.Shop;

import java.sql.ResultSet;
import java.util.List;

public interface ShopDao {
    List<Shop> findAll();
    RowMapper<Shop> MAPPER = (ResultSet resultSet, int rowNum) -> {
        return new Shop(resultSet.getInt("id"),
                        resultSet.getString("abbreviation"),
                        resultSet.getString("name"),
                        resultSet.getString("shelving"),
                        resultSet.getString("zone"));
    };
}
