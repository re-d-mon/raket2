package com.example.raketa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();  // deprecated
        int height = display.getHeight();  // deprecated

        double d = height / 18;
        int dd = (int) d * 2;


        TextView Фио = findViewById(R.id.Фио);
        TextView Balance = findViewById(R.id.textView_balance);
        TextView Dogovor = findViewById(R.id.textView_dogovor);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView = findViewById(R.id.textView_Glavnay);
        TextView textView2 = findViewById(R.id.textView_yvedomleniy);


       // textView.setY(height - (int) (d * 1.7));
        textView2.setY(height - (int) (d * 1.7));
        //отрисовка картинки чувака
        ImageView rectangle = findViewById(R.id.rectangle);
        dd = width+width/10;
        rectangle.setLayoutParams(new LinearLayout.LayoutParams(dd, height));
        dd=(int) -dd/100*5;
        rectangle.setX(dd);
        dd = (int) height/100*20;
        rectangle.setY(-dd);
        //переменные
        int width_1 = width/100;
        int height_1 = height/100;
        //Фио
        Фио.setX (width_1*5);
        Dogovor.setX(width_1*5);
        //
        //отрисовка баланса
        TextView textView_balance = findViewById(R.id.textView_balance);
        dd =(int) height/100 * 37;
        textView_balance.setLayoutParams(new LinearLayout.LayoutParams(width_1*70, height));
        textView_balance.setY(dd);
        textView_balance.setX(width_1*5);
        //
        dd=(int)height/100*35;
        textView4.setY(dd);
        textView4.setX(width_1*5);
        //отрисовка римунка кошелька
        dd = width/100*20;
        ImageView imageButton = findViewById(R.id.imageButton);
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(dd, dd));
        imageButton.setY(height_1*38);
        imageButton.setX(width_1*75);
        //отрисовка рекламы
        View view = findViewById(R.id.view);
        view.setY(height_1*50);
        //
        TextView Zagalovok_reklami = findViewById(R.id.Zagalovok_reklami);
        Zagalovok_reklami.setY(height_1*50);
        Zagalovok_reklami.setX(width_1*5);
        Zagalovok_reklami.setLayoutParams(new LinearLayout.LayoutParams(width_1*90, height_1*5));
        Zagalovok_reklami.setBackgroundResource(android.R.color.transparent);
        //отрисовка рекламы/объявлений
        TextView reklama = findViewById(R.id.reklama);
        reklama.setBackgroundResource(android.R.color.transparent);
        reklama.setLayoutParams(new LinearLayout.LayoutParams(width_1*90, height_1*30));
        reklama.setY(Zagalovok_reklami.getY() + Zagalovok_reklami.getLayoutParams().height + 10);
        reklama.setX(width_1*5);
        if (height>1700) {
            //вью-меню

            View viewmenu = findViewById(R.id.viewmenu);
            viewmenu.setLayoutParams(new LinearLayout.LayoutParams(width, height));
            viewmenu.setY(height_1 * 94);
            //Textview_glavnay
            TextView textView_Glavnay = findViewById(R.id.textView_Glavnay);
            textView_Glavnay.setY(height_1 * 96);
            textView_Glavnay.setX(width_1 * 4);
            textView_Glavnay.setTextColor(Color.rgb(228, 37, 39));
            textView_Glavnay.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 25, height_1 * 3));
            //textView_tarif
            TextView textView_tarif = findViewById(R.id.textView_tarif);
            textView_tarif.setY(height_1 * 96);
            textView_tarif.setX(width_1 * 29);
            textView_tarif.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            //textView_yvedomleniy
            TextView textView_yvedomleniy = findViewById(R.id.textView_yvedomleniy);
            textView_yvedomleniy.setY(height_1 * 96);
            textView_yvedomleniy.setX(width_1 * 65);
            textView_yvedomleniy.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
        }
        else {
            View viewmenu = findViewById(R.id.viewmenu);
            viewmenu.setLayoutParams(new LinearLayout.LayoutParams(width, height));
            viewmenu.setY(height_1 * 90);
            //Textview_glavnay
            TextView textView_Glavnay = findViewById(R.id.textView_Glavnay);
            textView_Glavnay.setY(height_1 * 91);
            textView_Glavnay.setX(width_1 * 4);
            textView_Glavnay.setTextColor(Color.rgb(228, 37, 39));
            textView_Glavnay.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 25, height_1 * 3));
            //textView_tarif
            TextView textView_tarif = findViewById(R.id.textView_tarif);
            textView_tarif.setY(height_1 * 91);
            textView_tarif.setX(width_1 * 29);
            textView_tarif.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            //textView_yvedomleniy
            TextView textView_yvedomleniy = findViewById(R.id.textView_yvedomleniy);
            textView_yvedomleniy.setY(height_1 * 91);
            textView_yvedomleniy.setX(width_1 * 65);
            textView_yvedomleniy.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
        }

        //
        Bundle arguments = getIntent().getExtras();
        String Otvet_save = arguments.get("hello").toString();
        String Otvet = Otvet_save;
        //
        int s1 = Otvet.indexOf("|");
        int s2 = Otvet.length();
        String Buf = Otvet.substring(s1 + 1, s2);
        Otvet = Otvet.substring(s1 + 1, s2);
        Buf = Buf.substring(0, Buf.indexOf("|"));
        Фио.setText(Buf);
        //
        s1 = Otvet.indexOf("|");
        s2 = Otvet.length();
        Buf = Otvet.substring(s1 + 1, s2);
        Otvet = Otvet.substring(s1 + 1, s2);
        Buf = Buf.substring(0, Buf.indexOf("|"));
        Balance.setText(Buf + "₽");
        //
        s1 = Otvet.indexOf("|");
        s2 = Otvet.length();
        Buf = Otvet.substring(s1 + 1, s2);
        Otvet = Otvet.substring(s1 + 1, s2);
        Buf = Buf.substring(0, Buf.indexOf("|"));
        Dogovor.setText("№" + Buf);
        int s = 1;
        //Открытие услуг
        String finalOtvet =Otvet;
        Intent intent = new Intent(this, my_tarif.class);
        TextView textView_tarif = findViewById(R.id.textView_tarif);
        textView_tarif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("otvet", Otvet_save);
               startActivity(intent);
            }
        });
        //открытие выбора метода оплаты
        Intent intent_payment_selection = new Intent(this, payment_selection.class);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_payment_selection.putExtra("otvet",Otvet_save);
                startActivity(intent_payment_selection);
            }
        });
    }
}