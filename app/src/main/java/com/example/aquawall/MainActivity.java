package com.example.aquawall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextPH,editTextDo,editTextTp,editTextTn,editTextFc,editTextAs,editTextPb,editTextHg,editTextd,editTextLindane;
    Button buttonNext,buttonFinish;
    EditText result;
    int g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Calculation cal=new Calculation();
        result=findViewById(R.id.Result);
        editTextPH=findViewById(R.id.editTextPH);
        editTextDo=findViewById(R.id.editTextDo);
        editTextTp=findViewById(R.id.editTextTp);
        editTextTn=findViewById(R.id.editTextTn);
        editTextFc=findViewById(R.id.editTextFc);
        editTextAs=findViewById(R.id.editTextAs);
        editTextPb=findViewById(R.id.editTextPb);
        editTextHg=findViewById(R.id.editTextHg);
        editTextd=findViewById(R.id.editTextD);
        editTextLindane=findViewById(R.id.editTextLindane);
        buttonNext=findViewById(R.id.buttonNext);
        buttonFinish=findViewById(R.id.buttonFinish);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(editTextPH.getText()!=null){
                    String s= editTextPH.getText().toString();
                    if( !s.equals("")  ){
                        cal.PhCalculation(Float.parseFloat(s));}
                }


                if(editTextDo.getText()!=null){
                    String s= editTextDo.getText().toString();

                    if( !s.equals("")  ){
                    cal.DoCalculation(Float.parseFloat(s)); }

                }
                if(editTextTp.getText()!=null){
                    String s= editTextTp.getText().toString();
                    if( !s.equals("")  ){
                    cal.TPcalculation(Float.parseFloat(s));}
                }
                if(editTextTn.getText()!=null){
                    String s= editTextTn.getText().toString();
                    if( !s.equals("")  ){
                    cal.TNcalculation(Float.parseFloat(s));}
                }  if(editTextFc.getText()!=null){
                    String s= editTextFc.getText().toString();
                    if( !s.equals("")  ){
                    cal.FCcalculation(Float.parseFloat(s));}
                }  if(editTextAs.getText()!=null){
                    String s= editTextAs.getText().toString();
                    if( !s.equals("")  ){
                    cal.AScalculation(Float.parseFloat(s));}
                }
                if(editTextPb.getText()!=null){
                    String s= editTextPb.getText().toString();
                    if( !s.equals("")  ){
                    cal.PBcalculation(Float.parseFloat(s));}
                }  if(editTextHg.getText()!=null){
                    String s= editTextHg.getText().toString();
                    if( !s.equals("")  ){
                    cal.HGcalculation(Float.parseFloat(s));}
                }
                if(editTextd.getText()!=null){
                    String s= editTextd.getText().toString();
                    if( !s.equals("")  ){
                    cal.Dcalculation(Float.parseFloat(s));}
                }
                editTextd.setText(null);
                editTextHg.setText(null);
                editTextAs.setText(null);
                editTextTp.setText(null);
                editTextDo.setText(null);
                editTextFc.setText(null);
                editTextLindane.setText(null);
                editTextPb.setText(null);
                editTextPH.setText(null);
                editTextTn.setText(null);





            }

        });
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result1=cal.waterQualityIndex();
                String res=Float.toString(result1);
                result.setText(res);


        }
        });
    }
}
