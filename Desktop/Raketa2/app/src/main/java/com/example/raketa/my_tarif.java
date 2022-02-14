package com.example.raketa;

import static android.view.KeyEvent.KEYCODE_BACK;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;

public class my_tarif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tarif);
        Bundle arguments = getIntent().getExtras();
        String OtvetSave = arguments.get("otvet").toString();
        String Otvet = OtvetSave;
        for (int i = 0; i < 4; i++) {
            Otvet = Otvet.substring(Otvet.indexOf("|") + 1);
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>Мой тариф</font>"));


        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();  // deprecated
        int height = display.getHeight();
        int height_1 = (int) height / 100;
        int width_1 = (int) width / 100;
        //отрисовка view_Ethernet
        View view_Ethernet = findViewById(R.id.view_Ethernet);
        view_Ethernet.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 90, height_1 * 40));
        view_Ethernet.setX(width_1 * 6);
        view_Ethernet.setY(height_1 * 5);
        //отрисовка заголовка Ethernet
        TextView TextView_Ethernet_Zagolovok = findViewById(R.id.textView_Ethernet);
        TextView_Ethernet_Zagolovok.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 70, height_1 * 5));
        TextView_Ethernet_Zagolovok.setX(width_1 * 10);
        TextView_Ethernet_Zagolovok.setY(height_1 * 8);
        TextView_Ethernet_Zagolovok.setTextColor(Color.rgb(228, 37, 39));
        //отрисовка белых прямоугольничков
        View view_White = findViewById(R.id.view_White);
        view_White.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 80, height_1 * 10));
        view_White.setX(width_1 * 11);
        view_White.setY(height_1 * 8 + TextView_Ethernet_Zagolovok.getLayoutParams().height + 20);
        //отрисовка названия тарифа
        TextView textView_tarif = findViewById(R.id.textView_tariff);
        textView_tarif.setLayoutParams(new LinearLayout.LayoutParams(width_1*41,height_1*4));
        textView_tarif.setX(width_1*14);
        textView_tarif.setY(view_White.getY()+width_1*5);
        String tarif_name = Otvet.substring(0,Otvet.indexOf("|"));
        Otvet=  Otvet.substring(Otvet.indexOf("|")+1);
        if(tarif_name.contains("Мег")) {
           textView_tarif.setText(tarif_name.substring(0, tarif_name.indexOf("Мег")));
        }
        else
        {
            textView_tarif.setText(tarif_name);
        }
        //отрисовка суммы тарифа
        TextView textView_summa_tarifa = findViewById(R.id.textView_summa_tarifa);
        textView_summa_tarifa.setLayoutParams(new LinearLayout.LayoutParams(width_1*21,height_1*9));
        textView_summa_tarifa.setX(width_1*56);
        textView_summa_tarifa.setY(view_White.getY()+width_1*3);
        String tarid_cena = Otvet.substring(0,Otvet.indexOf("|"));
        Otvet=  Otvet.substring(Otvet.indexOf("|")+1);
        tarid_cena=tarid_cena.substring(0,tarid_cena.indexOf("р")-1);
        textView_summa_tarifa.setText(tarid_cena);
        //textView_summa_text
        TextView textView_summa_text = findViewById(R.id.textView_summa_text);
        textView_summa_text.setLayoutParams(new LinearLayout.LayoutParams(width_1*10,height_1*4));
        textView_summa_text.setX(width_1*78);
        textView_summa_text.setY(view_White.getY()+width_1*3);
        textView_summa_text.setText("руб");
        //textView_MESYC_text
        TextView textView_MESYC_text = findViewById(R.id.textView_MESYC_text);
        textView_MESYC_text.setLayoutParams(new LinearLayout.LayoutParams(width_1*10,height_1*4));
        textView_MESYC_text.setX(width_1*78);
        textView_MESYC_text.setY(view_White.getY()+width_1*8);
        textView_MESYC_text.setText("мес");
        //
        TextView textView_speed = findViewById(R.id.textView_speed);
        textView_speed.setLayoutParams(new LinearLayout.LayoutParams(width_1*41,height_1*4));
        textView_speed.setX(width_1*14);
        textView_speed.setY(view_White.getY()+width_1*11);
        String speed = Otvet.substring(0,Otvet.indexOf("|"));
        textView_speed.setText("Скорость "+ speed+" Мбит/сек");
        //меню
        if (height>1700) {
            //вью-меню

            View viewmenu_2 = findViewById(R.id.viewmenu_tarif);
            viewmenu_2.setLayoutParams(new LinearLayout.LayoutParams(width, height));
            viewmenu_2.setY(height_1 * 85);
            //Textview_glavnay
            TextView textView_Glavnay = findViewById(R.id.textView_Glavnay);
            textView_Glavnay.setY(height_1 * 87);
            textView_Glavnay.setX(width_1 * 4);
            textView_Glavnay.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 25, height_1 * 3));
            //textView_tarif
            TextView textView_tarif_menu = findViewById(R.id.textView_tarif);
            textView_tarif_menu.setY(height_1 * 87);
            textView_tarif_menu.setX(width_1 * 29);
            textView_tarif_menu.setTextColor(Color.rgb(228, 37, 39));
            textView_tarif_menu.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            //textView_yvedomleniy
            TextView textView_yvedomleniy = findViewById(R.id.textView_yvedomleniy);
            textView_yvedomleniy.setY(height_1 * 87);
            textView_yvedomleniy.setX(width_1 * 65);
            textView_yvedomleniy.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
        }
        else {
            View viewmenu = findViewById(R.id.viewmenu_tarif);
            viewmenu.setLayoutParams(new LinearLayout.LayoutParams(width, height));
            viewmenu.setY(height_1 * 83);
            //Textview_glavnay
            TextView textView_Glavnay = findViewById(R.id.textView_Glavnay);
            textView_Glavnay.setY(height_1 * 84);
            textView_Glavnay.setX(width_1 * 4);
            textView_Glavnay.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 25, height_1 * 3));
            //textView_tarif
            TextView textView_tarif_menu = findViewById(R.id.textView_tarif);
            textView_tarif_menu.setY(height_1 * 84);
            textView_tarif_menu.setX(width_1 * 29);
            textView_tarif_menu.setTextColor(Color.rgb(228, 37, 39));
            textView_tarif_menu.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            //textView_yvedomleniy
            TextView textView_yvedomleniy = findViewById(R.id.textView_yvedomleniy);
            textView_yvedomleniy.setY(height_1 * 84);
            textView_yvedomleniy.setX(width_1 * 65);
            textView_yvedomleniy.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
        }
        //переход на главную
        TextView textView_Glavnay = findViewById(R.id.textView_Glavnay);
        Intent intent_home = new Intent(this, my_tarif.class);
        textView_Glavnay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_back();
            }
        });
        //
    }
    //переход на главную по кнопке
    public  void go_back()
    {
        this.finish();
    }
    //переход на главную из активитибар
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}