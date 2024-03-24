package co.raogroup.onlinecourses.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import co.raogroup.onlinecourses.Domain.CoursesDomain;
import co.raogroup.onlinecourses.R;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.Viewholder> {

  ArrayList<CoursesDomain> item;
  Context context;

  public CoursesAdapter(ArrayList<CoursesDomain> item) {
    this.item = item;
  }

  @NonNull
  @Override
  public CoursesAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View inflator = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_list, parent, false);
    context = parent.getContext();
    return new Viewholder(inflator);
  }

  @Override
  public void onBindViewHolder(@NonNull CoursesAdapter.Viewholder holder, int position) {
    holder.title.setText(item.get(position).getTitle());
    holder.price.setText("$" + item.get(position).getPrice());

    int drawableResourceId = holder.itemView.getResources().getIdentifier(item.get(position).getPicPath(), "drawable", holder.itemView.getContext().getPackageName());

    Glide.with(context)
            .load(drawableResourceId).into(holder.pic);

    switch (position) {

      case 0:
        holder.background_img.setBackgroundResource(R.drawable.bg_1);
        holder.layout.setBackgroundResource(R.drawable.list_bacground_1);
        break;
      case 1:
        holder.background_img.setBackgroundResource(R.drawable.bg_2);
        holder.layout.setBackgroundResource(R.drawable.list_bacground_2);
        break;
      case 2:
        holder.background_img.setBackgroundResource(R.drawable.bg_3);
        holder.layout.setBackgroundResource(R.drawable.list_bacground_3);
        break;
      case 3:
        holder.background_img.setBackgroundResource(R.drawable.bg_4);
        holder.layout.setBackgroundResource(R.drawable.list_bacground_4);
        break;
      case 4:
        holder.background_img.setBackgroundResource(R.drawable.bg_5);
        holder.layout.setBackgroundResource(R.drawable.list_bacground_5);
        break;

    }

  }

  @Override
  public int getItemCount() {
    return item.size();
  }

  public class Viewholder extends RecyclerView.ViewHolder {

    TextView title, price;
    ImageView pic, background_img;
    ConstraintLayout layout;

    public Viewholder(@NonNull View itemView) {
      super(itemView);
      title = itemView.findViewById(R.id.title);
      price = itemView.findViewById(R.id.price);
      pic = itemView.findViewById(R.id.pic);
      background_img = itemView.findViewById(R.id.background_img);
      layout = itemView.findViewById(R.id.main_layout);
    }
  }
}
