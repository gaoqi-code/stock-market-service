package com.hiveview.service;

import com.hiveview.entity.StockData;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zhangsw
 * @create 2017-05-14 11:48
 */
public interface StockDataService {
    /**
     * 分时线初始化数据
     */
    List<StockData> getInitDatasForM(int productId);

    /**
     * 1分钟K线初始化数据
     */
    List<StockData> getInitDatasForM1(int productId);

    /**
     * 5分钟K线初始化数据
     */
    List<StockData> getInitDatasForM5(int productId);

    /**
     * 15分钟K线初始化数据
     */
    List<StockData> getInitDatasForM15(int productId);

    /**
     * 查询分时线最新数据
     */
    StockData getOneFreshDataForM(int productId);

    /**
     * 查询1分钟最新数据
     */
    StockData getOneFreshDataForM1(int productId);

    /**
     * 5分钟K线最新数据
     */
    StockData getOneFreshDataForM5(int productId);

    /**
     * 15分钟K线最新数据
     */
    StockData getOneFreshDataForM15(int productId);

    /**
     *批量保存
     */
    int saveDatas(List<StockData> list);
}
