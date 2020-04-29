package com.example.chelseaplayer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chelseaplayer.model.Player;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListPlayerAdapter extends RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder> {

    private Context context;

    private ArrayList<Player> listPlayer;

    ListPlayerAdapter(ArrayList<Player> list) {
        this.listPlayer = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Player player = listPlayer.get(position);


        Picasso.get()
                .load(player.getPhoto())
                .fit()
                .centerCrop()
                .placeholder(R.drawable.circle)
                .error(R.drawable.circle)
                .into(holder.playerPhoto);


        Picasso.get()
                .load(player.getCountry())
                .fit()
                .centerCrop()
                .placeholder(R.drawable.country)
                .error(R.drawable.country)
                .into(holder.playerCountry);


        holder.playerPosition.setText(player.getPosition());
        holder.playerName.setText(player.getName());

        holder.more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = v.getContext();
                Intent detailIntent = new Intent(context, Detail.class);
                detailIntent.putExtra("name", listPlayer.get(holder.getAdapterPosition()).getName());
                detailIntent.putExtra("photo", listPlayer.get(holder.getAdapterPosition()).getPhoto());
                detailIntent.putExtra("country", listPlayer.get(holder.getAdapterPosition()).getCountry());
                detailIntent.putExtra("position", listPlayer.get(holder.getAdapterPosition()).getPosition());
                detailIntent.putExtra("height", listPlayer.get(holder.getAdapterPosition()).getHeight());
                detailIntent.putExtra("weight", listPlayer.get(holder.getAdapterPosition()).getWeight());
                detailIntent.putExtra("match", listPlayer.get(holder.getAdapterPosition()).getMatch());
                detailIntent.putExtra("goal", listPlayer.get(holder.getAdapterPosition()).getGoal());
                detailIntent.putExtra("age",listPlayer.get(holder.getAdapterPosition()).getAge());
                context.startActivity(detailIntent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView playerName, playerPosition;
        CircleImageView playerPhoto;
        ImageView playerCountry;
        Button more;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            playerName = itemView.findViewById(R.id.txtPlayerName);
            playerPosition = itemView.findViewById(R.id.txtPositon);
            playerPhoto = itemView.findViewById(R.id.imgPlayer);
            playerCountry = itemView.findViewById(R.id.imgCountry);
            more = itemView.findViewById(R.id.btnMore);
        }
    }
}
