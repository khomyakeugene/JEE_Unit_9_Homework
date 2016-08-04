package com.company.restaurant.dao.hibernate;

import com.company.restaurant.dao.CommonDataDao;
import com.company.restaurant.dao.hibernate.proto.HDaoEntity;
import com.company.restaurant.model.CommonData;

import java.util.List;

/**
 * Created by Yevhen on 04.08.2016.
 */
public class HCommonDataDao extends HDaoEntity<CommonData> implements CommonDataDao {
    @Override
    public CommonData addCommonData(CommonData commonData) {
        return save(commonData);
    }

    @Override
    public CommonData addCommonData(String name, String value, byte[] image) {
        CommonData commonData = new CommonData();
        commonData.setName(name);
        commonData.setValue(value);
        commonData.setImage(image);

        return addCommonData(commonData);
    }

    @Override
    public CommonData addCommonData(String name, String value) {
        return addCommonData(name, value, null);
    }

    private void updCommonDataValue(CommonData commonData, String value) {
        if (commonData != null) {
            commonData.setValue(value);
            save(commonData);
        }
    }

    @Override
    public void updCommonDataValue(int commonDataId, String value) {
        updCommonDataValue(findCommonDataById(commonDataId), value);
    }

    @Override
    public void updCommonDataValue(String name, String value) {
        updCommonDataValue(findCommonDataByName(name), value);
    }

    private void updCommonDataImage(CommonData commonData, byte[] image) {
        if (commonData != null) {
            commonData.setImage(image);
            save(commonData);
        }
    }

    @Override
    public void updCommonDataImage(int commonDataId, byte[] image) {
        updCommonDataImage(findCommonDataById(commonDataId), image);
    }

    @Override
    public void updCommonDataImage(String name, byte[] image) {
        updCommonDataImage(findCommonDataByName(name), image);
    }

    @Override
    public void delCommonData(CommonData commonData) {
        delete(commonData);
    }

    @Override
    public void delCommonData(int commonDataId) {
        delete(commonDataId);
    }

    @Override
    public void delCommonData(String name) {
        delete(name);
   }

    @Override
    public List<CommonData> findAllCommonData() {
        return findAllObjects();
    }

    @Override
    public CommonData findCommonDataById(int commonDataId) {
        return findObjectById(commonDataId);
    }

    @Override
    public CommonData findCommonDataByName(String name) {
        return findObjectByName(name);
    }

    private String getCommonDataValue(CommonData commonData) {
        return (commonData == null) ? null : commonData.getName();
    }

    @Override
    public String getCommonDataValue(int commonDataId) {
        return getCommonDataValue(findCommonDataById(commonDataId));
    }

    @Override
    public String getCommonDataValue(String name) {
        return getCommonDataValue(findCommonDataByName(name));
    }

    private byte[] getCommonDataImage(CommonData commonData) {
        return (commonData == null) ? null : commonData.getImage();
    }

    @Override
    public byte[] getCommonDataImage(int commonDataId) {
        return getCommonDataImage(findCommonDataById(commonDataId));
    }

    @Override
    public byte[] getCommonDataImage(String name) {
        return getCommonDataImage(findCommonDataByName(name));
    }
}
