package com.hiveview.dao;

import com.hiveview.entity.StockRevenueModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRevenueModelMapperDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StockRevenueModel record);

    int insertSelective(StockRevenueModel record);

    StockRevenueModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StockRevenueModel record);

    int updateByPrimaryKey(StockRevenueModel record);
    List<StockRevenueModel>  getModels();
}