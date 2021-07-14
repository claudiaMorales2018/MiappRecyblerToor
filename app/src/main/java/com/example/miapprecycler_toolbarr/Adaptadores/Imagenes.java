package com.example.miapprecycler_toolbarr.Adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.miapprecycler_toolbarr.R;

import java.util.ArrayList;

public class Imagenes extends BaseAdapter {
  public   Context context;

  public  int []imagenesArray = {

          R.drawable.imagen1,
          R.drawable.imagen2,
          R.drawable.imagen3,
          R.drawable.imagen4,
          R.drawable.imagen5,
          R.drawable.imagen6,
          R.drawable.imagen7,
          R.drawable.imagen8,
          R.drawable.imagen8,
          R.drawable.imagen9,
          R.drawable.imagen12,
          R.drawable.imagen13,
          R.drawable.imagen14,


  };

    public Imagenes(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.imagenesArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imagenesArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imagenesArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new ViewGroup.LayoutParams(
                        340,
                        350
                ));


        return imageView;
    }
}
