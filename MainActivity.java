package com.example.emicalculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends Activity {
    EditText e1,e2,e3,e4;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.result);
    }
    public void onClick(View v) {
        String a,b,c;
        a=e1.getText().toString();
        b=e2.getText().toString();
        c=e3.getText().toString();
        int n1,n2,n3,si,i,in,am;
        n1=Integer.parseInt(a);
        n2=Integer.parseInt(b);
        n3=Integer.parseInt(c);
        am=n1;
        for(i=0;i<n3;i++)
        {
            in=(am*n2)/100;
            am=am+in;
        }
        e4.setText("Total Interest = " +am);
    }
}