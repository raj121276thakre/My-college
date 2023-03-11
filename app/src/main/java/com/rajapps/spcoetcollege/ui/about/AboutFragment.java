package com.rajapps.spcoetcollege.ui.about;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.rajapps.spcoetcollege.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

private ViewPager viewPager;
private BranchAdapter adapter;
private List<BranchModel> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        list= new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp,"Computer Science","Department of computer engineering balances the practical and theoretical aspects of computer engineering and provide student with background for professional employment. The department has always been on a high growth path and to keep pace with the current technological trends and technology."));
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical","Welcome to the department of Mechanical engineering at SharadchandraPawar College of Engineering and Technology, Someshwarnagar, Tal-Baramati. The department was established in 2012 by offering undergraduate course B. E. (Mechanical Engineering). "));

        adapter =new BranchAdapter(getContext(),list);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        //Picasso.get().load(item.getImage()).placeholder(R.drawable.teacher).into(holder.imageView);
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/my-college-app-admin.appspot.com/o/slideimg2.jpg?alt=media&token=7f91260c-05f3-4f5c-b65f-38374358e52c").into(imageView);



        return view;
    }
}