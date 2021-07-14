package com.example.miapprecycler_toolbarr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.miapprecycler_toolbarr.Adaptadores.Imagenes;

import java.util.ArrayList;
import java.util.List;

import static android.R.layout.simple_gallery_item;

public class MainActivity extends AppCompatActivity {

    GridView gridViewImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     gridViewImagenes= findViewById(R.id.grid_view_imagenes);
     gridViewImagenes.setAdapter(new Imagenes(this));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.item1:
                ArrayAdapter arrayAdapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1, (List) gridViewImagenes);
                break;
            case R.id.item2:

               //ArrayList lista = new ArrayList(this, simple_gallery_item,gridViewImagenes);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }



        return super.onOptionsItemSelected(item);
    }
}