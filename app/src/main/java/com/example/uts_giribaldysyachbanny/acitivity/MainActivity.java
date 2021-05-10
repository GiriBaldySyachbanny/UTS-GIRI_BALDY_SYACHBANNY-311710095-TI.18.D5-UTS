package com.example.uts_giribaldysyachbanny.acitivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.uts_giribaldysyachbanny.R;
import com.example.uts_giribaldysyachbanny.fragment.About;
import com.example.uts_giribaldysyachbanny.fragment.Contact;
import com.example.uts_giribaldysyachbanny.fragment.Home;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnHome, btnAbout, btnContact, btnExit;

    public Button button2;
    public TextView TV;
    Home fragmentHome;
    About fragmentAbout;
    Contact fragmentContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = findViewById(R.id.btn_home);
        btnAbout = findViewById(R.id.btn_about);
        btnContact = findViewById(R.id.btn_contact);
        btnExit = findViewById(R.id.btn_exit);
        button2 = (Button) findViewById(R.id.button1);
        TV = (TextView) findViewById(R.id.Text1);

        btnHome.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnContact.setOnClickListener(this);
        btnExit.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    void menuHome() {
        fragmentHome = new Home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHome);
        ft.commit();
    }

    void menuAbout() {
        fragmentAbout = new About();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentAbout);
        ft.commit();
    }

    void menuContact() {
        fragmentContact = new Contact();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentContact);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        int startSelection, andSelection;
        if (v == btnHome) {
            menuHome();
        }
        if (v == btnAbout) {
            menuAbout();
        }
        if (v == btnContact) {
            menuContact();
        }
        if (v == btnExit) {
            menuExit();
        }
        if (v == button2) {
            startSelection = TV.getSelectionStart();
            andSelection = TV.getSelectionEnd();
            String url = "https://instagram.com/jokowi";
            Intent web = new Intent(Intent.ACTION_VIEW);
            web.setData(Uri.parse(url));
            startActivity(web);
        }
    }
}

