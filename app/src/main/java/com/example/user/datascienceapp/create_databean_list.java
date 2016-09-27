package com.example.user.datascienceapp;

import android.util.Log;

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
    static int image_id[]={R.drawable.rating_pic_1,R.drawable.rating_pic_2,R.drawable.rating_pic_1,R.drawable.rating_pic_2,R.drawable.rating_pic_1,R.drawable.rating_pic_2,R.drawable.rating_pic_1,R.drawable.rating_pic_2,R.drawable.rating_pic_1,R.drawable.rating_pic_2,R.drawable.rating_pic_1,R.drawable.rating_pic_2};


    public static ArrayList<DataBean> create_list() {
        int i=0;
        for (int l = 1; l <= image_id.length; l++) {
            DataBean obj = new DataBean();
            obj.setId(l);

            //Log.e("ge",img+"");
            obj.setImage(image_id[i++]);
            obj.setGender("Male");
            obj.setName("lakshay");
            obj.setGame("sports");
            list1.add(obj);
        }
        return list1;

    }
}
