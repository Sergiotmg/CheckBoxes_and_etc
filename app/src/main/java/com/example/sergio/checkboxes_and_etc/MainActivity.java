package com.example.sergio.checkboxes_and_etc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5;
    String mensaje="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //siempre despues de la linea de setContentView porque esa linea es la que le dice el layout
        // que vamos a cargar
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);

    }

    public void sendButton(View view) {

        int count=0;// al pcipio nulo porque no hay checkeado
        if(cb1.isChecked()){
            mensaje+="  Fresas,";
            count++;
        }
        if(cb2.isChecked()){
            mensaje+=" Chocolate,";
            count++;
        }
        if(cb3.isChecked()){
            mensaje+=" Tartas,";
            count++;
        }
        if(cb4.isChecked()){
            mensaje+=" Melocotones,";
            count++;
        }
        if(cb5.isChecked()){
            mensaje+=" Melones,";
            count++;
        }
        String toastMessage="";
        if(count==1){
            //para quitarle la coma del final
            toastMessage= deleteLastChar(mensaje);//desde posicion 0 hasta posicion penultima porque la pos ultima es longitud -1 al empezar en 0

        } else if(count>1){
            toastMessage="Toppings:"+deleteLastChar(mensaje);
        }
        showToast(toastMessage);
        mensaje="";
    }



    private String deleteLastChar(String mensaje){
        return mensaje.substring(0,mensaje.length()-1);
    }

    private  void  showToast(String mensaje){
        Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show();

    }
}
