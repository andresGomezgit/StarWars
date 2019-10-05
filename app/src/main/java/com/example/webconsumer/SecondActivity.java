package com.example.webconsumer;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class SecondActivity extends AppCompatActivity {
    TextView txt1 ;
    TextView txt2 ;
    TextView txt3 ;
    TextView txt4 ;
    TextView txt5 ;
    TextView txt6 ;
    TextView txt7 ;
    TextView txt8 ;
    TextView txt9 ;
    TextView txt10 ;
    TextView txt11 ;
    TextView txt12 ;
    TextView txt13 ;
    TextView txt14 ;
    TextView txt15 ;
    TextView txt16 ;
    Button btn5;
    Button btn6;
    public final String URL_SWAPI = "https://swapi.co/api/";
    public String rr ;
    String nameResponse = "";
    String nameResponse1 = "";
    String nameResponse2 = "";
    String nameResponse3 = "";
    String nameResponse4 = "";
    String nameResponse5 = "";
    String nameResponse6 = "";
    String nameResponse7 = "";
    String nameResponse8 = "";
    String nameResponse9 = "";
    String nameResponse10 = "";
    String nameResponse11= "";
    String nameResponse12 = "";
    String nameResponse13 = "";
    String nameResponse14 = "";
    String nameResponse15 = "";
    String nameName = "";
    String esPersona = "";
    String num = "";
    String esError = "";
   //
    //
    // Intent preguntasI2 = new Intent(this,MainActivity.class);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentacon);
        txt1 = (TextView)findViewById(R.id.textView2);
        txt2 = (TextView)findViewById(R.id.textView3);
        txt3 = (TextView)findViewById(R.id.textView4);
        txt4 = (TextView)findViewById(R.id.textView5);
        txt5 = (TextView)findViewById(R.id.textView6);
        txt6 = (TextView)findViewById(R.id.textView7);
        txt7 = (TextView)findViewById(R.id.textView8);
        txt8 = (TextView)findViewById(R.id.textView9);
        txt9 = (TextView)findViewById(R.id.textView10);
        txt10 = (TextView)findViewById(R.id.textView11);
        txt11 = (TextView)findViewById(R.id.textView12);
        txt12 = (TextView)findViewById(R.id.textView13);
        txt13 = (TextView)findViewById(R.id.textView14);
        txt14 = (TextView)findViewById(R.id.textView15);
        txt15 = (TextView)findViewById(R.id.textView16);
        txt16 = (TextView)findViewById(R.id.textView17);

        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        Intent prev = getIntent();
            if ( (prev.getStringExtra("tam").equals("people"))){
                rr = "people/" + prev.getStringExtra("num") + "/";
                esPersona = "X";

            }else{
                rr = "planets/" + prev.getStringExtra("num") + "/";
                esPersona = "";
            }
            num = prev.getStringExtra("num");

            this.consumir();

        if (esError.equals("X")){
            Intent preguntasI2 = new Intent(this,MainActivity.class);
            startActivity(preguntasI2);
        }


    }

     public void consumir(){
        AsyncTask.execute(new Runnable() {
                 @Override
                 public void run() {

                     try {
                         URL urlService = new URL (URL_SWAPI +  rr );
                         HttpsURLConnection connection =  (HttpsURLConnection) urlService.openConnection();
                         connection.setRequestMethod("GET");
                         InputStream responseBody = connection.getInputStream();

                         if (connection.getResponseCode() == 200) {
                             // Success
                             InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");
                             JsonReader jsonReader = new JsonReader(responseBodyReader);
                             jsonReader.beginObject(); // Start processing the JSON object
                             String key = jsonReader.nextName(); // Fetch the next key
                             String value = jsonReader.nextString();
                             nameResponse = value;
                             nameResponse8 = key;


                             txt1.post(new Runnable() {
                                 @Override
                                 public void run() {
                                    txt1.setText(nameResponse8);
                                 }
                             });
                             txt9.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt9.setText(nameResponse);
                                 }
                             });
                             key = jsonReader.nextName(); // Fetch the next key
                             value = jsonReader.nextString();
                             nameResponse1 = value;
                             nameResponse9 = key;
                             txt2.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt2.setText(nameResponse9);
                                 }
                             });
                             txt10.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt10.setText(nameResponse1);
                                 }
                             });
                             key = jsonReader.nextName(); // Fetch the next key
                             value = jsonReader.nextString();
                             nameResponse2 = value;
                             nameResponse10 = key;
                             txt3.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt3.setText(nameResponse10);
                                 }
                             });
                             txt11.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt11.setText(nameResponse2);
                                 }
                             });
                             key = jsonReader.nextName(); // Fetch the next key
                             value = jsonReader.nextString();
                             nameResponse3 = value;
                             nameResponse11 = key;
                             txt4.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt4.setText(nameResponse11);
                                 }
                             });
                             txt12.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt12.setText(nameResponse3);
                                 }
                             });
                             key = jsonReader.nextName(); // Fetch the next key
                             value = jsonReader.nextString();
                             nameResponse4 = value;
                             nameResponse12 = key;
                             txt5.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt5.setText(nameResponse12);
                                 }
                             });
                             txt13.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt13.setText(nameResponse4);
                                 }
                             });
                             key = jsonReader.nextName(); // Fetch the next key
                             value = jsonReader.nextString();
                             nameResponse5 = value;
                             nameResponse13 = key;
                             txt6.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt6.setText(nameResponse13);
                                 }
                             });
                             txt14.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt14.setText(nameResponse5);
                                 }
                             });
                             key = jsonReader.nextName(); // Fetch the next key
                             value = jsonReader.nextString();
                             nameResponse6 = value;
                             nameResponse14 = key;
                             txt7.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt7.setText(nameResponse14);
                                 }
                             });
                             txt15.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt15.setText(nameResponse6);
                                 }
                             });
                             key = jsonReader.nextName(); // Fetch the next key
                             value = jsonReader.nextString();
                             nameResponse7 = value;
                             nameResponse15 = key;
                             txt8.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt8.setText(nameResponse15);
                                 }
                             });
                             txt15.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     txt16.setText(nameResponse7);
                                 }
                             });
                         } else {
                             // Error handling code goes here

                             //startActivity(preguntasI2);
                             Log.v("ERROR", "ERROR");
                         }

                     } catch (MalformedURLException e) {
                         e.printStackTrace();
                         esError = "X";
                     } catch (IOException e) {
                         e.printStackTrace();
                         esError = "X";
                     }catch (Exception e){
                         e.printStackTrace();
                         esError = "X";
                     }
                 }
             });



         } // end callWebService()

    public void acc(View v){ //ant
        Intent preguntasI = new Intent(this,SecondActivity.class);
        if (esPersona.equals("X")) {
            preguntasI.putExtra("tam", "people");
        }else{
            preguntasI.putExtra("tam", "planets");
        }
        int n = Integer.parseInt(num);
        n --;
        if (n < 1){
            Intent preguntasI2 = new Intent(this,MainActivity.class);
            startActivity(preguntasI2);
        }else {
            String nu = n + "";
            preguntasI.putExtra("num", nu);
            startActivity(preguntasI);
        }

    }
    public void acc2(View v){
        Intent preguntasI = new Intent(this,SecondActivity.class);
        if (esPersona.equals("X")) {
            preguntasI.putExtra("tam", "people");
        }else{
            preguntasI.putExtra("tam", "planets");
        }
        int n = Integer.parseInt(num);
        n++;
        String nu = n + "";

            preguntasI.putExtra("num", nu);
            startActivity(preguntasI);

    }

     }


