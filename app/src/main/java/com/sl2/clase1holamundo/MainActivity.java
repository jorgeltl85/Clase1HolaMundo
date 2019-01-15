package com.sl2.clase1holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String TAG1 = "MainActivity";
    private static final String TAG2 = "MainActivity";
    private TextView text_view_cabecera;
    // Comentario

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se busca y transforma la vista en una textview
        text_view_cabecera = (TextView) findViewById(R.id.texto1);
        text_view_cabecera.setText("Prueba");

        // Log.d(TAG, "onCreate: "+R.string.app_name);
        // Log.d(TAG1, "onCreate: "+R.string.despedida);
        Log.d(TAG2, "onCreate: "+ getString(R.string.despedida));

        Toast.makeText(this, "Son las 9 de la mañana", Toast.LENGTH_LONG).show();

    }

    /*
    //menu de opciones
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    //cuando se selecciona un item de un menu de opciones
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }*/

    public void clik_superior(View v){
        Toast.makeText(this, "Pulse el boton superior", Toast.LENGTH_LONG).show();
        text_view_cabecera.setText("Boton superior");
    }

    public void click_inferior(View v){
        Toast.makeText(this, "Pulse el boton inferior", Toast.LENGTH_LONG).show();
        text_view_cabecera.setText("Boton inferior");
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);

    }

}
