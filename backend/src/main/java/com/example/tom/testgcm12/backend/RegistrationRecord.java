package com.example.tom.testgcm12.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * The Objectify object model for device registrations we are persisting
 * 代表一個註冊資料的類別，其內部只有一個屬性regId。
 */
@Entity
public class RegistrationRecord {

    @Id
    Long id;

    @Index
    private String regId;
    // you can add more fields...

    public RegistrationRecord() {
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }
}