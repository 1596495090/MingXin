package cn.longmingxin.longmingxin.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import cn.longmingxin.longmingxin.R;
import cn.longmingxin.longmingxin.base.BaseActivity;

/*
 * Created by zhy on 2018/9/18.
 * */
public class MainActivity extends BaseActivity implements View.OnClickListener {

    //
    private TextView skip;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        skip = (TextView) findViewById(R.id.skip);
        skip.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.skip:
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                finish();
                break;
        }

    }

}
