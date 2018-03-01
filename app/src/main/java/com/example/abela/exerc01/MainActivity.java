package com.example.abela.exerc01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.lvMain);
        List<Student> studentList = allStudents();
        ArrayAdapter<Student> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, studentList);
        list.setAdapter(adapter);
        this.mViewHolder.buttonNewStudent = (Button) findViewById(R.id.btNewStudent);
        this.mViewHolder.buttonNewCollege = (Button) findViewById(R.id.btNewCollege);
        this.mViewHolder.buttonNewStudent.setOnClickListener(this);
        this.mViewHolder.buttonNewCollege.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btNewStudent) {
            Intent it = new Intent(this, StudentActivity.class);
            startActivity(it);

        } if (id == R.id.btNewCollege){
            Intent it = new Intent(this, CollegeActivity.class);
            startActivity(it);;
        }
    }

        private static class ViewHolder {
            Button buttonNewStudent;
            Button buttonNewCollege;

        }

        private List <Student> allStudents(){
            return new ArrayList<>(Arrays.asList(
            new Student("Abelardo","abelardosamuel@hotmail.com"),
            new Student("João", "joaojose@gmail.com"),
            new Student("Marcos", "marcospst87@outlook.com")
            ));

        }

}
