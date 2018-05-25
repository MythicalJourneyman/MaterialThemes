package com.mythicaljourneyman.materialthemes;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mythicaljourneyman.materialthemes.databinding.ActivityColorChoosingBinding;

public class ColorChoosingActivity extends AppCompatActivity {
    ActivityColorChoosingBinding mBinding;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, ColorChoosingActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_color_choosing);
    }
}
