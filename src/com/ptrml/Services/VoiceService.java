package com.ptrml.Services;

/**
 * Created by Pepo123 on 11/20/2016.
 */


public class VoiceService extends BasicService{

    private double free_mins;
    private int unit;
    private double price_per_min;
    private double price_per_call;
    private int free_sec_in_call;

    public VoiceService(
            double _service_price, // osnovna pretplata za servisot
            double _free, // kolku free minuti vrednost se dobiva za pretplatata
            int _unit, // vreme na tarifiranje
            double _price_per_min, // cena po minuta razgovor
            double _price_per_call, // cena na vospostavuvajne na povik
            int _free_sec_in_call // sekundi razgovor vkluceni vo cenata na vospostavuvanje na povik
    )
    {
        this.service_price = _service_price;
        this.free_mins = _free;
        this.unit = _unit;
        this.price_per_min = _price_per_min;
        this.price_per_call = _price_per_call;
        this.free_sec_in_call = _free_sec_in_call;

    }
}
