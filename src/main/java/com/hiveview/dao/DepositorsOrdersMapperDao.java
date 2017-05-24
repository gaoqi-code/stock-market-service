package com.hiveview.dao;

import com.hiveview.entity.DepositorsOrders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepositorsOrdersMapperDao {

    int save(DepositorsOrders record);

    int update(DepositorsOrders record);

    DepositorsOrders selectByPrimaryKey(Integer id);

    List<DepositorsOrders> selectByUserId(Integer userId);

}