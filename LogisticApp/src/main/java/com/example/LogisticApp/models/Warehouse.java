package com.example.LogisticApp.models;

public class Warehouse {

    //id
    private Integer id;
    //name
    private String name;
    //department
    private String department;
    //municipality
    private String municipality;
    //address
    private String address;
    //installedVolumeCapacity
    //

    public Warehouse(){

    }

    public Warehouse(Integer id, String name, String department, String municipality, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.municipality = municipality;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
