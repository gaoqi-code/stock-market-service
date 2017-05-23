package com.hiveview.service.impl;

import com.hiveview.dao.StockDataM15MapperDao;
import com.hiveview.dao.StockDataM1MapperDao;
import com.hiveview.dao.StockDataM5MapperDao;
import com.hiveview.dao.StockDataMapperDao;
import com.hiveview.entity.StockData;
import com.hiveview.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zhangsw
 * @create 2017-05-14 13:03
 */
@Service
public class StockDataServiceImpl implements StockDataService {
    @Autowired
    private StockDataMapperDao stockDataMapperDao;
    @Autowired
    private StockDataM1MapperDao stockDataM1MapperDao;
    @Autowired
    private StockDataM5MapperDao stockDataM5MapperDao;
    @Autowired
    private StockDataM15MapperDao stockDataM15MapperDao;


    @Override
    public List<StockData> getInitDatasForM() {
        return stockDataMapperDao.selectOneHour();
    }

    @Override
    public List<StockData> getInitDatasForM1() {
        return stockDataM1MapperDao.selectOneHour();
    }

    @Override
    public List<StockData> getInitDatasForM5() {
        return stockDataM5MapperDao.selectTwoHour();
    }

    @Override
    public List<StockData> getInitDatasForM15() {
        return stockDataM15MapperDao.selectTwoHour();
    }

    @Override
    public StockData getOneFreshDataForM() {
        return stockDataMapperDao.selectOneFreshData();
    }

    @Override
    public StockData getOneFreshDataForM1() {
        return stockDataM1MapperDao.selectOneFreshData();
    }

    @Override
    public StockData getOneFreshDataForM5() {
        return stockDataM5MapperDao.selectOneFreshData();
    }

    @Override
    public StockData getOneFreshDataForM15() {
        return stockDataM15MapperDao.selectOneFreshData();
    }

    @Override
    public int saveDatas(List<StockData> list) {
        return 0;
    }
}
