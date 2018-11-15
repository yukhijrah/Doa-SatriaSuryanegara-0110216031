package saha.app.kumpulandoa.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import saha.app.kumpulandoa.R;
import saha.app.kumpulandoa.adapter.DoaAdapter;
import saha.app.kumpulandoa.model.Doa;

public class DoaFragment extends Fragment {

    private List<Doa> doas = new ArrayList<>();

    RecyclerView lstDoa;
    LinearLayoutManager linear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_doa,container,false);
        lstDoa = view.findViewById(R.id.lst_doa);

        linear = new LinearLayoutManager(getActivity());
        lstDoa.setLayoutManager(linear);

        doasCollection();

        return view;
    }



    private void doasCollection(){
        doas.add(new Doa("Doa Masuk Masjid",  "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكٍَ", "Ya Allah, bukalah untukku pintu-pintu rahmat-Mu."));
        doas.add(new Doa( "Doa Keluar Masjid", "اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ فَضْلِكَ", "Ya Allah, sesungguhnya aku memohon keutamaan dari-Mu"));
        doas.add(new Doa( "Doa Sebelum Makan", "الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ", "Ya Allah, berkatilah rezeki yang engkau berikan kepada kami, dan peliharalah kami dari siksa api neraka"));
        doas.add(new Doa( "Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِيْنَ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِيْنَِ", "Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam"));
        doas.add(new Doa( "Doa Sesudah Wudhu", "اللَّهُمَّ اجْعَلْنِي مِنَ التَّوَّابِيْنَ وَاجْعَلْنِي مِنَ الْمُتَطَهِّرِيْنَِ", "Ya Allah jadikanlah aku termasuk orang-orang yang bertaubat dan orang-orang yang bersuci”"));
        doas.add(new Doa( "Doa Ketika Mendapat Mimpi Baik", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "Segala puji bagi Allah yang telah memberi hajatku"));
        doas.add(new Doa( "Doa Masuk Kamar Mandi", "باَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ", "Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan syetan perempuan"));
        doas.add(new Doa( "Doa Istinja", "اَللّٰهُمَّ طَهِّرُ قَلْبِىْ مِنَ النِّفَاقِ وَحَصِّنْ فَرْخِىْ مِنَ الْفَوَاحِشِ", "Wahai Tuhanku, sucikanlah hatiku dari sifat kepura-puraan (munafiq) serta peliharalah kemaluanku dari perbuatan keji"));
        doas.add(new Doa("Doa Masuk WC", "اَللّهُمَّ اِنِّيْ أَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَا إِثِ.ُ", "Wahai Tuhanku, sesungguhnya aku berlindung kepada-Mu dari segala kejahatan dan kotoran"));
        doas.add(new Doa("Doa Keluar WC", "اَلْحَمْدُ الِلّهِ الَّذِيْ أَذْ هَبَ عَنِّى اْلأَذَاى وَعَافَانِيْ.ُ", "Segala puji bagi Allah yang telah menghilangkan kotoranku dan membuatku sehat"));

        DoaAdapter adapter = new DoaAdapter(doas);

        lstDoa.setAdapter(adapter);

    }

}
