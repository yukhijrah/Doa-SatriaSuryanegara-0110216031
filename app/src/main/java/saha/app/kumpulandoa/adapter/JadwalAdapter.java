package saha.app.kumpulandoa.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import saha.app.kumpulandoa.R;
import saha.app.kumpulandoa.model.Jadwal;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalHolder> {

    private List<Jadwal> jadwals;
    public JadwalAdapter(List<Jadwal>jadwals){
        this.jadwals=jadwals;
    }
    @Override
    public JadwalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new JadwalHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jadwal,null));

    }

    @Override
    public void onBindViewHolder(JadwalHolder holder, int position) {
        holder.txtNama.setText(jadwals.get(position).getNama());
        holder.txtWaktu.setText(jadwals.get(position).getWaktu());

    }

    @Override
    public int getItemCount() {
        return jadwals.size();
    }


}

class JadwalHolder extends RecyclerView.ViewHolder{

    public TextView txtNama;
    public TextView txtWaktu;
    public View cardItemJadwal;

    public JadwalHolder(View itemView) {
        super(itemView);
        cardItemJadwal=itemView.findViewById(R.id.carditem_jadwal);
        txtNama=itemView.findViewById(R.id.txt_nama_jadwal);
        txtWaktu=itemView.findViewById(R.id.txt_waktu_jadwal);
    }
}
