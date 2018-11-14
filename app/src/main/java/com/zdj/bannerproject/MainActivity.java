package com.zdj.bannerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zdj.bannerproject.view.AutoSwitchAdapter;
import com.zdj.bannerproject.view.AutoSwitchView;
import com.zdj.bannerproject.view.LoopModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.loopswitch)
    AutoSwitchView mAutoSwitchView;

    @BindView(R.id.btn_getOnline)
    Button btn_getOnline;

    private AutoSwitchAdapter mAdapter;
    private List<LoopModel> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initBannerView();
    }

    private void initBannerView(){
        datas=new ArrayList<>();
        LoopModel model;
        for(int i=0;i<4;i++){
            model=new LoopModel();
            datas.add(model);
        }
        mAdapter = new AutoSwitchAdapter(this,datas);
        mAutoSwitchView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }



    @Optional
    @OnClick({R.id.btn_getOnline})
    public void MyOnClick(View v){
        switch (v.getId()){
            case R.id.btn_getOnline:
                datas.clear();
                LoopModel model = new LoopModel();
                model.setUrl("http://t2.hddhhn.com/uploads/tu/201710/41/0ed4095501.jpg");
                model.setImage("http://t2.hddhhn.com/uploads/tu/201710/41/0ed4095501.jpg");
                LoopModel model1 = new LoopModel();
                model1.setUrl("http://t1.27270.com/uploads/tu/201807/92/8f17e0854a_1.jpg");
                model1.setImage("http://t1.27270.com/uploads/tu/201807/92/8f17e0854a_1.jpg");
                LoopModel model2 = new LoopModel();
                model2.setUrl("http://t2.hddhhn.com/uploads/tu/201708/864/b35a7a67072.jpg");
                model2.setImage("http://t2.hddhhn.com/uploads/tu/201708/864/b35a7a67072.jpg");
                LoopModel model3 = new LoopModel();
                model3.setUrl("http://t2.hddhhn.com/uploads/tu/201708/864/b35a7a67072.jpg");
                model3.setImage("http://t2.hddhhn.com/uploads/tu/201708/155/5f52638beb_1.jpg");
                datas.add(model);
                datas.add(model1);
                datas.add(model2);
                datas.add(model3);
                mAdapter = new AutoSwitchAdapter(this, datas);
                mAutoSwitchView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
                break;
        }
    }


}
