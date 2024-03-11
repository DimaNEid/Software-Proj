package org.example;

public class Tenant {
    public Tenant(String id,String name,String phone, String address) {
        this.id = id;
        this.name = name;
        this.address=address;
        this.phone=phone;

    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public Tenant() {

    }

    @Override

    public String toString(){
        return "Owner{"+
                ", Id      ='" + id + '\'' +
                ", name    ='" + name + '\'' +
                ", address ='" + address + '\'' +
                ", phone ='"   + phone + '\'' + '}';
    }
}
