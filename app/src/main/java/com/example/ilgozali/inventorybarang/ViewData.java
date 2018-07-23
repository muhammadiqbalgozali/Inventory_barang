package com.example.ilgozali.inventorybarang;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class ViewData extends ListActivity {
//variabel memanggil controller
    private DBDataSource dataSource;

    //variabel memanggil arraylist
    private ArrayList<Barang> values;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        //tampilan data yang dituju dan membuka controller
        dataSource = new DBDataSource(this);
        dataSource.open();

        //mengambil seluruh data
        values = dataSource.getAllBarang();

        //masukan data ke array adapternya
        ArrayAdapter<Barang> adapter = new ArrayAdapter<Barang>(this, android.R.layout.simple_list_item_1,values);

        //adapter pada list
        setListAdapter(adapter);
    }
}
