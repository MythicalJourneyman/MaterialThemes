package com.mythicaljourneyman.materialthemes;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mythicaljourneyman.materialthemes.databinding.ActivityHomeBinding;
import com.mythicaljourneyman.materialthemes.databinding.LayoutColorBinding;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ActivityHomeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        setSupportActionBar(mBinding.appBarHome.toolbar);
        setTitle("");
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mBinding.drawerLayout, mBinding.appBarHome.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mBinding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);

        mBinding.navView.setNavigationItemSelectedListener(this);
        mBinding.appBarHome.contentHome.viewPager.setAdapter(new ViewPagerAdapter());

    }

    @Override
    public void onBackPressed() {
        if (mBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            mBinding.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_single_tone) {
            startActivity(ThemesActivity.getStartSingleToneIntent(this));
        } else if (id == R.id.nav_dual_tone) {
            startActivity(ThemesActivity.getStartDualToneIntent(this));
        } else if (id == R.id.nav_gradients) {
            startActivity(GradientsActivity.getStartIntent(this));
        } else if (id == R.id.nav_full_gradients) {
            startActivity(FullGradientActivity.getStartIntent(this));
        }

        mBinding.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


    class ViewPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return 19;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutColorBinding binding = DataBindingUtil.inflate(LayoutInflater.from(container.getContext()), R.layout.layout_color, container, false);
            String colorName = ColorsUtil.COLORS_NAME[position];
            final String[] colorText = ColorsUtil.COLORS_TEXT[position];
            final int[] colorValue = ColorsUtil.COLORS_VALUE[position];
            int[] colorTextValue = ColorsUtil.COLORS_TEXT_VALUE[position];

            binding.heading.setText(colorName);
            binding.heading.setTextColor(colorTextValue[0]);
            binding.container1.setBackgroundColor(colorValue[0]);
            binding.container2.setBackgroundColor(colorValue[0]);

            binding.text1.setTextColor(colorTextValue[0]);
            binding.text2.setText(colorText[0]);
            binding.text2.setTextColor(colorTextValue[0]);

            binding.text50.setTextColor(colorTextValue[1]);
            binding.color50.setText(colorText[1]);
            binding.color50.setTextColor(colorTextValue[1]);
            binding.container50.setBackgroundColor(colorValue[1]);
            binding.container50.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[1]);

                    return true;
                }
            });

            binding.text100.setTextColor(colorTextValue[2]);
            binding.color100.setText(colorText[2]);
            binding.color100.setTextColor(colorTextValue[2]);
            binding.container100.setBackgroundColor(colorValue[2]);
            binding.container100.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[2]);

                    return true;
                }
            });

            binding.text200.setTextColor(colorTextValue[3]);
            binding.color200.setText(colorText[3]);
            binding.color200.setTextColor(colorTextValue[3]);
            binding.container200.setBackgroundColor(colorValue[3]);
            binding.container200.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[3]);

                    return true;
                }
            });

            binding.text300.setTextColor(colorTextValue[4]);
            binding.color300.setText(colorText[4]);
            binding.color300.setTextColor(colorTextValue[4]);
            binding.container300.setBackgroundColor(colorValue[4]);
            binding.container300.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[4]);

                    return true;
                }
            });

            binding.text400.setTextColor(colorTextValue[5]);
            binding.color400.setText(colorText[5]);
            binding.color400.setTextColor(colorTextValue[5]);
            binding.container400.setBackgroundColor(colorValue[5]);
            binding.container400.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[5]);

                    return true;
                }
            });

            binding.text500.setTextColor(colorTextValue[6]);
            binding.color500.setText(colorText[6]);
            binding.color500.setTextColor(colorTextValue[6]);
            binding.container500.setBackgroundColor(colorValue[6]);
            binding.container500.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[6]);

                    return true;
                }
            });

            binding.text600.setTextColor(colorTextValue[7]);
            binding.color600.setText(colorText[7]);
            binding.color600.setTextColor(colorTextValue[7]);
            binding.container600.setBackgroundColor(colorValue[7]);
            binding.container600.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[7]);

                    return true;
                }
            });

            binding.text700.setTextColor(colorTextValue[8]);
            binding.color700.setText(colorText[8]);
            binding.color700.setTextColor(colorTextValue[8]);
            binding.container700.setBackgroundColor(colorValue[8]);
            binding.container700.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[8]);

                    return true;
                }
            });

            binding.text800.setTextColor(colorTextValue[9]);
            binding.color800.setText(colorText[9]);
            binding.color800.setTextColor(colorTextValue[9]);
            binding.container800.setBackgroundColor(colorValue[9]);
            binding.container800.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[9]);

                    return true;
                }
            });

            binding.text900.setTextColor(colorTextValue[10]);
            binding.color900.setText(colorText[10]);
            binding.color900.setTextColor(colorTextValue[10]);
            binding.container900.setBackgroundColor(colorValue[10]);
            binding.container900.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    copyToClipboard(colorText[10]);

                    return true;
                }
            });

            if (colorValue.length > 11) {
                binding.accentContainer.setVisibility(View.VISIBLE);

                binding.textA100.setTextColor(colorTextValue[11]);
                binding.colorA100.setText(colorText[11]);
                binding.colorA100.setTextColor(colorTextValue[11]);
                binding.containerA100.setBackgroundColor(colorValue[11]);
                binding.containerA100.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        copyToClipboard(colorText[11]);

                        return true;
                    }
                });

                binding.textA200.setTextColor(colorTextValue[12]);
                binding.colorA200.setText(colorText[12]);
                binding.colorA200.setTextColor(colorTextValue[12]);
                binding.containerA200.setBackgroundColor(colorValue[12]);
                binding.containerA200.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        copyToClipboard(colorText[12]);

                        return true;
                    }
                });

                binding.textA400.setTextColor(colorTextValue[13]);
                binding.colorA400.setText(colorText[13]);
                binding.colorA400.setTextColor(colorTextValue[13]);
                binding.containerA400.setBackgroundColor(colorValue[13]);
                binding.containerA400.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        copyToClipboard(colorText[13]);

                        return true;
                    }
                });

                binding.textA700.setTextColor(colorTextValue[14]);
                binding.colorA700.setText(colorText[14]);
                binding.colorA700.setTextColor(colorTextValue[14]);
                binding.containerA700.setBackgroundColor(colorValue[14]);
                binding.containerA700.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        copyToClipboard(colorText[14]);

                        return true;
                    }
                });
            } else {
                binding.accentContainer.setVisibility(View.GONE);
            }

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
