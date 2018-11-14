package com.zdj.bannerproject.view;

import java.io.Serializable;

/**
 * @author zdj
 * @since 1.0  2016/07/17
 */
public class LoopModel implements Serializable {

  private String url;
  private String image;

  public LoopModel(){}

  public LoopModel(String url,String image){
    this.url = url;
    this.image=image;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
