package com.example.myturn.myturn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MangerSignup extends AppCompatActivity {

    private DatabaseReference MyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manger_signup);

        Button register = (Button) findViewById(R.id.MS_Register);
        MyDB = FirebaseDatabase.getInstance().getReference().child("managers");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText SelectUserName = (EditText) findViewById(R.id.MS_UserName);
                EditText SelectPassword = (EditText) findViewById(R.id.MS_Password);
                EditText EnterEmail = (EditText) findViewById(R.id.MS_Mail);
                EditText EnterPhone = (EditText) findViewById(R.id.MS_Phone);
                EditText FirstName = (EditText) findViewById(R.id.MS_First_Name);
                EditText LastName = (EditText) findViewById(R.id.MS_Last_Name);
                EditText EnterBusinessName = (EditText) findViewById(R.id.MS_BusinessName);
                EditText EnterBusinessAddress = (EditText) findViewById(R.id.MS_Business_Address);

                String UserName = SelectUserName.getText().toString().trim();
                String FN = FirstName.getText().toString().trim();
                String LN = LastName.getText().toString().trim();
                String Pass = SelectPassword.getText().toString().trim();
                String Email = EnterEmail.getText().toString().trim();
                String Phone = EnterPhone.getText().toString().trim();
                String BusinessName = EnterBusinessName.getText().toString().trim();
                String BusinessAddress = EnterBusinessAddress.getText().toString().trim();
                Business m = new Business(FN ,LN, UserName, Phone, Email, Pass, BusinessName, BusinessAddress);
                HashMap<String ,String> usermap = new HashMap<String, String>();
                usermap.put("user name", m.getId());
                usermap.put("first name", m.getFirstName());
                usermap.put("last name", m.getLastName());
                usermap.put("phone number", m.getPhone());
                usermap.put("Email", m.getEmail());
                usermap.put("password", m.getPassword());
                usermap.put("Business name", m.getBusinessName());
                usermap.put("Business address", m.getAddress());

                MyDB.push().setValue(usermap);

//                MyDB.child(m.getId() + "");
//                MyDB.child(m.getId() + "").child("Password").setValue(m.getPassword());
//                MyDB.child(m.getId() + "").child("Email").setValue(m.getEmail());
//                MyDB.child(m.getId() + "").child("PhoneNumber").setValue(m.getPhone());
//                MyDB.child(m.getId() + "").child("FirstName").setValue(m.getFirstName());
//                MyDB.child(m.getId() + "").child("LastName").setValue(m.getLastName());
//                MyDB.child(m.getId() + "").child("BusinessName").setValue(m.getBusinessName());
//                MyDB.child(m.getId() + "").child("Address").setValue(m.getAddress());
                //we need to know how to read from data base then compare to the new UN, if not exist add it.

            }
        });
    }
}
