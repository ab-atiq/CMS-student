package com.atiq.cmsstudent.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.atiq.cmsstudent.R;
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
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.baseline_computer, "Computer Science", "This is description, This is description, This is description, This is description, This is description, This is description, "));
        list.add(new BranchModel(R.drawable.baseline_eee, "Electrical Engineering", "This is description, This is description, This is description, This is description, This is description, This is description, "));

        adapter = new BranchAdapter(getContext(), list);
        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.collage_image);
        Picasso.get().load(R.drawable.brur_gate).into(imageView);

        return view;
    }
}