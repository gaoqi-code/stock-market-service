package com.hiveview.service;

import com.hiveview.entity.StockProduct;

import java.util.List;

/**
 * Created by zhangsw on 2017/5/21.
 */
public interface StockProductService {
    StockProduct getProuctByType(String type);

    List<StockProduct> getSellingProducts();

}
