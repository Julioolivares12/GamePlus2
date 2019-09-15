package com.julio.gameplus2.ui.masEsperados;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.julio.gameplus2.R;
import com.julio.gameplus2.adapters.MasEsperadosAdapter;
import com.julio.gameplus2.listeners.OnItemClickListener;
import com.julio.gameplus2.modelos.VideoJuego;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasEsperadosFragment extends Fragment {


    private List<VideoJuego> masEsperados= new ArrayList<>();
    public MasEsperadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mas_esperados, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rb_masEsperados);
        setUpRecyclerView(recyclerView);

        return view;
    }

    private void setUpRecyclerView(RecyclerView recyclerView) {
        recyclerView.setAdapter(new MasEsperadosAdapter(masEsperados, new OnItemClickListener() {
            @Override
            public void onClick(VideoJuego videoJuego) {

            }
        }));
    }


}
