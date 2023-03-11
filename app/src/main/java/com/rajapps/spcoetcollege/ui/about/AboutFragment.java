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
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical Engineering","Welcome to the department of Mechanical engineering at SharadchandraPawar College of Engineering and Technology, Someshwarnagar, Tal-Baramati. The department was established in 2012 by offering undergraduate course B. E. (Mechanical Engineering). "));
        list.add(new BranchModel(R.drawable.ic_mech,"Civil Engineering","The educational mission of the Civil Engineering undergraduate program is to provide students with an multidisciplinary curriculum that is fundamental, yet broad and flexible, to produce graduates who are well-grounded in mathematical, scientific, and technical knowledge. The aim of department to motivate Civil Engineering students to grow the ability to analyze, evaluates, and design Civil Engineering systems; have the ability to communicate effectively. "));
        list.add(new BranchModel(R.drawable.ic_mech,"Electrical Engineering"," Department of Electrical Engineering was established in the year 2012, approved by AICTE New Delhi and affiliated to Savitribai Phule Pune University. Department is equipped with the state of art equipment’s and Laboratories with excellent computational facilities. Conducive environment exists in the department for both staff and students. Electrical Engineering is versatile and ever-green branch of Engineering. An Electrical Engineer can work in various specialized areas like Instrumentation & Control Engineering, Power Engineering, Switchgear & Protection Engineering, Dynamic Systems and Controls, Energy Audit & Management Systems, and most importantly in software field also."));

        adapter =new BranchAdapter(getContext(),list);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        //Picasso.get().load(item.getImage()).placeholder(R.drawable.teacher).into(holder.imageView);
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/my-college-app-admin.appspot.com/o/slideimg2.jpg?alt=media&token=7f91260c-05f3-4f5c-b65f-38374358e52c").into(imageView);



        return view;
    }
}