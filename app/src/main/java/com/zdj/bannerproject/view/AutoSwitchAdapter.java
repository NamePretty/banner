package com.zdj.bannerproject.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;


import com.zdj.bannerproject.R;
import com.zdj.bannerproject.utils.Check;
import com.zdj.bannerproject.utils.ImageUtils;

import java.util.List;

/**
 * @author ryze
 * @since 1.0  2016/07/17
 */
public class AutoSwitchAdapter extends AutoLoopSwitchBaseAdapter {

  private Context mContext;

  private List<LoopModel> mDatas;

  public AutoSwitchAdapter() {
    super();
  }

  public AutoSwitchAdapter(Context mContext, List<LoopModel> mDatas) {
    this.mContext = mContext;
    this.mDatas = mDatas;
  }

  @Override
  public int getDataCount() {
    return mDatas == null ? 0 : mDatas.size();
  }

  @Override
  public View getView(int position) {
    ImageView imageView = new ImageView(mContext);
    imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT));
    LoopModel model = (LoopModel) getItem(position);
    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    if(Check.isEmpty(model.getImage())){
      imageView.setImageResource(R.mipmap.icon_image_banner);
    }else{
      ImageUtils.load(mContext,model.getImage(),imageView,R.mipmap.icon_image_banner);
    }
    imageView.setTag(position);
    return imageView;
  }

  @Override
  public Object getItem(int position) {
    if (position >= 0 && position < getDataCount()) {
      return mDatas.get(position);
    }
    return null;
  }


  @Override
  public View getEmptyView() {
    return null;
  }

  @Override
  public void updateView(View view, int position) {}

  @Override
  public void destroyItem(ViewGroup container, int position, Object object) {
    super.destroyItem(container, position, object);
  }

  public static abstract class OnexternalonClick implements View.OnClickListener{
    @Override
    public void onClick(View v) {
      onClickExternal(v,(Integer) v.getTag());
    }
    public abstract void onClickExternal(View v,int position);
  }
}
