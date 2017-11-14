使用说明
-----------------
1. 在xml中添加
```
<ru.truba.touchgallery.GalleryWidget.GalleryViewPager
        android:id="@+id/viewpager"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent" />
```
2. 将图片地址设置到PageAdapter里
```java
String[] urls = { "http://cs407831.userapi.com/v407831207/18f6/jBaVZFDhXRA.jpg", "http://cs407831.userapi.com/v4078f31207/18fe/4Tz8av5Hlvo.jpg", //special url with error "http://cs407831.userapi.com/v407831207/1906/oxoP6URjFtA.jpg", 
"http://cs407831.userapi.com/v407831207/190e/2Sz9A774hUc.jpg", 
"http://cs407831.userapi.com/v407831207/1916/Ua52RjnKqjk.jpg", 
"http://cs407831.userapi.com/v407831207/191e/QEQE83Ok0lQ.jpg"};
Listitems = new ArrayList();
Collections.addAll(items, urls);

viewpager=findViewById(R.id.viewpager);
PagerAdapter pagerAdapter = new PagerAdapter(this, images);
viewpager.setAdapter(pagerAdapter);
pagerAdapter.setOnItemChangeListener(new BasePagerAdapter.OnItemChangeListener() {
    @Override
    public void onItemChange(int currentPosition) {
        tvNum.setText((currentPosition + 1) + "/" + images.size());
    }
});
