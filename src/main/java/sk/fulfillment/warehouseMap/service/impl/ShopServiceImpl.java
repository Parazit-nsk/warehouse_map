package sk.fulfillment.warehouseMap.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.fulfillment.warehouseMap.dao.ShopDao;
import sk.fulfillment.warehouseMap.domain.Shop;
import sk.fulfillment.warehouseMap.service.ShopService;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    Logger logger = Logger.getLogger(ShopServiceImpl.class);
    @Autowired
    public ShopDao dao;

    @Override
    public List<Shop> findAll() {
        return dao.findAll();
    }
}
