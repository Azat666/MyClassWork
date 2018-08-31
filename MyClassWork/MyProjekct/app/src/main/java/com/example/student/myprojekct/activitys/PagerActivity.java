package com.example.student.myprojekct.activitys;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.student.myprojekct.R;
import com.example.student.myprojekct.adapters.ViewPagerAdapter;
import com.example.student.myprojekct.models.ViewPagerModel;

import java.util.ArrayList;
import java.util.List;

public class PagerActivity extends AppCompatActivity {

    private final List<ViewPagerModel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);
        list.add(new ViewPagerModel(R.drawable.image2));
        list.add(new ViewPagerModel(R.drawable.image1));

        final ViewPagerAdapter adapter = new ViewPagerAdapter(this, list);
        final ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);

        final TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

    }
}
