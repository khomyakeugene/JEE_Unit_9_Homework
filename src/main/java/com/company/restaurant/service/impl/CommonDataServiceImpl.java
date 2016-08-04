package com.company.restaurant.service.impl;

import com.company.restaurant.dao.CommonDataDao;
import com.company.restaurant.service.CommonDataService;
import com.company.restaurant.service.impl.proto.Service;

/**
 * Created by Yevhen on 04.08.2016.
 */
public class CommonDataServiceImpl extends Service implements CommonDataService {
    public static final String EMBLEM_NAME = "emblem";
    public static final String TRANSPORT_MAP_NAME = "transport map";
    public static final String RESTAURANT_SCHEMA_NAME = "restaurant schema";

    private CommonDataDao commonDataDao;

    public void setCommonDataDao(CommonDataDao commonDataDao) {
        this.commonDataDao = commonDataDao;
    }

    @Override
    public byte[] getEmblemImage() {
        return commonDataDao.getCommonDataImage(EMBLEM_NAME);
    }

    @Override
    public byte[] getRestaurantSchemeImage() {
        return commonDataDao.getCommonDataImage(RESTAURANT_SCHEMA_NAME);
    }

    @Override
    public byte[] getTransportMapImage() {
        return commonDataDao.getCommonDataImage(TRANSPORT_MAP_NAME);
    }
}
