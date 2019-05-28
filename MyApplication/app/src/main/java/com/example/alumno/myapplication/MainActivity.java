package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.alumno.myapplication.models.XPath;

import java.util.ArrayDeque;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<XPath> mylistita = new ArrayList<>();

        XPath mypath = new XPath(-72.2795999, 42.9273863);
        mylistita.add(mypath);

        XPath mypath1 = new XPath(-72.2803831, 42.9273078);
        mylistita.add(mypath1);

        XPath mypath2 = new XPath(-72.2802758, 42.9267736);
        mylistita.add(mypath2);

        XPath mypath3 = new XPath(-72.2794604, 42.9268207);
        mylistita.add(mypath3);

        XPath mypath4 = new XPath(-72.2795892, 42.9273942);
        mylistita.add(mypath4);

        String url ="https://www.keene.edu/campus/maps/tool/?coordinates=";
        String ruta = "";



        Toast.makeText(this , String.format("Hay %s elementos", mylistita.size()), Toast.LENGTH_LONG).show();
        int i = 1;

        for (XPath o: mylistita){
            ruta += o.longitud + "%2C%20" + o.Latitud;

            if (i < mylistita.size()) {
                ruta += "%0A";
            }
            i++;
        }

            Log.v("dori",url + ruta);



        setContentView(R.layout.activity_main);
    }
}
