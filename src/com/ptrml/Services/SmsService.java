package com.ptrml.Services;

/**
 * Created by ptrml on 11/20/2016.
 */


public class SmsService extends BasicService {

    private static final String service_name = "SMS";
    private int msgs;
    private double price_per_msg;

    public SmsService(
            double _service_price, // osnovna pretplata za servisot
            int _msgs, // broj na besplatni poraki vkluceni vio pretplatata
            double _price_per_msg // cena na poraka
    )
    {
        this.service_price = _service_price;
        this.msgs = _msgs;
        this.price_per_msg = _price_per_msg;
    }

    @Override
    public String getName() {
        return service_name;
    }
}
