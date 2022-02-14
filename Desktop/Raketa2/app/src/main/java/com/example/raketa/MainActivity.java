package com.example.raketa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;

import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowId;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.security.auth.login.LoginException;

public class MainActivity<MyActivity> extends AppCompatActivity {
    String d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Отрисовка
        TextView arg = findViewById(R.id.arg);

        arg.setText(Html.fromHtml("<font color='#7B7D80'>Нажимая кнопку ”Поехали!”, Вы принимаете  условия </font>" + "<font color='#E42527'>пользовательского соглашения  и политики конфиденциальности.</font>"));

        ImageView logo = findViewById(R.id.Logo);
        logo.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.white));

        ImageView Logo = findViewById(R.id.Logo);
        Button authorization = findViewById(R.id.authorization);
        View view2 = findViewById(R.id.view);
        TextView Login_TextView = findViewById(R.id.Login);
        TextView Password_TextView = findViewById(R.id.Password);
        TextView editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName2.requestFocus();

        TextView textView3 = findViewById(R.id.textView3);
        Login_TextView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String sss = String.valueOf(Login_TextView.getText());
                int View_Y = (int) view2.getY();
                int logo_Y = (int) logo.getY();
                int Login_TextView_Y = (int) Login_TextView.getY();
                int Password_TextView_Y = (int) Password_TextView.getY();
                int textView3_Y = (int) textView3.getY();
                int authorization_Y = (int) authorization.getY();
                if (b == true) {
                    logo.setY(logo_Y - 350);
                    view2.setY(View_Y - 350);
                    Login_TextView.setY(Login_TextView_Y - 350);
                    Password_TextView.setY(Password_TextView_Y - 350);
                    textView3.setY(textView3_Y - 350);
                    authorization.setY(authorization_Y - 350);
                    if (sss.equals("Номер договора")) {
                        Login_TextView.setText("");
                    }
                } else {
                    logo.setY(logo_Y + 350);
                    view2.setY(View_Y + 350);
                    Login_TextView.setY(Login_TextView_Y + 350);
                    Password_TextView.setY(Password_TextView_Y + 350);
                    textView3.setY(textView3_Y + 350);
                    authorization.setY(authorization_Y + 350);
                    if (sss.equals("")) {
                        Login_TextView.setText("Номер договора");
                    }
                }
            }
        });

        Password_TextView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Password_TextView.hasFocus();
                String sss = String.valueOf(Password_TextView.getText());
                int View_Y = (int) view2.getY();
                int logo_Y = (int) logo.getY();
                int Login_TextView_Y = (int) Login_TextView.getY();
                int Password_TextView_Y = (int) Password_TextView.getY();
                int textView3_Y = (int) textView3.getY();
                int authorization_Y = (int) authorization.getY();
                if (b == true) {
                    logo.setY(logo_Y - 350);
                    logo_Y = (int) logo.getY();
                    view2.setY(View_Y - 350);
                    Login_TextView.setY(Login_TextView_Y - 350);
                    Password_TextView.setY(Password_TextView_Y - 350);
                    textView3.setY(textView3_Y - 350);
                    authorization.setY(authorization_Y - 350);

                    if (sss.equals("Пароль")) {
                        Password_TextView.setText("");
                    }
                } else {
                    logo.setY(logo_Y + 350);
                    logo_Y = (int) logo.getY();
                    view2.setY(View_Y + 350);
                    Login_TextView.setY(Login_TextView_Y + 350);
                    Password_TextView.setY(Password_TextView_Y + 350);
                    textView3.setY(textView3_Y + 350);
                    authorization.setY(authorization_Y + 350);

                    if (sss.equals("")) {
                        Password_TextView.setText("Пароль");
                    }
                }
            }
        });

        Intent intent = new Intent(this, Home.class);
        authorization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextTextPersonName2.setAlpha(Float.parseFloat("0"));
                //Считывания логин/пароль для авторизации
                editTextTextPersonName2.requestFocus();
                String Login = String.valueOf(Login_TextView.getText());
                String Password = String.valueOf(Password_TextView.getText());
                //инициализация соединения
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {


                        try {
                            Socket socket = new Socket("5.167.20.226", 24565);
                            InputStream is = socket.getInputStream();
                            //передача логин/пароль
                            DataOutputStream serverOutput = new DataOutputStream(socket.getOutputStream());
                            serverOutput.writeBytes("0"+Login + "|" + Password);
                            BufferedReader br = new BufferedReader(new InputStreamReader(is));
                            String receivedData = br.readLine();
                            String f = receivedData;

                            if (f.equals("false")) {
                                TextView editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
                                editTextTextPersonName2.setAlpha(Float.parseFloat("255"));
                            } else {
                                // действия, совершаемые после нажатия на кнопку
                                // Создаем объект Intent для вызова новой Activity

                                intent.putExtra("hello", f);
                                // Получаем текстовое поле в текущей Activity
                                // Получае текст данного текстового поля

                                // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
                                // второй параметр - значение этого объекта

                                // запуск activity
                                startActivity(intent);
                            }

                            System.out.println("Received Data: " + receivedData);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();

            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //replaces the default 'Back' button action
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            TextView editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
            editTextTextPersonName2.requestFocus();
        }

        return true;
    }

}
