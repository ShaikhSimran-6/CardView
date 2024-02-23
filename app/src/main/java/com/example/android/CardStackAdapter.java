package com.example.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardStackAdapter extends RecyclerView.Adapter<CardStackAdapter.ViewHolder> {

    private List<ModalClass> modalClassList;

    public CardStackAdapter(List<ModalClass> modalClassList) {
        this.modalClassList = modalClassList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.setData(modalClassList.get(position));

    }

    @Override
    public int getItemCount() {
        return modalClassList.size();
    }

//    VIEW_HOLDER

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        Button one, two, three, four;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.question);
            one = itemView.findViewById(R.id.option_1);
            two = itemView.findViewById(R.id.option_2);
            three = itemView.findViewById(R.id.option_3);
            four = itemView.findViewById(R.id.option_4);

        }

        public void setData(ModalClass data) {
        }
    }

    public List<ModalClass> getModalClassList() {
        return modalClassList;
    }

    public void setModalClassList(List<ModalClass> modalClassList) {
        this.modalClassList = modalClassList;
    }
}
