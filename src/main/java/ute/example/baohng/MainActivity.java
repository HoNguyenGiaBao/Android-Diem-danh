package ute.example.baohng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public EditText name, age, email, phone, svClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        name = (EditText) findViewById(R.id.editTextName);
        age = (EditText) findViewById(R.id.editTextAge);
        email = (EditText) findViewById(R.id.editTextEmail);
        phone = (EditText) findViewById(R.id.editTextPhone);
        svClass = (EditText) findViewById(R.id.editTextClass);

        String nameA = name.getText().toString().trim();
        String ageA = age.getText().toString().trim();
        String emailA = email.getText().toString().trim();
        String phoneA = phone.getText().toString().trim();
        String svClassA = svClass.getText().toString().trim();

        SinhVien sv = new SinhVien(nameA, ageA, emailA, phoneA, svClassA);

        List<SinhVien> bundleSV = new ArrayList<SinhVien>();
        bundleSV.add(new SinhVien());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Bundle bundle1 = new Bundle();
                Bundle bundle2 = new Bundle();
                Bundle bundle3 = new Bundle();
                Bundle bundle4 = new Bundle();

                bundle.putString("name",sv.getName());
                bundle1.putString("age",sv.getAge());
                bundle2.putString("email",sv.getEmail());
                bundle3.putString("phone",sv.getPhone());
                bundle4.putString("class",sv.getSvClass());
                Intent intent = new Intent(MainActivity.this, Page2.class);
                intent.putExtras(bundle);
                intent.putExtras(bundle1);
                intent.putExtras(bundle2);
                intent.putExtras(bundle3);
                intent.putExtras(bundle4);
                startActivity(intent);
            }
        });
    }
}