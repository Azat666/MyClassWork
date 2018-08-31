package com.example.student.myprojekct.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.student.myprojekct.R;
import com.example.student.myprojekct.activitys.SecondActivity;
import com.example.student.myprojekct.models.ViewPagerModel;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {


        private final Context context;
        private final List<ViewPagerModel> list;

        public ViewPagerAdapter(final Context context, final List<ViewPagerModel> list) {
            this.context = context;
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view.equals(object);
        }


        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            final View view = LayoutInflater.from(context).inflate(R.layout.pager_item, container, false);
            final ImageButton imageButton = view.findViewById(R.id.image_button);
            imageButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    final Intent intent = new Intent(context, SecondActivity.class);
                    context.startActivity(intent);
                }
            });
            final ImageView imageView = view.findViewById(R.id.image_view);
            imageView.setImageResource(list.get(position).getImageId());
            container.addView(view);
            return view;
        }


}
