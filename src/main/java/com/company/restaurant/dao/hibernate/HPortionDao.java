package com.company.restaurant.dao.hibernate;

import com.company.restaurant.dao.PortionDao;
import com.company.restaurant.dao.hibernate.proto.HDaoEntity;
import com.company.restaurant.model.Portion;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Yevhen on 15.06.2016.
 */
public class HPortionDao extends HDaoEntity<Portion> implements PortionDao {
    @Transactional
    @Override
    public Portion addPortion(Portion portion) {
        return save(portion);
    }

    @Transactional
    @Override
    public void delPortion(Portion portion) {
        delete(portion);
    }

    @Transactional
    @Override
    public List<Portion> findAllPortions() {
        return findAllObjects();
    }

    @Transactional
    @Override
    public Portion findPortionById(int portionId) {
        return findObjectById(portionId);
    }
}
