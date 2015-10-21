package com.example.llw.demo_fargment2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button button1;
    private HheFragment hheFragment;
    private NbkFragment nbkFragment;
    private FragmentManager fragmentManager;

    private void assignViews() {
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        fragmentManager = getFragmentManager();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                setelection(0);
                break;

            case R.id.button1:
                setelection(1);
                break;

        }

    }


    private void setelection(int index) {
        cleanrall();//清除按钮上一次的状态

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        dowork(fragmentTransaction);//屏蔽所有的fragment
        switch (index) {
            case 0:
                button.setBackgroundColor(Color.RED);
                button.setTextColor(Color.WHITE);
                if (nbkFragment == null) {
                    nbkFragment = new NbkFragment();
                    fragmentTransaction.add(R.id.farm,nbkFragment);
                }else {
                    fragmentTransaction.show(nbkFragment);
                }

                break;
            case 1:
                button1.setBackgroundColor(Color.RED);
                button1.setTextColor(Color.WHITE);
                if (hheFragment == null) {
                    hheFragment = new HheFragment();
                    fragmentTransaction.add(R.id.farm,hheFragment);
                }else {
                    fragmentTransaction.show(hheFragment);
                }
                break;
        }

        fragmentTransaction.commit();

    }

    private void cleanrall() {
        button.setTextColor(Color.BLACK);
        button.setBackgroundColor(Color.WHITE);
        button1.setTextColor(Color.BLACK);
        button1.setBackgroundColor(Color.WHITE);
    }

    private void dowork(FragmentTransaction fragmentTransaction) {

        if (nbkFragment != null) {
            fragmentTransaction.hide(nbkFragment);
        }

        if (hheFragment != null) {
            fragmentTransaction.hide(hheFragment);
        }
    }

}
