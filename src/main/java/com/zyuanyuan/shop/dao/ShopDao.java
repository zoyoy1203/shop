package com.zyuanyuan.shop.dao;

import com.zyuanyuan.shop.entity.Shop;

public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);
}
