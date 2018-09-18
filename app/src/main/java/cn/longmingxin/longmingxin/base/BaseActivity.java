package cn.longmingxin.longmingxin.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.zhy.autolayout.AutoLayoutActivity;

import cn.longmingxin.longmingxin.App.App;


public abstract class BaseActivity extends AutoLayoutActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getContentView());
        App.context = this;
    }

    @Override
    protected void onResume() {
        super.onResume();

        initView();
        initToolBar();
        initData();
    }


    //获取Activity布局
    protected abstract int getContentView();

    //初始化视图
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();

    //初始化标题栏
    protected abstract void initToolBar();



}
