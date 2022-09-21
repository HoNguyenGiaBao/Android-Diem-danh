package ute.example.baohng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    public TextView name, age, email, phone, svClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        name = (TextView) findViewById(R.id.textView3);
        age = (TextView) findViewById(R.id.textView4);
        email = (TextView) findViewById(R.id.textView5);
        phone = (TextView) findViewById(R.id.textView6);
        svClass = (TextView) findViewById(R.id.textView7);

        Bundle bundle = getIntent().getExtras();
        Bundle bundle1 = getIntent().getExtras();
        Bundle bundle2 = getIntent().getExtras();
        Bundle bundle3 = getIntent().getExtras();
        Bundle bundle4 = getIntent().getExtras();

        name.setText(bundle.getString("name"));
        age.setText(bundle1.getString("age"));
        email.setText(bundle2.getString("email"));
        phone.setText(bundle3.getString("phone"));
        svClass.setText(bundle4.getString("class"));

    }
}