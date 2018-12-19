package com.example.myturn.myturn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Date;
import java.util.Set;

public class Business extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);


    }
    private String BusinessName;
    private String Address;
    private String firstName;
    private String lastName;
    private String id;
    private String phone;
    private String email;
    private String password;
    private Set<Date> Turns;

    public Business(String firstName,
                   String lastName,
                   String id,
                   String phone,
                   String email,
                   String password,
                   String BusinessName,
                   String Adress ) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.phone=phone;
        this.email=email;
        this.password=password;
        this.BusinessName=BusinessName;
        this.Address=Adress;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public String getAddress() {
        return Address;
    }

    public void setBusinessName(String businessName) {
        BusinessName = businessName;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
