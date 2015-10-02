package com.example.usuario.terceraapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView editText4 = (TextView) findViewById(R.id.editText4);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void ClickSaludar(View view){
        TextView textSaludo = (TextView) findViewById(R.id.textSaludo);
        textSaludo.setText("hola mundo android");

        Button boton2 = (Button) findViewById(R.id.button2);
        boton2.setVisibility(view.INVISIBLE);
    }

    public void ClickBoton1(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4.getText() + "1");
    }
    public void ClickBoton2(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4.getText() + "2");
    }
    public void ClickBoton3(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4.getText() + "3");
    }
    public void ClickBoton4(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4.getText() + "4");
    }
    public void ClickBoton5(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4.getText() + "5");
    }
    public void ClickBoton6(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4.getText() + "6");
    }
    public void ClickBoton7(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4 + "7");
    }
    public void ClickBoton8(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4 + "8");
    }
    public void ClickBoton9(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4 + "9");
    }
    public void ClickBoton0(View view){
        TextView editText4 = (TextView) findViewById(R.id.editText4);
        editText4.setText(editText4 + "0");
    }
}
