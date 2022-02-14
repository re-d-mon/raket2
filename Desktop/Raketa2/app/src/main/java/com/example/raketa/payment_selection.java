package com.example.raketa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class payment_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_selection);
        Bundle arguments = getIntent().getExtras();
        String OtvetSave = arguments.get("otvet").toString();

        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();  // deprecated
        int height = display.getHeight();  // deprecated

        int width_1 = width / 100;
        int height_1 = height / 100;

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>Оплата</font>"));

        //отрисовка ОПЛАТА
        TextView textView_Pay = findViewById(R.id.textView_Pay);
        textView_Pay.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 90, height_1 * 20));
        textView_Pay.setX(width_1*5);
        textView_Pay.setY(height_1 * 2);
        //отрисовка выберите способ оплаты
        TextView textView_Pay_2 = findViewById(R.id.textView_Pay_2);
        textView_Pay_2.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 90, height_1 * 4));
        textView_Pay_2.setX(width_1*5);
        textView_Pay_2.setY(textView_Pay.getLayoutParams().height +height_1*4);
        //image_pay
        ImageView image_pay = findViewById(R.id.imagePay);
        image_pay.setLayoutParams(new LinearLayout.LayoutParams(width_1*90,height_1*30));
        image_pay.setY(height_1*31);
        image_pay.setX(width_1*5);
        //отрисовка меню
        if (height>1700) {
            //вью-меню

            View viewmenu_2 = findViewById(R.id.viewmenu_tarif);
            viewmenu_2.setLayoutParams(new LinearLayout.LayoutParams(width, height));
            viewmenu_2.setY(height_1 * 87);
            //Textview_glavnay
            TextView textView_Glavnay = findViewById(R.id.textView_Glavnay);
            textView_Glavnay.setY(height_1 * 89);
            textView_Glavnay.setX(width_1 * 4);
            textView_Glavnay.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 25, height_1 * 3));
            textView_Glavnay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    go_home();
                }
            });
            //textView_tarif
            TextView textView_tarif_menu = findViewById(R.id.textView_tarif);
            textView_tarif_menu.setY(height_1 * 89);
            textView_tarif_menu.setX(width_1 * 29);
            textView_tarif_menu.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            //textView_yvedomleniy
            TextView textView_yvedomleniy = findViewById(R.id.textView_yvedomleniy);
            textView_yvedomleniy.setY(height_1 * 89);
            textView_yvedomleniy.setX(width_1 * 65);
            textView_yvedomleniy.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            // отрисока оплаты картой
            View Pay_card = findViewById(R.id.Pay_cards);
            Pay_card.setLayoutParams(new LinearLayout.LayoutParams(width_1*90,height_1*7));
            Pay_card.setX(width_1*5);
            Pay_card.setY(height_1*69);
            //отрисовка оплаты специальной картой
            View Pay_cards_spefical = findViewById(R.id.Pay_cards_spefical);
            Pay_cards_spefical.setLayoutParams(new LinearLayout.LayoutParams(width_1*90,height_1*7));
            Pay_cards_spefical.setX(width_1*5);
            Pay_cards_spefical.setY(height_1*78);
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
            textView_Glavnay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    go_home();
                }
            });
            //textView_tarif
            TextView textView_tarif_menu = findViewById(R.id.textView_tarif);
            textView_tarif_menu.setY(height_1 * 84);
            textView_tarif_menu.setX(width_1 * 29);
            textView_tarif_menu.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            //textView_yvedomleniy
            TextView textView_yvedomleniy = findViewById(R.id.textView_yvedomleniy);
            textView_yvedomleniy.setY(height_1 * 84);
            textView_yvedomleniy.setX(width_1 * 65);
            textView_yvedomleniy.setLayoutParams(new LinearLayout.LayoutParams(width_1 * 33, height_1 * 3));
            // отрисока оплаты картой
            View Pay_card = findViewById(R.id.Pay_cards);
            Pay_card.setLayoutParams(new LinearLayout.LayoutParams(width_1*90,height_1*7));
            Pay_card.setX(width_1*5);
            Pay_card.setY(height_1*64);
            //отрисовка оплаты специальной картой
            View Pay_cards_spefical = findViewById(R.id.Pay_cards_spefical);
            Pay_cards_spefical.setLayoutParams(new LinearLayout.LayoutParams(width_1*90,height_1*7));
            Pay_cards_spefical.setX(width_1*5);
            Pay_cards_spefical.setY(height_1*74);
        }

    }
    //переход на главную по кнопке
    public  void go_home()
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