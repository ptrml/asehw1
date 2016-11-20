package com.ptrml.ServicePackages;

import com.ptrml.Services.BasicService;

/**
 * Created by Pepo123 on 11/20/2016.
 */
public class ServicePackage {
    String name;

    public ServicePackage(String _sname) {
        this.name = _sname;
    }

    public void AddService(BasicService voiceService) {
    }

    public void ListServices() {
    }

    public double PackagePrice() {
        return 0.0;
    }

    public String getName() {
        return name;
    }
}
