package com.example.examen_final.Activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen_final.Adapters.CategoryAdapter;
import com.example.examen_final.Adapters.PupolarAdapter;
import com.example.examen_final.Domains.CategoryDomain;
import com.example.examen_final.Domains.PopularDomain;
import com.example.examen_final.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular, adapterCat;
    private RecyclerView recyclerViewPopular,recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Mar del caribe, avenida lago","Playa Miami","Esta casa de 2 dormitorios / 1 baño cuenta con una enorme," +
                "Vista a la playa y a las islas" +
                "Características arquitectónicas y acabados de alta gama." +
                "Siéntete inspirado por las islas y el aire libre" +
                "y el aire libre, por los impresionantes" +
                " artesanos del lugar.",2,true,4.8,"pic1",true,1000));

        items.add(new PopularDomain("Passo Rolle, TN","Playa Miami","Este apartamento de 3 dormitorios / 2 baños ofrece una espectacular," +
                "vista al mar y a las islas cercanas." +
                "Cuenta con detalles arquitectónicos y acabados de alta calidad." +
                "Siéntete inspirado por el entorno natural y la brisa marina," +
                "disfrutando de la impresionante artesanía local.",3,false,5,"pic2",false,2500));
        items.add(new PopularDomain("Mar del caribe, avenida lago","Playa Miami","This 2 bed /1 bath home boasts an enormous," +
                "open-living plan accented by striking" +
                "architectural features and high-end finishes." +
                "Feel inspired by open sight lines that" +
                "embrace the outdoors, crowned by stunning" +
                "coffered ceilings.",3,true,4.3,"pic3",true,30000));
        recyclerViewPopular=findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular=new PupolarAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);


        ArrayList<CategoryDomain> catsList=new ArrayList<>();
        catsList.add(new CategoryDomain("Playas","cat1"));
        catsList.add(new CategoryDomain("Campamentos","cat2"));
        catsList.add(new CategoryDomain("Bosque","cat3"));
        catsList.add(new CategoryDomain("Desierto","cat4"));
        catsList.add(new CategoryDomain("Montañas","cat5"));

        recyclerViewCategory=findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat=new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);
    }
}