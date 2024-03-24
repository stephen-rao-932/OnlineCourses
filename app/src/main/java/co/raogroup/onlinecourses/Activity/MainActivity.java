package co.raogroup.onlinecourses.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import co.raogroup.onlinecourses.databinding.ActivityIntoBinding;

public class MainActivity extends AppCompatActivity {

  ActivityIntoBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityIntoBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    binding.imageView5.setOnClickListener(v -> {

      startActivity(new Intent(MainActivity.this, Main_Screen.class));

    });

  }
}