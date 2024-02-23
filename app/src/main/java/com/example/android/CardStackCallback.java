package com.example.android;

import androidx.recyclerview.widget.DiffUtil;

import java.util.List;
import java.util.Objects;

public class CardStackCallback extends DiffUtil.Callback {

    private List<ModalClass> oldList, newList;

    public CardStackCallback(List<ModalClass> oldList, List<ModalClass> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return Objects.equals(oldList.get(oldItemPosition).getQuestion(), newList.get(newItemPosition).getQuestion());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
//        return oldList.get(oldItemPosition) == newList.get(newItemPositioncv );
    }
}
