package vp.com.farmatodo.activities;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vp.com.farmatodo.R;
import vp.com.farmatodo.databinding.MainLayoutBinding;
import vp.com.farmatodo.fragment.CharactersFragment;
import vp.com.farmatodo.fragment.ComicFragment;
import vp.com.farmatodo.fragment.EventsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.main_layout);
        setSupportActionBar(binding.toolbar);
        binding.mainContainer.setAdapter(new MainActivityFragmentPagerAdapter(getSupportFragmentManager()));
        //binding.tabs.setupWithViewPager(binding.mainContainer);
    }

    public class MainActivityFragmentPagerAdapter extends FragmentPagerAdapter {
        final int PAGE_COUNT = 2;

        public MainActivityFragmentPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ComicFragment();
                case 1:

                default:
//                    return new ComicFragment();
                    //return new CharactersFragment();
                    return new EventsFragment();
            }
        }

        @Override public CharSequence getPageTitle(int position) {
            return position == 0 ? "Comics" : "Characters";
        }

        @Override public int getCount() {
            return PAGE_COUNT;
        }
    }
}
