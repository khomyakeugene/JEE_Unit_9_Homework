package com.company.restaurant.dao;

import com.company.restaurant.model.CommonData;

import java.util.List;

/**
 * Created by Yevhen on 04.08.2016.
 */
public interface CommonDataDao {
    CommonData addCommonData(CommonData commonData);

    CommonData addCommonData(String name, String value);

    CommonData addCommonData(String name, String value, byte[] image);

    CommonData saveCommonDataImage(int commonDataId, byte[] image);

    CommonData saveCommonDataImage(String name, byte[] image);

    void delCommonData(CommonData commonData);

    void delCommonData(int commonDataId);

    void delCommonData(String name);

    List<CommonData> findAllCommonData();

    CommonData findCommonDataById(int commonDataId);

    CommonData findCommonDataByName(String name);

    String getCommonDataValue(int commonDataId);

    String  getCommonDataValue(String name);

    byte[] getCommonDataImage(int commonDataId);

    byte[] getCommonDataImage(String name);
}
