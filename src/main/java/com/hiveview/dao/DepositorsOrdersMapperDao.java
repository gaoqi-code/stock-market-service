package com.hiveview.dao;

import com.hiveview.entity.DepositorsOrders;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositorsOrdersMapperDao {

    int save(DepositorsOrders record);

    int update(DepositorsOrders record);

    DepositorsOrders selectByPrimaryKey(Integer id);

    DepositorsOrders selectByUserId(Integer userId);

}