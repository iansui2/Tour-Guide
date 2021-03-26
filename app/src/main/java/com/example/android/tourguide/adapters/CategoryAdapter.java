package com.example.android.tourguide.adapters;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.tourguide.fragments.PublicPlacesFragment;
import com.example.android.tourguide.R;
import com.example.android.tourguide.fragments.RestaurantsFragment;
import com.example.android.tourguide.fragments.TopAttractionsFragment;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new TopAttractionsFragment();
        } else if(position==1) {
            return new RestaurantsFragment();
        } else {
            return new PublicPlacesFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0) {
            return mContext.getString(R.string.top_attractions);
        } else if(position==1) {
            return mContext.getString(R.string.restaurants);
        } else {
            return mContext.getString(R.string.public_places);
        }
    }
}
