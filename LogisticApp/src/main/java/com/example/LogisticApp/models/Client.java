package com.example.LogisticApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Client {

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
    //zipCode
    private String zipCode;
    //rol
    private String rol;
    //email
    private String email;
    //phone
    private short phone;

    public Client(){

    }

    public Client(Integer id, String name, String department, String municipality, String address, String zipCode, String rol, String email, short phone) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.municipality = municipality;
        this.address = address;
        this.zipCode = zipCode;
        this.rol = rol;
        this.email = email;
        this.phone = phone;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getPhone() {
        return phone;
    }

    public void setPhone(short phone) {
        this.phone = phone;
    }
}
