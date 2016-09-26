package com.example.user.datascienceapp;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

import java.*;

/**
 * Created by USER on 24-09-2016.
 */
public class create_databean_list {
    static ArrayList<DataBean> list1 = new ArrayList<DataBean>();

    public static ArrayList<DataBean> create_list() {
        for (int l = 0; l <= 10; l++) {
            DataBean obj = new DataBean();
            obj.setId(l);
            obj.setImage(R.drawable.slide1);
            obj.setGender("Male");
            obj.setName("lakshay");
            obj.setGame("sports");
            list1.add(obj);
        }
        return list1;

    }
}
