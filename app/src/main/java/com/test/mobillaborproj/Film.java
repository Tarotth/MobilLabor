package com.test.mobillaborproj;

import com.orm.SugarRecord;

public class Film extends SugarRecord {
    Integer id;
    String name;
    String description;
    Integer rating;
    Object image;

    public Film(){}

    public Film(Integer id, String name, String description, Integer rating, Object image)
    {
        this.id = id;
        this.name = name;
        this. description = description;
        this.rating = rating;
        this.image = image;

    }

}
