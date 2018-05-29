package com.mythicaljourneyman.materialthemes;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mythicaljourneyman.materialthemes.databinding.ActivityMainBinding;
import com.mythicaljourneyman.materialthemes.databinding.LayoutThemeOneBinding;

public class ThemesActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    public static Intent getStartSingleToneIntent(Context context) {
        Intent intent = new Intent(context, ThemesActivity.class);
        intent.putExtra("type", 0);
        return intent;
    }

    public static Intent getStartDualToneIntent(Context context) {
        Intent intent = new Intent(context, ThemesActivity.class);
        intent.putExtra("type", 1);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(mBinding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int type = getIntent().getIntExtra("type", 0);
        int[][] colors;
        if (type == 0) {
            setTitle("Single Tone");
            colors = ColorsUtil.getSingleToneColorArray();
        } else {
            setTitle("Dual Tone");
            colors = ColorsUtil.getDualToneColorArray();

        }
        mBinding.viewPager.setAdapter(new ViewPagerAdapter(colors[0], colors[1]));

        final int[] colorValue = colors[2];
        getWindow().setStatusBarColor(colorValue[0]);

        mBinding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                getWindow().setStatusBarColor(colorValue[position]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

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

    class ViewPagerAdapter extends PagerAdapter {
        final int[] colorPrimaryValue;
        final int[] colorAccentValue;

        public ViewPagerAdapter(int[] colorPrimaryValue, int[] colorAccentValue) {
            this.colorPrimaryValue = colorPrimaryValue;
            this.colorAccentValue = colorAccentValue;
        }

        @Override
        public int getCount() {
            return colorPrimaryValue.length;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutThemeOneBinding binding = DataBindingUtil.inflate(LayoutInflater.from(container.getContext()), R.layout.layout_theme_one, container, false);
            int colorAccent = colorAccentValue[position];
            binding.toolbar.setBackgroundColor(colorPrimaryValue[position]);
            binding.button1.setTextColor(colorAccent);
            binding.button9.setTextColor(colorAccent);
            binding.button12.setTextColor(colorAccent);
            binding.button15.setTextColor(colorAccent);
            binding.button18.setTextColor(colorAccent);
            binding.button21.setTextColor(colorAccent);
            binding.button24.setTextColor(colorAccent);
            binding.button27.setTextColor(colorAccent);
            binding.button30.setTextColor(colorAccent);
            binding.button33.setTextColor(colorAccent);
            binding.button36.setTextColor(colorAccent);
            binding.button39.setTextColor(colorAccent);
            binding.button42.setTextColor(colorAccent);
            binding.button45.setTextColor(colorAccent);
            binding.heading.setTextColor(colorAccent);
            binding.heading1.setTextColor(colorAccent);
            binding.heading2.setTextColor(colorAccent);
            binding.heading3.setTextColor(colorAccent);
            binding.heading4.setTextColor(colorAccent);
            binding.heading5.setTextColor(colorAccent);
            binding.heading6.setTextColor(colorAccent);
            binding.heading7.setTextColor(colorAccent);
            binding.heading8.setTextColor(colorAccent);
            binding.heading9.setTextColor(colorAccent);
            binding.heading10.setTextColor(colorAccent);
            binding.heading11.setTextColor(colorAccent);
            binding.heading12.setTextColor(colorAccent);
            binding.heading13.setTextColor(colorAccent);
            binding.fab.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button0.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button8.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button11.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button14.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button17.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button20.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button23.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button26.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button29.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button32.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button35.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button38.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button41.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button44.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button2.setBackgroundTintList(ColorStateList.valueOf(colorAccent));
            binding.button3.setButtonTintList(ColorStateList.valueOf(colorAccent));
            binding.button4.setButtonTintList(ColorStateList.valueOf(colorAccent));

            int[][] states = new int[][]{
                    new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, // enabled
                    new int[]{android.R.attr.state_enabled, -android.R.attr.state_checked}, // enabled
                    new int[]{-android.R.attr.state_enabled}, // disabled
                    new int[]{android.R.attr.state_pressed}  // pressed
            };

            int[] colors = new int[]{
                    colorAccent,
                    0xffd3d3d3,
                    0xffd3d3d3,
                    colorAccent,
            };
            int[] colorsA = new int[]{
                    0xffd3d3d3,
                    0xfff3f3f3,
                    0xfff3f3f3,
                    0xffd3d3d3,
            };

            binding.button5.setThumbTintList(new ColorStateList(states, colors));
            binding.button5.setTrackTintList(new ColorStateList(states, colorsA));
            binding.button6.setThumbTintList(ColorStateList.valueOf(colorAccent));
            binding.button6.setProgressTintList(ColorStateList.valueOf(colorAccent));
            binding.button7.setProgressTintList(ColorStateList.valueOf(colorAccent));
            container.addView(binding.getRoot());
            return binding.getRoot();
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }
    }

    private void copyToClipboard(String color) {
        ClipboardManager clipboard = (ClipboardManager)
                getSystemService(Context.CLIPBOARD_SERVICE);

        ClipData clip = ClipData.newPlainText("Color", color);
        clipboard.setPrimaryClip(clip);

        Toast.makeText(this, "Copied '" + color + "'", Toast.LENGTH_SHORT).show();
    }
}
