package com.hiveview.service.impl;

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
    private StockDataM5MapperDao stockDataM5MapperDao;

    @Override
    public List<StockData> getInitDatasForM() {
        return stockDataMapperDao.selectOneHour();
    }

    @Override
    public List<StockData> getInitDatasForM1() {
        return null;
    }

    @Override
    public List<StockData> getInitDatasForM5() {
        return stockDataM5MapperDao.selectTwoHour();
    }

    @Override
    public List<StockData> getInitDatasForM15() {
        return null;
    }

    @Override
    public StockData getOneFreshDataForM() {
        return stockDataMapperDao.selectOneFreshData();
    }

    @Override
    public StockData getOneFreshDataForM1() {
        return null;
    }

    @Override
    public StockData getOneFreshDataForM5() {
        return stockDataM5MapperDao.selectOneFreshData();
    }

    @Override
    public StockData getOneFreshDataForM15() {
        return null;
    }

    @Override
    public int saveDatas(List<StockData> list) {
        return 0;
    }
}
