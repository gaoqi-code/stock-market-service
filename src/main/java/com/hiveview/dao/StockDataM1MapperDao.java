package com.hiveview.dao;

import com.hiveview.entity.StockData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockDataM1MapperDao {
    int deleteByPrimaryKey(Integer id);

    //int insert(StockData record);

    /**
     * 查询最近两小时数据
     */
    List<StockData> selectOneHour();

    /**
     * 查询最新数据
     */
    StockData selectOneFreshData();


   // int updateByPrimaryKey(StockData record);
}