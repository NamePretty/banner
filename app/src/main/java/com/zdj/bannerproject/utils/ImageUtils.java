package com.zdj.bannerproject.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.zdj.bannerproject.R;

import static com.bumptech.glide.Glide.with;

/**
 * Created by zdj on 2017/1/3.
 */

public class ImageUtils {

    public static void load(Context context, Object url, ImageView imageView){
        with(context)
                .load(url)
                .crossFade()
                .into(imageView);
    }

    public static void load(Context context, Object url, ImageView imageView,int resourceId){
        RequestManager manager=Glide.with(context);
                if(resourceId!=0){
                    manager .load(url)
                            .placeholder(resourceId)
                            .fallback(resourceId)
                            .error(resourceId)
                            .crossFade()
                            .into(imageView);
                }else{
                    manager .load(url)
                            .placeholder(R.mipmap.icon_image_banner)
                            .fallback(R.mipmap.icon_image_banner)
                            .error(R.mipmap.icon_image_banner)
                            .crossFade()
                            .into(imageView);
                }
    }


}
