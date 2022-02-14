package com.example.raketa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
        TextView Dogovor = findViewById(R.id.textView_dogovor);
        TextView Tarif_and_uslugi = findViewById(R.id.Tarif_and_uslugi);
        Tarif_and_uslugi.setLayoutParams(new LinearLayout.LayoutParams(width/100*70,height/100*4));
        TextView textView_balance = findViewById(R.id.textView_balance);
        textView_balance.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 70, height / 100 * 15));

        View view20 = findViewById(R.id.view20);
        view20.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 5));

        View view17 = findViewById(R.id.view17);
        view17.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 5));

        View view23 = findViewById(R.id.view23);
        view23.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 5));


        View view24 = findViewById(R.id.view24);
        view24.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 5));

        View view25 = findViewById(R.id.view25);
        view25.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 5));

        View view26 = findViewById(R.id.view26);
        view26.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 5));

        TextView Tarif_and_uslug = findViewById(R.id.Tarif_and_uslug);
        Tarif_and_uslug.setLayoutParams(new LinearLayout.LayoutParams(width/100*70,height/100*4));

        View view27 = findViewById(R.id.view27);
        view27.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 2));

        View view28 = findViewById(R.id.view28);
        view28.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 3));

        View view29 = findViewById(R.id.view29);
        view29.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 5, height / 100 * 2));

        TextView Tarif_name = findViewById(R.id.tarif_name);
        Tarif_name.setLayoutParams(new LinearLayout.LayoutParams(width/100*70,height/100*3));

        TextView Tarif_speed = findViewById(R.id.tarif_speed);
        Tarif_speed.setLayoutParams(new LinearLayout.LayoutParams(width/100*70,(int) (height/100*2.3)));

        TextView tarif_sum = findViewById(R.id.tarif_sum);
        tarif_sum.setLayoutParams(new LinearLayout.LayoutParams(width,height/100*5));

        View view30 = findViewById(R.id.view30);
        view30.setLayoutParams(new LinearLayout.LayoutParams(width , (int) (height / 100 * 0.2)));

        TextView rub = findViewById(R.id.rub);
        rub.setLayoutParams(new LinearLayout.LayoutParams(width/100*90,(int)(height/100*2.5)));

        TextView mes = findViewById(R.id.mes);
        mes.setLayoutParams(new LinearLayout.LayoutParams(width,(int)(height/100*2.5)));




        TextView Balance = findViewById(R.id.textView_balance);

        TextView textView4 = findViewById(R.id.textView4);
        textView4.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 85, height / 100 * 3));
        TextView textView = findViewById(R.id.textView_Glavnay);
        TextView textView2 = findViewById(R.id.textView_yvedomleniy);
        ImageView imageButton = findViewById(R.id.imageButton);
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 20, height / 100 * 15));
        imageButton.setY(textView4.getLayoutParams().height);

        View view13 = findViewById(R.id.view13);
        view13.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 90, height / 100 * 3));

        View view14 = findViewById(R.id.view14);
        view14.setLayoutParams(new LinearLayout.LayoutParams(width / 100 * 90, height / 100 * 3));
      /* // textView.setY(height - (int) (d * 1.7));
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

            RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            params2.addRule(RelativeLayout.CENTER_HORIZONTAL);
            params2.addRule(RelativeLayout.ALIGN_BOTTOM);
            params2.height=height_1 * 6;


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
        }*/

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
        //
        s1 = Otvet.indexOf("|");
        s2 = Otvet.length();
        Buf = Otvet.substring(s1 + 1, s2);
        Otvet = Otvet.substring(s1 + 1, s2);
        Buf = Buf.substring(0, Buf.indexOf("|"));
        Tarif_name.setText(Buf);
        //
        s1 = Otvet.indexOf("|");
        s2 = Otvet.length();
        Buf = Otvet.substring(s1 + 1, s2);
        Otvet = Otvet.substring(s1 + 1, s2);
        Buf = Buf.substring(0, Buf.indexOf(" "));
        tarif_sum.setText(Buf);
        //
        s1 = Otvet.indexOf("|");
        s2 = Otvet.length();
        Buf = Otvet.substring(s1 + 1, s2);
        Otvet = Otvet.substring(s1 + 1, s2);
        Buf = Buf.substring(0, Buf.indexOf("|"));
        Tarif_speed.setText("Скорость "+Buf + " Мбит/с");
        int s = 1;
        //Открытие услуг
        String finalOtvet = Otvet;
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
                intent_payment_selection.putExtra("otvet", Otvet_save);
                startActivity(intent_payment_selection);
            }
        });
    }
}