package vp.com.farmatodo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget
        .TextView;

import vp.com.farmatodo.R;

public class Mathactivity extends AppCompatActivity {
    public TextView pant;
    public double operan1, operan2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        pant = (TextView) findViewById(R.id.txt_oper);
    }

    public void bt1(View v) {
        String cap = pant.getText().toString();
        cap = cap + "1";
        pant.setText(cap);
    }

    public void bt2(View v) {
        String cap = pant.getText().toString();
        cap = cap + "2";
        pant.setText(cap);

    }

    public void bt3(View v) {
        String cap = pant.getText().toString();
        cap = cap + "3";
        pant.setText(cap);

    }

    public void bt4(View v) {
        String cap = pant.getText().toString();
        cap = cap + "4";
        pant.setText(cap);

    }

    public void bt5(View v) {
        String cap = pant.getText().toString();
        cap = cap + "5";
        pant.setText(cap);

    }

    public void bt6(View v) {
        String cap = pant.getText().toString();
        cap = cap + "6";
        pant.setText(cap);

    }

    public void bt7(View v) {
        String cap = pant.getText().toString();
        cap = cap + "7";
        pant.setText(cap);

    }

    public void bt8(View v) {
        String cap = pant.getText().toString();
        cap = cap + "8";
        pant.setText(cap);
    }

    public void bt9(View v) {
        String cap = pant.getText().toString();
        cap = cap + "9";
        pant.setText(cap);
    }

    public void bt0(View v) {
        String cap = pant.getText().toString();
        cap = cap + "0";
        pant.setText(cap);

    }

    public void btpunt(View v) {
        String cap = pant.getText().toString();
        cap = cap + ".";
        pant.setText(cap);
    }

    public void btpar(View v) {
        String cap = pant.getText().toString();
        cap = cap + "(";
        pant.setText(cap);
    }

    public void btpar2(View v) {
        String cap = pant.getText().toString();
        cap = cap + ")";
        pant.setText(cap);
    }

    public void suma(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 1;
    }

    public void resta(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 2;
    }

    public void multiplicacion(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 3;
    }

    public void division(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 4;
    }


    public void igual(View v) {
        try {
            String aux2 = pant.getText().toString();
            operan2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {
        }
        pant.setText("");

        if (ope == 1) {
            res = operan1 + operan2;

        } else if (ope == 2) {
            res = operan1 - operan2;

        } else if (ope == 3) {
            res = operan1 * operan2;

        } else if (ope == 4) {
            if (operan2 == 0) {
                pant.setText("Numero no se puede dividir para 0");
            } else {
                res = operan1 / operan2;
            }

        }
        pant.setText("" + res);
        operan1 = res;

        int fragment=0;
        switch (metodo((int) res)) {


            case 0:
                starfragment(0);
                break;

            case 3:
                starfragment(1);
                break;

            case 5:
                starfragment(2);
                break;

            case 7:
                starfragment(3);
                break;
            case 11:
                starfragment(4);
                break;
            case 13:
                starfragment(5);
                break;

            default:
                starfragment(6);
        }
    }

   private void starfragment(Integer fragment){
       startActivity(new Intent(getApplication(), MainActivity.class).putExtra("tipofragment", fragment));
   }

    public void borrar(View v) {
        if (!pant.getText().toString().equals("")) {
            pant.setText(pant.getText().subSequence(0, pant.getText().length() - 1) + "");
        }
    }


    public static int metodo(Integer res) {

        return res;
    }






}

