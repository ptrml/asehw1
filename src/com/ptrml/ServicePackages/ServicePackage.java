package com.ptrml.ServicePackages;

import com.ptrml.Prototype;
import com.ptrml.Services.BasicService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ptrml on 11/20/2016.
 */
public class ServicePackage implements Prototype<ServicePackage> {
    protected String name;
    protected List<BasicService> serviceList;



    public List<BasicService> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<BasicService> serviceList) {
        this.serviceList = serviceList;
    }

    public ServicePackage(String _sname) {

        this.name = _sname;
        this.serviceList = new ArrayList<>();
    }

    public void AddService(BasicService _service) {
        serviceList.add(_service);
    }

    public void ListServices() {
        int i = 0;
        for (BasicService service:serviceList)
        {
            System.out.printf("%s. %s %s \n",++i,service.getName(),service.getService_price());

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

    @Override
    public ServicePackage clone() throws CloneNotSupportedException{

        ServicePackage clone = (ServicePackage) super.clone();

        List<BasicService> clone_sl= new ArrayList<>();
        for(BasicService sp : this.getServiceList())
        {
            clone_sl.add(sp.clone());
        }
        clone.setServiceList(clone_sl);

        return clone;
    }

}
