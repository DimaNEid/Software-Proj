package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonsMethod {

    public static final List<Owner> owners = new ArrayList<>();
    static Owner oo = new Owner();

    public static final List<Tenant> tenants = new ArrayList<>();
    static Tenant tt = new Tenant();

    public static final List<Admin> admin = new ArrayList<>();
    static Admin aa = new Admin();



    public static boolean addOwner(String id, String name, String phone, String address) {
        oo.setId(id);
        oo.setName(name);
        oo.setPhone(phone);
        oo.setAddress(address);


        owners.add(oo);
        return true;
    }


    public static boolean addTenant(String id, String name, String phone, String address) {
        tt.setId(id);
        tt.setName(name);
        tt.setPhone(phone);
        tt.setAddress(address);


        tenants.add(tt);
        return true;
    }

    public static boolean addAdmin(String id, String name, String phone, String address) {
        aa.setId(id);
        aa.setName(name);
        aa.setPhone(phone);
        aa.setAddress(address);


        admin.add(aa);
        return true;
    }
}
