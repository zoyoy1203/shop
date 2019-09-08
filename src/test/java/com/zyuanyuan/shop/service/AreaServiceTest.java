package com.zyuanyuan.shop.service;

import com.zyuanyuan.shop.BaseTest;
import com.zyuanyuan.shop.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area>areaList = areaService.getAreaList();
        assertEquals("河南",areaList.get(0).getAreaName());
    }

}
