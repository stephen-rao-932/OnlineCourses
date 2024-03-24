package co.raogroup.onlinecourses.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import co.raogroup.onlinecourses.databinding.ActivityMainScreenBinding;

public class Main_Screen extends AppCompatActivity {

  ActivityMainScreenBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityMainScreenBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());


    binding.seeAll.setOnClickListener(v -> {
      startActivity(new Intent(Main_Screen.this,CourseListActivity.class));
    });


  }
}