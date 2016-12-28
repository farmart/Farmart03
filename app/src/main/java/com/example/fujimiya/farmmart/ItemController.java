package com.example.fujimiya.farmmart;

/**
 * Created by fujimiya on 12/25/16.
 */

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.security.PublicKey;


public class ItemController extends RecyclerView.ViewHolder implements View.OnClickListener {

    //Variable
    CardView cardItemLayout;
    ImageView icon; // Picture
    TextView title;
    TextView subTitle;
    Intent i;

    Firebase FUref;

    public ItemController(View itemView) {
        super(itemView);

        //Set id
        cardItemLayout = (CardView) itemView.findViewById(R.id.cardlist_item);

        //Tambahan untuk id Picture


        //id Text
        title = (TextView) itemView.findViewById(R.id.listitem_name);
        subTitle = (TextView) itemView.findViewById(R.id.listitem_subname);

        //onClick
        itemView.setOnClickListener(this);

    }


    public String kunci;
    public View view;
    @Override
    public void onClick(View v) {
        view = v;
        //tampilkan toas ketika click
        final int urut = Integer.parseInt(String.format("%d", getAdapterPosition()));


        Firebase.setAndroidContext(v.getContext());
/*
        FUref = new Firebase("https://farmart-8d3e5.firebaseio.com/petani");
        FUref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                for (DataSnapshot child : dataSnapshot.getChildren()) {

                    if (child.child("nama").getValue().toString().equals(MyRecyclerAdapter.FNamaPetani.get(urut))){
                        String key = (String) child.getKey();

                        kunci = key;
                        Toast.makeText(view.getContext(),kunci, Toast.LENGTH_LONG).show();
                    }

                }


            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
*/


        //Toast.makeText(v.getContext(),String.format("%d", getAdapterPosition()),Toast.LENGTH_SHORT).show();
        //Toast.makeText(v.getContext(), "" + MyRecyclerAdapter.FNamaPetani.get(urut), Toast.LENGTH_SHORT).show();


    }

}