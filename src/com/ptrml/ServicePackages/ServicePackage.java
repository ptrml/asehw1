package com.ptrml.ServicePackages;

import com.ptrml.Services.BasicService;

import java.util.List;

/**
 * Created by Pepo123 on 11/20/2016.
 */
public class ServicePackage {
    protected String name;
    protected List<BasicService> serviceList;

    public ServicePackage(String _sname) {

        this.name = _sname;
    }

    public void AddService(BasicService _service) {
        serviceList.add(_service);
    }

    public void ListServices() {
        for (BasicService service:serviceList)
        {
            System.out.println(service.toString());
        }
    }

    public double PackagePrice() {
        double total_price = 0;

        for (BasicService service:serviceList)
        {
            total_price += service.getService_price();
        }

        return total_price;
    }

    public String getName() {
        return name;
    }
}
