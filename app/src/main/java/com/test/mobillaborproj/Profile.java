package com.test.mobillaborproj;

import com.orm.SugarRecord;

import java.util.Collections;
import java.util.List;

public class Profile extends SugarRecord {
    String name;
    String email;
    String password;
    List<Film> films;
    
    public Profile(){}
    
    public Profile(String name, String email, String password, List<Film> films){
        this.name = name;
        this.email = email;
        this.password = password;
        this.films = films;
    }
}
