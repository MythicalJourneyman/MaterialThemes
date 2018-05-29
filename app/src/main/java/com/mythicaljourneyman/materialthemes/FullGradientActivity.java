package com.mythicaljourneyman.materialthemes;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.mythicaljourneyman.materialthemes.databinding.ActivityFullGradientBinding;
import com.mythicaljourneyman.materialthemes.databinding.LayoutFullGradientItemBinding;

public class FullGradientActivity extends AppCompatActivity {
    ActivityFullGradientBinding mBinding;
    private int[] mGradients = {
            R.drawable.gradient_background3a,
            R.drawable.gradient_background3b,
            R.drawable.gradient_background4a,
            R.drawable.gradient_background4b,
            R.drawable.gradient_background1a,
            R.drawable.gradient_background1b,
            R.drawable.gradient_background2a,
            R.drawable.gradient_background2b,
            R.drawable.gradient_background5a,
            R.drawable.gradient_background5b,
            R.drawable.gradient_background6a,
            R.drawable.gradient_background6b,
            R.drawable.gradient_background7a,
            R.drawable.gradient_background7b,
            R.drawable.gradient_background8a,
            R.drawable.gradient_background8b,
            R.drawable.gradient_background9a,
            R.drawable.gradient_background9b,
            R.drawable.gradient_background10a,
            R.drawable.gradient_background10b,
            R.drawable.gradient_background11a,
            R.drawable.gradient_background11b,
            R.drawable.gradient_background12a,
            R.drawable.gradient_background12b,
            R.drawable.gradient_background13a,
            R.drawable.gradient_background13b,
            R.drawable.gradient_background14a,
            R.drawable.gradient_background14b,
            R.drawable.gradient_background15a,
            R.drawable.gradient_background15b,
            R.drawable.gradient_background16a,
            R.drawable.gradient_background16b};

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, FullGradientActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_full_gradient);
        mBinding.viewpager.setAdapter(new GradientAdapter());
        setSupportActionBar(mBinding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    class GradientAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mGradients.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutFullGradientItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(container.getContext()), R.layout.layout_full_gradient_item, container, false);
            binding.container.setBackgroundResource(mGradients[position]);
            container.addView(binding.getRoot());
            return binding.getRoot();
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }
    }

}

