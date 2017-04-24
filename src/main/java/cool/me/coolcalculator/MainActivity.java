package cool.me.coolcalculator;

import android.renderscript.Double4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result_text);
    }
//variables
    static String A ="";
    static String B = "";
    static double a = 0.0;
    static double b = 0.0;
    static int func = 0;
    static boolean function = false;
    static double ans = 0.0;
//get ridd of the preceding zero
    public boolean isZero() {
        String value = result.getText().toString();
        return !(value.contains("1") || value.contains("2") || value.contains("3") || value.contains("4") || value.contains("5")
                || value.contains("6") || value.contains("7") || value.contains("8") || value.contains("9") || value.contains("."));
    }
//reset
    public void acClicked(View view) {
        result.setText("0");
        A ="";
        B = "";
        a = 0.0;
        b = 0.0;
        func = 0;
        function = false;
        ans = 0.0;
    }
// addition
    public void addClicked(View view){
        function = true;
        A = result.getText().toString();//store value
        result.setText("0");
        func = 000;//set which operation to preform
    }
//subtraction
    public void subClicked(View view){
        function = true;
        A = result.getText().toString();
        result.setText("0");
        func = 001;
    }
//multiplcation
    public void mulClicked(View view){
        function = true;
        A = result.getText().toString();
        result.setText("0");
        func = 010;
    }
//division
    public void divClicked(View view){
        function = true;
        A = result.getText().toString();
        result.setText("0");
        func = 011;
    }
//modulo
    public void perClicked(View view){
        function = true;
        A = result.getText().toString();
        result.setText("0");
        func = 100;
    }
//implement functions
    public void equClicked(View view){
        B = result.getText().toString();//store second number
        if(function){
            //convert to double
            a = Double.parseDouble(A);
            b = Double.parseDouble(B);
            //ifs used to decide which to preform
            if( func == 000){
                ans = a + b;
            }
            if ( func == 001){
                ans = a-b;
            }
            if(func == 010){
                ans = a*b;
            }
            if(func == 011){
                ans = a/b;
            }
            if(func == 100){
                ans = a%b;
            }
        }
        result.setText(""+ans);//display calculation
        function = false;
    }
//create decimal numbers
    public  void decClicked(View view){
        result.setText(String.valueOf(result.getText()+"."));
    }
//switch between postive and negative
    public void pomClicked(View view) {
        if (!result.getText().toString().contains("-")) {
            result.setText(String.valueOf(("-" + result.getText().toString())));
        } else {
            result.setText(String.valueOf(result.getText().toString().substring(1)));
        }
    }
//diplay numbers
    public void sevenClicked(View view) {
        if (isZero())
            result.setText("7");
        else
            result.setText(String.valueOf(result.getText() + "7"));

    }
    public void eightClicked(View view) {
        if (isZero())
            result.setText("8");
        else
            result.setText(String.valueOf(result.getText() + "8"));
    }
    public void nineClicked(View view) {
        if (isZero())
            result.setText("9");
        else
            result.setText(String.valueOf(result.getText() + "9"));
    }
    public void fourClicked(View view) {
        if (isZero())
            result.setText("4");
        else
            result.setText(String.valueOf(result.getText() + "4"));
    }
    public void fiveClicked(View view) {
        if (isZero())
            result.setText("5");
        else
            result.setText(String.valueOf(result.getText() + "5"));
    }
    public void sixClicked(View view) {
        if (isZero())
            result.setText("6");
        else
            result.setText(String.valueOf(result.getText() + "6"));
    }
    public void oneClicked(View view) {
        if (isZero())
            result.setText("1");
        else
            result.setText(String.valueOf(result.getText() + "1"));
    }
    public void twoClicked(View view) {
        if (isZero())
            result.setText("2");
        else
            result.setText(String.valueOf(result.getText() + "2"));
    }
    public void threeClicked(View view) {
        if (isZero())
            result.setText("3");
        else
            result.setText(String.valueOf(result.getText() + "3"));
    }
    public void zeroClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "0");

    }
}
