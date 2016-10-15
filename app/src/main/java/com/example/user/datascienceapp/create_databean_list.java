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

    static int image_id[] = {R.drawable.rating_pic_1, R.drawable.rating_pic_2, R.drawable.rating_pic_3, R.drawable.rating_pic_4, R.drawable.rating_pic_5, R.drawable.rating_pic_6,
            R.drawable.rating_pic_7, R.drawable.rating_pic_8, R.drawable.rating_pic_9, R.drawable.rating_pic_10, R.drawable.rating_pic_11, R.drawable.rating_pic_12, R.drawable.rating_pic_13, R.drawable.rating_pic_14, R.drawable.rating_pic_15, R.drawable.rating_pic_16
            , R.drawable.rating_pic_17, R.drawable.rating_pic_18, R.drawable.rating_pic_19, R.drawable.rating_pic_20};
    static String name[]={"NEERAJA","SEETARAM","TANMAY","MANJULA","RADHIKA","SHILPI","RAMLAL","ATMARAM","SURENDRA","SEETA","AARYAN","VAAMIKA",
                          "AYAAN","MOUNA","SEETARAM","RADHIKA","AYUSHMAN","MADHAV","MAHENDRA","SAANVI"};
    static String game[]={"LIKES PLAYING MUSICAL INSTRUMENTS","LIKES STITCHING CLOTHES","LIKES ARCHERY","LIKES GYMNASTICS","LIKES TO PLAY TENNIS","LIKES COLLECTING MARBELS"
                          ,"LIKES DANCING","LIKES TO PLAY BASKET-BALL","LIKES SKETCHING","LIKES TO SING","LIKES PLAYING BADMINTON","LIKES GARDENING","LIKES REPAIRING WATCHES",
    "LIKES DECORATING WATCHES","LIKES STITCHING CLOTHES","LIKES MARTIAL ARTS","LIKES CALLIGRAPHY","LIKES TO SWIM","LIKES ROCK CLIMBING","LIKES CYCLING"};
    static String gender[]={"FEMALE","MALE","MALE","FEMALE","FEMALE","FEMALE","MALE","MALE","MALE","FEMALE","MALE","FEMALE","MALE","FEMALE","MALE",
                            "FEMALE","MALE","MALE","MALE","FEMALE"};

    public static ArrayList<DataBean> create_list() {
        int i = 0;
        if(list1.size()==0)
        {
        for (int l = 1; l <=image_id.length; l++) {
            DataBean obj = new DataBean();
            obj.setId(l);

            //Log.e("ge",img+"");
            obj.setImage(image_id[i]);
            obj.setGender(gender[i]);
            obj.setName(name[i]);
            obj.setGame(game[i++]);
            list1.add(obj);
        }
        }
        return list1;

    }
}
