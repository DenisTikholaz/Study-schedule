package com.example.addschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Thursday extends AppCompatActivity {

    private EditText editTextText1110, editTextText1111, editTextText1112, editTextText1113, editTextText1114, editTextText1115, editTextText1116, editTextText1117;
    private EditText editTime110, editTime111, editTime112, editTime113, editTime114, editTime115, editTime116, editTime117, editTime118, editTime119, editTime120, editTime121, editTime122, editTime123, editTime124;
    private SharedPreferences pref;
    private final String save_key = "save_key";
    private Button button46, button47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);

        button46 = findViewById(R.id.button46);
        button47 = findViewById(R.id.button47);
        init();

        EditText[] editTimeArray = {editTime110, editTime111, editTime112, editTime113, editTime114, editTime115, editTime116, editTime117, editTime118, editTime119, editTime120, editTime121, editTime122, editTime123, editTime124};
        for (final EditText editTime : editTimeArray) {
            editTime.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }

                @Override
                public void afterTextChanged(Editable s) {
                    String input = s.toString();
                    if (!input.isEmpty()) {
                        try {
                            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                            sdf.setLenient(false);
                            Date date = sdf.parse(input);

                            Calendar cal = Calendar.getInstance();
                            cal.setTime(date);
                            int hour = cal.get(Calendar.HOUR_OF_DAY);
                            int minute = cal.get(Calendar.MINUTE);
                            if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
                                editTime.setError("Некоректний час");
                            }
                        } catch (ParseException e) {
                            editTime.setError("Некоректний формат часу (HH:mm)");
                        }
                    }
                }
            });
        }

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSave();
            }
        });

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickGet();
            }
        });
    }

    public void onClickSave() {
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("key_text1110", editTextText1110.getText().toString());
        edit.putString("key_text1111", editTextText1111.getText().toString());
        edit.putString("key_text1112", editTextText1112.getText().toString());
        edit.putString("key_text1113", editTextText1113.getText().toString());
        edit.putString("key_text1114", editTextText1114.getText().toString());
        edit.putString("key_text1115", editTextText1115.getText().toString());
        edit.putString("key_text1116", editTextText1116.getText().toString());
        edit.putString("key_text1117", editTextText1117.getText().toString());

        edit.putString("key_time110", editTime110.getText().toString());
        edit.putString("key_time111", editTime111.getText().toString());
        edit.putString("key_time112", editTime112.getText().toString());
        edit.putString("key_time113", editTime113.getText().toString());
        edit.putString("key_time114", editTime114.getText().toString());
        edit.putString("key_time115", editTime115.getText().toString());
        edit.putString("key_time116", editTime116.getText().toString());
        edit.putString("key_time117", editTime117.getText().toString());
        edit.putString("key_time118", editTime118.getText().toString());
        edit.putString("key_time119", editTime119.getText().toString());
        edit.putString("key_time120", editTime120.getText().toString());
        edit.putString("key_time121", editTime121.getText().toString());
        edit.putString("key_time122", editTime122.getText().toString());
        edit.putString("key_time123", editTime123.getText().toString());
        edit.putString("key_time124", editTime124.getText().toString());

        edit.apply();
    }

    public void onClickGet() {
        editTextText1110.setText(pref.getString("key_text1110", ""));
        editTextText1111.setText(pref.getString("key_text1111", ""));
        editTextText1112.setText(pref.getString("key_text1112", ""));
        editTextText1113.setText(pref.getString("key_text1113", ""));
        editTextText1114.setText(pref.getString("key_text1114", ""));
        editTextText1115.setText(pref.getString("key_text1115", ""));
        editTextText1116.setText(pref.getString("key_text1116", ""));
        editTextText1117.setText(pref.getString("key_text1117", ""));

        editTime110.setText(pref.getString("key_time110", ""));
        editTime111.setText(pref.getString("key_time111", ""));
        editTime112.setText(pref.getString("key_time112", ""));
        editTime113.setText(pref.getString("key_time113", ""));
        editTime114.setText(pref.getString("key_time114", ""));
        editTime115.setText(pref.getString("key_time115", ""));
        editTime116.setText(pref.getString("key_time116", ""));
        editTime117.setText(pref.getString("key_time117", ""));
        editTime118.setText(pref.getString("key_time118", ""));
        editTime119.setText(pref.getString("key_time119", ""));
        editTime120.setText(pref.getString("key_time120", ""));
        editTime121.setText(pref.getString("key_time121", ""));
        editTime122.setText(pref.getString("key_time122", ""));
        editTime123.setText(pref.getString("key_time123", ""));
        editTime124.setText(pref.getString("key_time124", ""));

    }

    private void init() {
        pref = getSharedPreferences("Test", MODE_PRIVATE);
        editTextText1110 = findViewById(R.id.editTextText1110);
        editTextText1111 = findViewById(R.id.editTextText1111);
        editTextText1112 = findViewById(R.id.editTextText1112);
        editTextText1113 = findViewById(R.id.editTextText1113);
        editTextText1114 = findViewById(R.id.editTextText1114);
        editTextText1115 = findViewById(R.id.editTextText1115);
        editTextText1116 = findViewById(R.id.editTextText1116);
        editTextText1117 = findViewById(R.id.editTextText1117);

        editTime110 = findViewById(R.id.editTime110);
        editTime111 = findViewById(R.id.editTime111);
        editTime112 = findViewById(R.id.editTime112);
        editTime113 = findViewById(R.id.editTime113);
        editTime114 = findViewById(R.id.editTime114);
        editTime115 = findViewById(R.id.editTime115);
        editTime116 = findViewById(R.id.editTime116);
        editTime117 = findViewById(R.id.editTime117);
        editTime118 = findViewById(R.id.editTime118);
        editTime119 = findViewById(R.id.editTime119);
        editTime120 = findViewById(R.id.editTime120);
        editTime121 = findViewById(R.id.editTime121);
        editTime122 = findViewById(R.id.editTime122);
        editTime123 = findViewById(R.id.editTime123);
        editTime124 = findViewById(R.id.editTime124);

        editTextText1110.setText(pref.getString("key_text1110", ""));
        editTextText1111.setText(pref.getString("key_text1111", ""));
        editTextText1112.setText(pref.getString("key_text1112", ""));
        editTextText1113.setText(pref.getString("key_text1113", ""));
        editTextText1114.setText(pref.getString("key_text1114", ""));
        editTextText1115.setText(pref.getString("key_text1115", ""));
        editTextText1116.setText(pref.getString("key_text1116", ""));
        editTextText1117.setText(pref.getString("key_text1117", ""));

        editTime110.setText(pref.getString("key_time110", ""));
        editTime111.setText(pref.getString("key_time111", ""));
        editTime112.setText(pref.getString("key_time112", ""));
        editTime113.setText(pref.getString("key_time113", ""));
        editTime114.setText(pref.getString("key_time114", ""));
        editTime115.setText(pref.getString("key_time115", ""));
        editTime116.setText(pref.getString("key_time116", ""));
        editTime117.setText(pref.getString("key_time117", ""));
        editTime118.setText(pref.getString("key_time118", ""));
        editTime119.setText(pref.getString("key_time119", ""));
        editTime120.setText(pref.getString("key_time120", ""));
        editTime121.setText(pref.getString("key_time121", ""));
        editTime122.setText(pref.getString("key_time122", ""));
        editTime123.setText(pref.getString("key_time123", ""));
        editTime124.setText(pref.getString("key_time124", ""));
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void showConfirmationDialog(final View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Ви точно цього хочете?")
                .setPositiveButton("Так", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        clearData(v);
                    }
                })
                .setNegativeButton("Ні", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void clearData (View v) {
        SharedPreferences pref = getSharedPreferences("Test", MODE_PRIVATE);
        SharedPreferences.Editor edit = pref.edit();
        String[] textKeys = {
                "key_text1110", "key_text1112", "key_text1113",
                "key_text1111", "key_text1114", "key_text1115",
                "key_text1116", "key_text1117"
        };

        for (String key : textKeys) {
            edit.remove(key);
        }

        boolean success = edit.commit();
        if (success) {
            editTextText1110.setText("");
            editTextText1111.setText("");
            editTextText1112.setText("");
            editTextText1113.setText("");
            editTextText1114.setText("");
            editTextText1115.setText("");
            editTextText1116.setText("");
            editTextText1117.setText("");
        }
    }


}
