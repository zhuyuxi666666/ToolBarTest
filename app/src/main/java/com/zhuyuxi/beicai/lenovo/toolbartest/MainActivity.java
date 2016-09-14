package com.zhuyuxi.beicai.lenovo.toolbartest;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;



    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar= (Toolbar) findViewById(R.id.toolbar);
     //   mToolbar.setNavigationIcon(R.mipmap.icon_back_32px);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"哈哈",Toast.LENGTH_LONG).show();

            }
        });
        mToolbar.inflateMenu(R.menu.menu_main);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
               int id=item.getItemId();
                if(id==R.id.action_settings){
                    Toast.makeText(MainActivity.this,"哈哈2",Toast.LENGTH_LONG).show();
              return true;
                }
                return false;

            }
        });
    }
}