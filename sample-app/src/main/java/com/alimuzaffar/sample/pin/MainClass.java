package com.alimuzaffar.sample.pin;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

/**
 * Created by manoj.jain on 09/11/17.
 */

public class MainClass extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final MyPinEntryEditText txtPinEntry = (MyPinEntryEditText) findViewById(R.id.txt_pin_entry);
//
//
//        txtPinEntry.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s,
//                                          int start,
//                                          int count,
//                                          int after) {}
//
//            @Override
//            public void onTextChanged(CharSequence s,
//                                      int start,
//                                      int before,
//                                      int count) {}
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (s.toString().equals("1234")) {
//                    Toast.makeText(MainClass.this,
//                            "Success", Toast.LENGTH_SHORT).show();
//                } else if (s.length() == "1234".length()) {
//                    Toast.makeText(MainClass.this,
//                            "Incorrect", Toast.LENGTH_SHORT).show();
//                    txtPinEntry.setText(null);
//                }
//            }
//        });



        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }


}
