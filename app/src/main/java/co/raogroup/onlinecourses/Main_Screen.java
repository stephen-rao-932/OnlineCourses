package co.raogroup.onlinecourses;

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




  }
}