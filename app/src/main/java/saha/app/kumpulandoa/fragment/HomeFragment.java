package saha.app.kumpulandoa.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import saha.app.kumpulandoa.R;
import saha.app.kumpulandoa.adapter.JadwalAdapter;
import saha.app.kumpulandoa.model.Jadwal;

public class HomeFragment extends Fragment {
    private List<Jadwal>jadwals=new ArrayList<>();

    RecyclerView lstJadwal;
    LinearLayoutManager linear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_home,container,false);
        lstJadwal=view.findViewById(R.id.lst_jadwal);
        linear=new LinearLayoutManager(getActivity());
        lstJadwal.setLayoutManager(linear);

        JadwalAdapter adapter = new JadwalAdapter(jadwals);
        lstJadwal.setAdapter(adapter);

        jadwalsCollect();

        return view;
    }
    private void jadwalsCollect(){
        jadwals.add(new Jadwal("Imsak","03:55 AM"));
        jadwals.add(new Jadwal("Subuh","04:05 AM"));
        jadwals.add(new Jadwal("Fajr","05:22 AM"));
        jadwals.add(new Jadwal("Dzuhur","11:39 AM"));
        jadwals.add(new Jadwal("Ashar","03:00 PM"));
        jadwals.add(new Jadwal("Maghrib","05:51 PM"));
        jadwals.add(new Jadwal("Isya","07.04 PM"));
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
