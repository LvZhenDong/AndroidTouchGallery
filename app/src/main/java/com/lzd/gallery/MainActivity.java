package com.lzd.gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

import ru.truba.touchgallery.GalleryWidget.BasePagerAdapter;
import ru.truba.touchgallery.GalleryWidget.GalleryViewPager;
import ru.truba.touchgallery.GalleryWidget.PagerAdapter;

public class MainActivity extends AppCompatActivity {
    GalleryViewPager viewpager;
    TextView tvNum;
    private ArrayList<String> images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager=findViewById(R.id.viewpager);
        tvNum=findViewById(R.id.tv_number);

        images=new ArrayList<>();
        images.add("http://e.hiphotos.baidu.com/image/crop%3D0%2C31%2C639%2C418/sign=e5ad4a8f45c2d562e6478aadda21bcdc/3c6d55fbb2fb431631b79e952aa4462308f7d3b1.jpg");
        images.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511245787&di=70326c4b0a4aaaaa4c92fc4e42f55dab&imgtype=jpg&er=1&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fd31b0ef41bd5ad6e626e5cf98bcb39dbb6fd3c09.jpg");
        initViewPager();
    }
    private void initViewPager() {
        PagerAdapter pagerAdapter = new PagerAdapter(this, images);
        viewpager.setAdapter(pagerAdapter);
        pagerAdapter.setOnItemChangeListener(new BasePagerAdapter.OnItemChangeListener() {
            @Override
            public void onItemChange(int currentPosition) {
                tvNum.setText((currentPosition + 1) + "/" + images.size());
            }
        });
    }
}
