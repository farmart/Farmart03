package com.example.fujimiya.farmmart;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LihatDataFragment extends Fragment {

    RecyclerView rv;
    MyRecyclerAdapter adapter;
    CardView cv;


    public LihatDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lihat_data, container, false);

        cv = (CardView) view.findViewById(R.id.cardlist_item);
        rv = (RecyclerView) view.findViewById(R.id.home_recyclerview);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setItemAnimator(new DefaultItemAnimator());

        //Adapter
        if (adapter == null) {
            adapter = new MyRecyclerAdapter(this.getActivity());
            rv.setAdapter(adapter);
        }

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TambahDataFragment tambahDataFragment = new TambahDataFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmen_maps,tambahDataFragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

}
