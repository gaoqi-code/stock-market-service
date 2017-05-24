package com.hiveview.service;

import com.hiveview.entity.DepositorsOrders;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zhangsw
 * @create 2017-05-23 17:54
 */
public interface DepositorsOrdersService {
    public void save(DepositorsOrders depositorsOrders);

    public void update(DepositorsOrders depositorsOrders);

    public List<DepositorsOrders> getDepositorsOrdersByUserId(int userId);

}
