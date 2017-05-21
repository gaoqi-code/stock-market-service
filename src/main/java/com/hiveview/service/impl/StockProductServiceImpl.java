package com.hiveview.service.impl;

import com.hiveview.dao.StockProductMapperDao;
import com.hiveview.entity.StockProduct;
import com.hiveview.service.StockProductService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangsw on 2017/5/21.
 */
public class StockProductServiceImpl implements StockProductService {
    @Autowired
    private StockProductMapperDao stockProductMapperDao;

    @Override
    public StockProduct getProuctByType(String type) {
        return stockProductMapperDao.getProuctByType(type);
    }
}
