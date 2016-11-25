package com.ptrml.ServicePackages;

import com.ptrml.Nameable;
import com.ptrml.Prototype;
import com.ptrml.Services.BasicService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ptrml on 11/20/2016.
 */
public class ServicePackage implements Prototype<ServicePackage>,Nameable {
    protected String name;
    protected List<BasicService> serviceList;

    /**
     * Constructor
     * @param _sname imeto na paketot
     */
    public ServicePackage(String _sname) {

        this.name = _sname;
        this.serviceList = new ArrayList<>();
    }

    /**
     * @return lista na servisi vo paketot
     */
    public List<BasicService> getServiceList() {
        return serviceList;
    }

    /**
     * @param serviceList lista na servisi sodrzani vo paketot
     */
    public void setServiceList(List<BasicService> serviceList) {
        this.serviceList = serviceList;
    }

    /**
     * @param _service Dodavawe na servis vo postoeckata lista servisi na paketot
     */
    public void AddService(BasicService _service) {
        serviceList.add(_service);
    }

    /**
     * Ispecatuva spisok na sodrzanite servisi vo paketot
     */
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
