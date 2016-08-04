package com.company.restaurant.service;

/**
 * Created by Yevhen on 04.08.2016.
 */
public interface CommonDataService {
    String getRestaurantName();

    String getRestaurantAddress();

    String getRestaurantEMail();

    byte[] getEmblemImage();

    byte[] getRestaurantSchemeImage();

    byte[] getTransportMapImage();
}
