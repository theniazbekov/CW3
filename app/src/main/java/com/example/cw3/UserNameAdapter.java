package com.example.cw3;

import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cw3.databinding.ListHolderBinding;
import com.example.cw3.ui.data.UserNameModel;

import java.util.ArrayList;

public class UserNameAdapter extends RecyclerView.Adapter<UserNameAdapter.UserNameHolder> {
    ArrayList<UserNameModel> list = new ArrayList<>();


    public UserNameAdapter(ArrayList<UserNameModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserNameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserNameHolder(ListHolderBinding
                .inflate(LayoutInflater.from(parent
                        .getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserNameHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserNameHolder extends RecyclerView.ViewHolder {
        ArrayList<String> list = new ArrayList<>();
        private ListHolderBinding binding;

        public UserNameHolder(@NonNull ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserNameModel s) {
            binding.tvValue.setText((CharSequence) UserNameClient.getListOfNames());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }


    }
}
