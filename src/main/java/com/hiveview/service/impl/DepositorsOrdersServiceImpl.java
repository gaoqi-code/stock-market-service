package com.hiveview.service.impl;

import com.hiveview.dao.DepositorsOrdersMapperDao;
import com.hiveview.dao.StockDataMapperDao;
import com.hiveview.entity.DepositorsOrders;
import com.hiveview.service.DepositorsOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author zhangsw
 * @create 2017-05-23 17:55
 */
@Service
public class DepositorsOrdersServiceImpl implements DepositorsOrdersService {
    @Autowired
    private DepositorsOrdersMapperDao depositorsOrdersMapperDao;
    @Override
    public void save(DepositorsOrders depositorsOrders) {
        depositorsOrdersMapperDao.save(depositorsOrders);
    }

    @Override
    public void update(DepositorsOrders depositorsOrders) {
        depositorsOrdersMapperDao.update(depositorsOrders);
    }
}
