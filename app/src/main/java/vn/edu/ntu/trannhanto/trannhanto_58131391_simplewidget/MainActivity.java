package vn.edu.ntu.trannhanto.trannhanto_58131391_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNS, edtSTK;
    RadioGroup rdgGT;
    RadioButton rdbNam, rdbNu;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btnXN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNS = findViewById(R.id.edtNS);
        edtSTK = findViewById(R.id.edtSTK);
        rdgGT = findViewById(R.id.rdgGT);
        rdbNam = findViewById(R.id.rdbNam);
        rdbNu = findViewById(R.id.rdbNu);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        btnXN = findViewById(R.id.btnXN);
    }

    private void addEvents()
    {
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienThi();
            }
        });
    }

    private void hienThi()
    {
        String Info = "";
        Info += edtTen.getText();
        Info += "\nNgày sinh: " + edtNS.getText();
        switch (rdgGT.getCheckedRadioButtonId())
        {
            case R.id.rdbNam:
                Info += "\nGiới tính: " + rdbNam.getText();
                break;
            case R.id.rdbNu:
                Info += "\nGiới tính: " + rdbNu.getText();
                break;
        }
        if(cb1.isChecked())
        {
            Info += "\nSở thích: " + cb1.getText();
        }
        if(cb2.isChecked())
        {
            Info += "; " + cb2.getText();
        }
        if(cb3.isChecked())
        {
            Info += "; " + cb3.getText();
        }
        if(cb4.isChecked())
        {
            Info += "; " + cb4.getText();
        }
        if(cb5.isChecked())
        {
            Info += "; " + cb5.getText();
        }
        Info += "; " + edtSTK.getText();
        Toast.makeText(MainActivity.this, Info, Toast.LENGTH_LONG).show();
    }
}
