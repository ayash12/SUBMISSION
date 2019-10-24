package com.coolman.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCeo;
    private ArrayList<Ceo> list = new ArrayList<>();
    private ArrayList<Ceo> mItems;
    private String title = "Top CEO ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);
        rvCeo = findViewById(R.id.rv_ceo);
        rvCeo.setHasFixedSize(true);

        list.addAll(CeoData.getListData());

        showRecyclerCardView();
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    private void showRecyclerCardView(){
        rvCeo.setLayoutManager(new LinearLayoutManager(this));
        final ListCeoAdapter listCeoAdapter= new ListCeoAdapter(list);
        rvCeo.setAdapter(listCeoAdapter);
        listCeoAdapter.setOnItemClickCallback(new ListCeoAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Ceo data) {
                Intent moveIntent = new Intent(MainActivity.this, Detail.class);
                moveIntent.putExtra(Detail.EXTRA_NAME, data.getName());
                moveIntent.putExtra(Detail.EXTRA_DETAIL, data.getDetail());
                moveIntent.putExtra(Detail.EXTRA_CEKDETAIL, data.getCekdetail());
                moveIntent.putExtra(Detail.EXTRA_PHOTO, data.getPhoto());
                startActivity(moveIntent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profil,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent intent = new Intent(MainActivity.this, Profil.class);


                startActivity(intent);

                return true;

        }
        return false;
    }
}
