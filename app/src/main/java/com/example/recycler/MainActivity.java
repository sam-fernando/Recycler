package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    Button btn_addOne;

    //1.create list
    List<President> presidentList = new ArrayList<President>();



    //recycler view items
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1.1.fill above created list, new method is created at the bottom
        fillPresidentList();


        btn_addOne = findViewById(R.id.btn_addOne);
        btn_addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, add_edit_one.class);
                startActivity(intent);


            }
        });


        //giving value to recycler view
        recyclerView = (RecyclerView) findViewById(R.id.rv_presidentList);
        recyclerView.setHasFixedSize(true);

        //other required things
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new RecyclerViewAdapter (presidentList, MainActivity.this);
        recyclerView.setAdapter(mAdapter);

        //above all are copied from developer android page





    }

    //1.2.auto created fillPresidentList method
    private void fillPresidentList() {

        President p0 = new President(0,"George Washington", 1788, "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/160px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg");
        President p1 = new President(1, "John Adams", 1790, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/John_Adams%2C_Gilbert_Stuart%2C_c1800_1815.jpg/160px-John_Adams%2C_Gilbert_Stuart%2C_c1800_1815.jpg");
        President p2 = new President(2, "Brain Thomas", 1800, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/James_Monroe_White_House_portrait_1819.jpg/160px-James_Monroe_White_House_portrait_1819.jpg");
        President p3 = new President(3, "Katherine Dunn", 1815, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/John_Quincy_Adams_by_Charles_Osgood.jpg/160px-John_Quincy_Adams_by_Charles_Osgood.jpg");
        President p4 = new President(4, "Eric Perere", 1825, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg/160px-Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg");
        President p5 = new President(5, "HUman Boo", 1845, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/James_Abram_Garfield%2C_photo_portrait_seated.jpg/160px-James_Abram_Garfield%2C_photo_portrait_seated.jpg");
        President p6 = new President(6, "Mayor Kten", 1875, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Chester_Alan_Arthur.jpg/160px-Chester_Alan_Arthur.jpg");
        President p7 = new President(7,"Kelly One", 1890, "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Grover_Cleveland_-_NARA_-_518139_%28cropped%29.jpg/160px-Grover_Cleveland_-_NARA_-_518139_%28cropped%29.jpg");
        President p8 = new President(8, "Peter pan", 1900, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Gerald_Ford_presidential_portrait.jpg/160px-Gerald_Ford_presidential_portrait.jpg");
        President p9 = new President(9, "Lincoln Perera", 1925, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Official_portrait_of_Barack_Obama.jpg/160px-Official_portrait_of_Barack_Obama.jpg");

        //1.3. make above all items into a single list, it is easy because in one line all can be added
        presidentList.addAll(Arrays.asList(new President[]{p0,p1,p2,p3,p4,p5,p6,p7,p8,p9}));


    }
}