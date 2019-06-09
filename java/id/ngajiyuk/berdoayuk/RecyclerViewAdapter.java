package id.ngajiyuk.berdoayuk;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContext;
    private List<Doa> mData;

    public RecyclerViewAdapter(Context mContext, List<Doa> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_doa,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_namadoa.setText(mData.get(position).getTitle());
        holder.icon_doa.setImageResource(mData.get(position).getGambar());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,DetailDoaActivity.class);

                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Doa",mData.get(position).getDoa());
                intent.putExtra("Latin",mData.get(position).getLatin());
                intent.putExtra("Terjemah",mData.get(position).getTerjemah());
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_namadoa;
        ImageView icon_doa;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_namadoa = (TextView) itemView.findViewById(R.id.title);
            icon_doa = (ImageView)itemView.findViewById(R.id.icon_doa);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id) ;
        }
    }
}

