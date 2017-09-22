每次去查看Activity和Fragment交叉时候的声明周期都比较乱，网上的文章写的实在是不想吐槽，直接自己撸了一发。


### Fragment之间切换生命周期 

#### add方式
未调用hide方法，所以没有触发onHiddenChanged回调

![图 - 1 add方式添加再返回](http://upload-images.jianshu.io/upload_images/354846-d9e3a2a1498039bf.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640)

#### replace方式

![图 - 2 replace方式添加并返回](http://upload-images.jianshu.io/upload_images/354846-3999e5aabc3111a6.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640)

### Activity的onCreate()方法中使用代码加载Fragment
这个一般不在正常的生命周期讨论范围内，只是个人比较好奇。
如果在Activity的某个生命周期动态载入Fragment，Fragment的声明周期直接会与Activity生命周期对齐，例如下图，Fragment声明周期直接走到了onStart才停止。

![图 - 3 activity的create方法中使用代码动态replace布局添加fragment](http://upload-images.jianshu.io/upload_images/354846-4170954bb9b74e10.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640)

### Activity的布局中直接使用fragment元素

正常的生命周期讨论范围很重要，可以看见Fragment的生命周期回调先与Activity。

![图 - 4 布局中使用Fragment和activity生命周期](http://upload-images.jianshu.io/upload_images/354846-88fb94b1e6ce9043.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640)

### 多个Activity切换生命周期

- 上一个Activity会先onPause，等下一个Activity执行onResume显示后，上一个Activity才会执行onStop从视野中消失，所以有时候页面跳转慢，可能是在onPause/onCreate/onStart/onResume方法中做了耗时操作
- Fragment的生命周期与Activity同步，只要理解了上一张图，这个就很好理解

![图 - 5 带fragment的activity切换](http://upload-images.jianshu.io/upload_images/354846-40a43f1495bcc86a.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640)


