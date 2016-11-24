package com.ptrml;

import com.ptrml.ServicePackages.PackageFactory;
import com.ptrml.ServicePackages.ServicePackage;
import com.ptrml.Services.DataService;
import com.ptrml.Services.RoamService;
import com.ptrml.Services.SmsService;
import com.ptrml.Services.VoiceService;

import java.rmi.NoSuchObjectException;

public class Main {

    public static void main(String[] args) {

// podgotovka na prototipovi - paketi so kombinacija na servisi
        ServicePackage sp1 = new ServicePackage("post-paid");
        sp1.AddService(new VoiceService(500.0,500.0,30,3.9,0.0,0));
        sp1.AddService(new SmsService(0.0,50,4.9));
        //sp1.AddService(new DataService(300.0,5,100*1024,4.0));//Vo primerot falat parametri za dlspeed i ulspeed
        sp1.AddService(new DataService(300.0,5,100*1024,4.0,50,50));
        sp1.AddService(new RoamService());
        ServicePackage sp2 = new ServicePackage("pre-paid");
        sp2.AddService(new VoiceService(0.0,0.0,60,6.9,6.9,60));
        sp2.AddService(new SmsService(0.0,0,5.0));
        ServicePackage sp3 = new ServicePackage("pre-paid-data+");
        sp3.AddService(new VoiceService(0.0,0.0,60,6.9,6.9,60));
        sp3.AddService(new SmsService(0.0,0,5.0));
        sp3.AddService(new DataService(100.0,5,100*1024,4.0,50,50));


// dodavanje na paketite vo Prototype Manager
        PackageFactory.AddPrototype(sp1);
        PackageFactory.AddPrototype(sp2);
        PackageFactory.AddPrototype(sp3);
// kreiranje na kopii na paketite po potreba so koloniranje
        ServicePackage psp1 = null;
        try {
            psp1 = PackageFactory.findAndClone("post-paid");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ServicePackage psp2 = null;
        try {
            psp2 = PackageFactory.findAndClone("pre-paid");
        }  catch (Exception e) {
            e.printStackTrace();
        }
        ServicePackage psp3 = null;
        try {
            psp3 = PackageFactory.findAndClone("pre-paid-data+");
        }  catch (Exception e) {
            e.printStackTrace();
        }
        sp1.AddService(new SmsService(23.0,50,4.9));
        // rabota so paketite, na pr.
        if (psp1 != null) {
            System.out.printf( " List of services & subscription prices in package: %s\n",psp1.getName());
            psp1.ListServices();
            System.out.printf( "Total: \t %s\n" ,psp1.PackagePrice());
        }
        if (psp2 != null) {
            System.out.printf( " List of services & subscription prices in package: %s\n",psp2.getName());
            psp2.ListServices();
            System.out.printf( "Total: \t %s\n" ,psp2.PackagePrice());
        }
        if (psp3 != null) {
            System.out.printf( " List of services & subscription prices in package: %s\n",psp3.getName());
            psp3.ListServices();
            System.out.printf( "Total: \t %s\n" ,psp3.PackagePrice());
        }
    }
}
