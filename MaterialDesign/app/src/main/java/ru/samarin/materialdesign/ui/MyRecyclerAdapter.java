package ru.samarin.materialdesign.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ru.samarin.materialdesign.R;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private String[] dataText;
    private int[] dataPicture;
    int layout;

    public MyRecyclerAdapter(String[] dataText, int[] dataPicture, int layout) {
        this.dataText = dataText;
        this.dataPicture = dataPicture;
        this.layout = layout;
    }

    @NonNull
    @Override
    public MyRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerAdapter.ViewHolder holder, int position) {
        holder.setData(dataText[position], dataPicture[position]);
    }

    @Override
    public int getItemCount() {
        return dataText.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_adapter);
            imageView = itemView.findViewById(R.id.image_adapter);
        }

        void setData(final String dataText, final int dataPic) {
            textView.setText(dataText);

            imageView.setImageResource(dataPic);
        }
    }
}
