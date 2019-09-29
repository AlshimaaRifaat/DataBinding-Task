package com.example.databinding1;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import static com.example.databinding1.BR.user;

public class MyClickHandlers {

    Context context;

    public MyClickHandlers(Context context) {
        this.context = context;
    }

    public void onNameClicked(View view) {
        Toast.makeText(context, "name clicked done", Toast.LENGTH_SHORT).show();
    }
}
