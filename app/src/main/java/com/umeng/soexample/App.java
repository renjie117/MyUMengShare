package com.umeng.soexample;

import android.app.Application;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);
    }


    //各个平台的配置，建议放在全局Application或者程序入口
    {
        //微信 wx12342956d1cab4f9,a5ae111de7d9ea137e88a5e02c07c94d
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        //新浪微博
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad");
        /*最新的版本需要加上这个回调地址，可以在微博开放平台申请的应用获取，必须要有*/
        Config.REDIRECT_URL="http://sns.whalecloud.com/sina2/callback";
       //QQ
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");

    }
}
