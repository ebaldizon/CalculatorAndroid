package ebaldizon.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtvwOperations;
    Button btnDelete, btnAC, btnPercentage, btnDivision, btnMultiplication, btnSubtraction, btnAddition, btnPoint, btnRepeat, btnEquals,
    btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0;
    int result;
    String numbers1 = "", numbers2 = "", operator = "";
    boolean estate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnNum0 = (Button) findViewById(R.id.btnNum0);
        this.btnNum1 = (Button) findViewById(R.id.btnNum1);
        this.btnNum2 = (Button) findViewById(R.id.btnNum2);
        this.btnNum3 = (Button) findViewById(R.id.btnNum3);
        this.btnNum4 = (Button) findViewById(R.id.btnNum4);
        this.btnNum5 = (Button) findViewById(R.id.btnNum5);
        this.btnNum6 = (Button) findViewById(R.id.btnNum6);
        this.btnNum7 = (Button) findViewById(R.id.btnNum7);
        this.btnNum8 = (Button) findViewById(R.id.btnNum8);
        this.btnNum9 = (Button) findViewById(R.id.btnNum9);
        this.btnDelete = (Button) findViewById(R.id.btnDelete);
        this.btnAC = (Button) findViewById(R.id.btnAC);
        this.btnPercentage = (Button) findViewById(R.id.btnPercentage);
        this.btnDivision = (Button) findViewById(R.id.btnDivision);
        this.btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        this.btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        this.btnAddition = (Button) findViewById(R.id.btnAddition);
        this.btnPoint = (Button) findViewById(R.id.btnPoint);
        this.btnRepeat = (Button) findViewById(R.id.btnRepeat);
        this.btnEquals = (Button) findViewById(R.id.btnEquals);
        this.txtvwOperations = (TextView) findViewById(R.id.txtvwOperations);
        listeners();
     }

    public void listeners()
    {
        this.btnAddition.setOnClickListener(this);
        this.btnSubtraction.setOnClickListener(this);
        this.btnMultiplication.setOnClickListener(this);
        this.btnDivision.setOnClickListener(this);
        this.btnEquals.setOnClickListener(this);

        this.btnNum0.setOnClickListener(this);
        this.btnNum1.setOnClickListener(this);
        this.btnNum2.setOnClickListener(this);
        this.btnNum3.setOnClickListener(this);
        this.btnNum4.setOnClickListener(this);
        this.btnNum5.setOnClickListener(this);
        this.btnNum6.setOnClickListener(this);
        this.btnNum7.setOnClickListener(this);
        this.btnNum8.setOnClickListener(this);
        this.btnNum9.setOnClickListener(this);

        this.btnDelete.setOnClickListener(this);
        this.btnAC.setOnClickListener(this);
        this.btnPercentage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onClickNumbers(v);
        onClickOperators(v);
    }

    public void onClickOperators(View v)
    {
        switch (v.getId()) {
            case R.id.btnAddition:
                this.operator = "+";
                txtvwOperations.setText(this.numbers1+this.operator);
                this.estate = true;
                break;
            case R.id.btnSubtraction:
                this.operator = "-";
                txtvwOperations.setText(this.numbers1+this.operator);
                this.estate = true;
                break;
            case R.id.btnMultiplication:
                this.operator = "*";
                txtvwOperations.setText(this.numbers1+this.operator);
                this.estate = true;
                break;
            case R.id.btnDivision:
                this.operator = "/";
                txtvwOperations.setText(this.numbers1+this.operator);
                this.estate = true;
                break;
            case R.id.btnPercentage:
                this.operator = "%";
                txtvwOperations.setText(this.numbers1+this.operator);
                this.estate = true;
                break;
            case R.id.btnEquals:

                calculate();
                break;
            case R.id.btnAC:
                resetAll();
                break;
        }
    }


    public void calculate()
    {
        if(this.estate != false && this.numbers2 != "") {
            int nums1 = Integer.parseInt(this.numbers1);
            int nums2 = Integer.parseInt(this.numbers2);
            switch (this.operator) {
                case "+":
                    this.result = nums1 + nums2;
                    break;
                case "-":
                    this.result = nums1 - nums2;
                    break;
                case "*":
                    this.result = nums1 * nums2;
                    break;
                case "/":
                    this.result  = nums1/nums2;
                    break;
                case "%":
                    this.result  = (nums2 * 100) / nums1;
                    break;
            }
            txtvwOperations.setText(""+ this.result);
            this.numbers1 = ""+ this.result;
            this.numbers2 = "";
        }
    }

    public void resetAll() {
        this.numbers1 = "";
        this.numbers2 = "";
        this.operator = "";
        this.estate = false;
        txtvwOperations.setText("");
    }

    public void onClickNumbers(View v) {
        if(this.estate == false) {
            onClickNumbers1(v);
        }
        else{
            onClickNumbers2(v);
        }
    }

    public void onClickNumbers1(View v) {
        switch (v.getId()) {
            case R.id.btnNum0:
                this.numbers1 += ""+this.btnNum0.getText().toString();
                break;
            case R.id.btnNum1:
                this.numbers1 += ""+this.btnNum1.getText().toString();
                break;
            case R.id.btnNum2:
                this.numbers1 += ""+this.btnNum2.getText().toString();
                break;
            case R.id.btnNum3:
                this.numbers1 += ""+this.btnNum3.getText().toString();
                break;
            case R.id.btnNum4:
                this.numbers1 += ""+this.btnNum4.getText().toString();
                break;
            case R.id.btnNum5:
                this.numbers1 += ""+this.btnNum5.getText().toString();
                break;
            case R.id.btnNum6:
                this.numbers1 += ""+this.btnNum6.getText().toString();
                break;
            case R.id.btnNum7:
                this.numbers1 += ""+this.btnNum7.getText().toString();
                break;
            case R.id.btnNum8:
                this.numbers1 += ""+this.btnNum8.getText().toString();
                break;
            case R.id.btnNum9:
                this.numbers1 += ""+this.btnNum9.getText().toString();
                break;
        }
        txtvwOperations.setText(this.numbers1);
    }

    public void onClickNumbers2(View v) {
        switch (v.getId()) {
            case R.id.btnNum0:
                this.numbers2 += ""+this.btnNum0.getText().toString();
                break;
            case R.id.btnNum1:
                this.numbers2 += ""+this.btnNum1.getText().toString();
                break;
            case R.id.btnNum2:
                this.numbers2 += ""+this.btnNum2.getText().toString();
                break;
            case R.id.btnNum3:
                this.numbers2 += ""+this.btnNum3.getText().toString();
                break;
            case R.id.btnNum4:
                this.numbers2 += ""+this.btnNum4.getText().toString();
                break;
            case R.id.btnNum5:
                this.numbers2 += ""+this.btnNum5.getText().toString();
                break;
            case R.id.btnNum6:
                this.numbers2 += ""+this.btnNum6.getText().toString();
                break;
            case R.id.btnNum7:
                this.numbers2 += ""+this.btnNum7.getText().toString();
                break;
            case R.id.btnNum8:
                this.numbers2 += ""+this.btnNum8.getText().toString();
                break;
            case R.id.btnNum9:
                this.numbers2 += ""+this.btnNum9.getText().toString();
                break;
        }
        txtvwOperations.setText(this.numbers1+this.operator+this.numbers2);
    }

}
