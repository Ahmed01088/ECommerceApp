package com.example.e_commerce.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.e_commerce.fragments.AllFragment;
import com.example.e_commerce.fragments.BestSellarFragment;
import com.example.e_commerce.fragments.HomeFragment;
import com.example.e_commerce.fragments.ManFragment;
import com.example.e_commerce.fragments.WomanFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AllFragment();
            case 1:
                return new ManFragment();
            case 2:
                return new WomanFragment();
            case 3:
                return new BestSellarFragment();
            default:
                return new AllFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
