package com.ptrml.Services;

/**
 * Created by ptrml on 11/20/2016.
 */

public class DataService extends BasicService {

    private static final String service_name = "Data";
    private int size;
    private int unit;
    private double price_per_unit;
    private int dlspeed;
    private int ulspeed;

    public DataService(
            double _service_price, // osnovna pretplata za servisot
           int _size, // kolku free data transfer se dobiva za pretplatata
           int _unit, // kolicina za tarifiranje
           double _price_per_unit, // cena po prenesena kolicina
           int _dlspeed, // max. download speed
           int _ulspeed // max upload speed
    )
    {
        this.service_price = _service_price;
        this.size = _size;
        this.unit = _unit;
        this.price_per_unit = _price_per_unit;
        this.dlspeed = _dlspeed;
        this.ulspeed = _ulspeed;
    }

    @Override
    public String getName() {
        return service_name;
    }
}
