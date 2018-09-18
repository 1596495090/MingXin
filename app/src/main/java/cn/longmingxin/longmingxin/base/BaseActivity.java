package cn.longmingxin.longmingxin.base;

import com.zhy.autolayout.AutoLayoutActivity;
import cn.longmingxin.longmingxin.App.App;


public abstract class BaseActivity extends AutoLayoutActivity {


    @Override
    protected void onResume() {
        super.onResume();
        App.context = this;
        setContentView(getContentView());
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
