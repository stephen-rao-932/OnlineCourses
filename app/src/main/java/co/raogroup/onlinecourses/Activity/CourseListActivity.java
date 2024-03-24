package co.raogroup.onlinecourses.Activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.raogroup.onlinecourses.Adapter.CoursesAdapter;
import co.raogroup.onlinecourses.Domain.CoursesDomain;
import co.raogroup.onlinecourses.R;
public class CourseListActivity extends AppCompatActivity {

  private RecyclerView.Adapter adapterCourseList;
  private RecyclerView recyclerViewCourse;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_course_list);

    Window window = getWindow();
    window.setStatusBarColor(ContextCompat.getColor(this,R.color.black));
    initRecyclerView();

  }

  private void initRecyclerView() {

    ArrayList<CoursesDomain> items = new ArrayList<>();

    items.add(new CoursesDomain("Advance certification program in AI",150,"ic_1"));
    items.add(new CoursesDomain("Google cloud platform Architecture",120,"ic_2"));
    items.add(new CoursesDomain("Fundamental of java Programing",100,"ic_3"));
    items.add(new CoursesDomain("Introduction to UI designs history",130,"ic_4"));
    items.add(new CoursesDomain("PG Program in Big Data Engineering",200,"ic_5"));

    recyclerViewCourse = findViewById(R.id.view);
    recyclerViewCourse.setLayoutManager(new LinearLayoutManager(CourseListActivity.this,LinearLayoutManager.VERTICAL,false));

    adapterCourseList = new CoursesAdapter(items);
    recyclerViewCourse.setAdapter(adapterCourseList);

  }
}