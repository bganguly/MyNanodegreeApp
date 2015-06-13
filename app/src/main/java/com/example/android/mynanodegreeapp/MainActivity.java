package com.example.android.mynanodegreeapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.Menu;


public class MainActivity extends ActionBarActivity {

    private static Toast mToast;
    private static int mShortToast = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * This method is called when the buttons are clicked.
     */
    public void showMessage(View view) {
        Button button = (Button) view;
        showToastMessage("This button will launch my " + button.getText() + " app!");
    }

    /**
     * This method displays a toast message with the given string.
     */
    private void showToastMessage(String msgText) {
        hideExistingToastMessage(mToast);
        Context context = getApplicationContext();
        mToast = Toast.makeText(context, msgText, mShortToast);
        mToast.setGravity(Gravity.BOTTOM,0,0);
        mToast.show();
    }

    /**
     * This method erases the currently visible toast message.
     * This is useful when we need to erase the currently showing toast message
     * if the user has pressed two or more buttons in quick succession.
     */
    private void hideExistingToastMessage(Toast toast) {
        if (toast != null) {
            toast.cancel();
        }
    }
}
