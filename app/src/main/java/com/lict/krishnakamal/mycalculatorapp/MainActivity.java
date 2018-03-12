package com.lict.krishnakamal.mycalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button zero,one,two,three,four,five,six,seven,eight,nine,dotpoint,clearbutton,allClearButton,addButton,equalButton,subButton,mullButton,divButton,krishnaButton;
    private Button sinButton,cosButton,tanButton,brktOpen,brktClose,powerButton,modButton,powerOf2Button,percentButton,rootButton,onButton,fixedAddButton;
    private TextView text,eDitText;

    private int clickFixedAddButton;
    private double num1,num2;
    private double sum;
    boolean cAdd,cSub,cMul,cDiv,cEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero=findViewById(R.id.zero);
        text=findViewById(R.id.textBox);
        eDitText=findViewById(R.id.eText);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        dotpoint=findViewById(R.id.dot);
        clearbutton=findViewById(R.id.clear);
        allClearButton=findViewById(R.id.allClear);
        addButton=findViewById(R.id.pluse);
        subButton=findViewById(R.id.minuse);
        mullButton=findViewById(R.id.multiple);
        divButton=findViewById(R.id.divide);
        equalButton=findViewById(R.id.equal);
        krishnaButton=findViewById(R.id.love);
        sinButton=findViewById(R.id.sin);
        cosButton=findViewById(R.id.cos);
        tanButton=findViewById(R.id.tan);
        powerButton=findViewById(R.id.power);
        powerOf2Button=findViewById(R.id.powerOf2);
        modButton=findViewById(R.id.mod);
        brktOpen=findViewById(R.id.brktO);
        brktClose=findViewById(R.id.brktC);
        percentButton=findViewById(R.id.persentage);
        rootButton=findViewById(R.id.root);
        fixedAddButton=findViewById(R.id.fixedAdd);

        modButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+modButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+modButton.getText().toString());
            }
        });
        brktOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+brktOpen.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+brktOpen.getText().toString());
            }
        });
        brktClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+brktClose.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+brktClose.getText().toString());
            }
        });
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+"0"+powerButton.getText().toString());
                    cEqual=false;
                }
                else

                    eDitText.setText(eDitText.getText().toString()+powerButton.getText().toString());


            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+zero.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+zero.getText().toString());


            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+one.getText().toString());
                    cEqual=false;
                }
                else
                {
                    eDitText.setText(eDitText.getText().toString()+one.getText().toString());
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+two.getText().toString());
                    cEqual=false;
                }
                else
                {
                    eDitText.setText(eDitText.getText().toString()+two.getText().toString());
                }



            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+three.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+three.getText().toString());


            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+four.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+four.getText().toString());


            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+five.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+five.getText().toString());


            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+six.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+six.getText().toString());


            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+seven.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+seven.getText().toString());


            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+eight.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+eight.getText().toString());


            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+nine.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+nine.getText().toString());


            }
        });
        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+sinButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+sinButton.getText().toString());
            }
        });
        cosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+cosButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+cosButton.getText().toString());
            }
        });
        tanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+tanButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+tanButton.getText().toString());
            }
        });
        dotpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    int sign=0;
                    char[] textArray=eDitText.getText().toString().toCharArray();
                    for (int i=0 ;i<textArray.length;i++)
                    {
                        if (textArray[i]=='.')
                        {
                            sign++;
                        }
                    }
                    if (sign==0)
                    {
                        if ("".equals(eDitText.getText().toString()))
                        {
                            eDitText.setText(eDitText.getText().toString()+"0"+dotpoint.getText().toString());
                        }
                        else
                        {
                            eDitText.setText(eDitText.getText().toString()+dotpoint.getText().toString());
                        }

                    }
                    cEqual=false;
                }
                else
                {
                    int sign=0;
                    char[] textArray=eDitText.getText().toString().toCharArray();
                    for (int i=0 ;i<textArray.length;i++)
                    {
                        if (textArray[i]=='.')
                        {
                            sign++;
                        }
                    }
                    if (sign==0)
                    {
                        if ("".equals(eDitText.getText().toString()))
                        {
                            eDitText.setText(eDitText.getText().toString()+"0"+dotpoint.getText().toString());
                        }
                        else
                        {
                            eDitText.setText(eDitText.getText().toString()+dotpoint.getText().toString());
                        }

                    }
                }


            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                String textString=eDitText.getText().toString();
                int last= textString.toCharArray().length;
              /* String finalString= textString.replace(textString.charAt(last-1),'0')*/;
                StringBuilder sb=new StringBuilder();
                sb.append(eDitText.getText());
                try {
                    sb.deleteCharAt(last - 1);
                }catch(Exception e){
                    Toast.makeText(getApplicationContext(),"Text Box Empty Now",Toast.LENGTH_LONG).show();}
                // char[] textCarArray=sb.toString().toCharArray();

                eDitText.setText(sb);
            }
        });
        allClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;

                eDitText.setText("");
                text.setText("");
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                   /* eDitText.setText("");*/
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+addButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+addButton.getText().toString());

            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                   /* eDitText.setText("");*/
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+subButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+subButton.getText().toString());
               /* num1=Integer.parseInt(eDitText.getText().toString());
                text.setText(""+num1+"-");
                cSub=true;
                eDitText.setText("");*/
            }
        });
        mullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                    eDitText.setText("");
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+mullButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+mullButton.getText().toString());
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                if (cEqual==true)
                {
                   /* eDitText.setText("");*/
                    text.setText("");
                    eDitText.setText(eDitText.getText().toString()+divButton.getText().toString());
                    cEqual=false;
                }
                else
                    eDitText.setText(eDitText.getText().toString()+divButton.getText().toString());
            }
        });
        fixedAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    clickFixedAddButton++;
                    double eDitNum=Double.parseDouble(eDitText.getText().toString());
                    if (clickFixedAddButton==1)
                    {
                        num1=eDitNum;
                    }
                    double fixedAdd=eDitNum+num1;
                    String result=Double.toString(fixedAdd);
                    String[] resultArray=result.split("[.]");
                    int len=(resultArray[1]).length();
                    if (len>1)
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else if(len==1 && !"0".equals(resultArray[1]) )
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else
                        eDitText.setText( resultArray[0].toString());
                    cEqual=true;
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_LONG).show();
                }
            }
        });
        powerOf2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                try{
                    double eDitNum=Double.parseDouble(eDitText.getText().toString());
                    double resultOfP=Math.pow(2,eDitNum);
                    String powerOfTwo="2^"+eDitText.getText().toString();
                    text.setText(powerOfTwo);
                    String result=Double.toString(resultOfP);
                    String[] resultArray=result.split("[.]");
                    int len=(resultArray[1]).length();
                    if (len>1)
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else if(len==1 && !"0".equals(resultArray[1]) )
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else
                        eDitText.setText( resultArray[0].toString());
                    cEqual=true;
                }
                catch (Exception e)
                {
                    /*Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_LONG).show();*/
                    text.setText("");
                    eDitText.setText("Math Error");
                }

            }

        });
        rootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                try
                {
                    double eDitNum=Double.parseDouble(eDitText.getText().toString());
                    double resultOfsqrt=Math.sqrt(eDitNum);
                    String message="sqrt("+eDitText.getText().toString()+")";
                    text.setText(message);
                    String result=Double.toString(resultOfsqrt);
                    String[] resultArray=result.split("[.]");
                    int len=(resultArray[1]).length();
                    if (len>1)
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else if(len==1 && !"0".equals(resultArray[1]) )
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else
                        eDitText.setText( resultArray[0].toString());
                    cEqual=true;
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_LONG).show();
                }
            }
        });


        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                try
                {
                    cEqual=true;
                    String TextStrinValue=eDitText.getText().toString();
                    text.setText(TextStrinValue);
                    String result=Double.toString(eval(TextStrinValue));
                    String[] resultArray=result.split("[.]");
                    int len=(resultArray[1]).length();
                    if (len>1)
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else if(len==1 && !"0".equals(resultArray[1]) )
                    {
                        eDitText.setText( resultArray[0].toString()+"."+resultArray[1].toString());
                    }
                    else
                        eDitText.setText( resultArray[0].toString());
                }
                catch ( Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Mathe Error",Toast.LENGTH_LONG).show();
                }



            }
            public  double eval(final String str) {
                if (str.indexOf("mod")!=-1)
                {
                    String[] arrayOfNums=str.split("mod");
                    double fn=Double.parseDouble(arrayOfNums[0]);
                    double sn=Double.parseDouble(arrayOfNums[1]);
                    return fn%sn;
                }
                else {
                    return new Object() {
                        int pos = -1, ch;

                        void nextChar() {
                            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                        }

                        boolean eat(int charToEat) {
                            while (ch == ' ') nextChar();
                            if (ch == charToEat) {
                                nextChar();
                                return true;
                            }
                            return false;
                        }

                        double parse() {
                            nextChar();
                            double x = parseExpression();
                            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                            return x;
                        }

                        // Grammar:
                        // expression = term | expression `+` term | expression `-` term
                        // term = factor | term `*` factor | term `/` factor
                        // factor = `+` factor | `-` factor | `(` expression `)`
                        //        | number | functionName factor | factor `^` factor

                        double parseExpression() {
                            double x = parseTerm();
                            for (;;) {
                                if      (eat('+')) x += parseTerm(); // addition
                                else if (eat('-')) x -= parseTerm(); // subtraction
                                else return x;
                            }
                        }

                        double parseTerm() {
                            double x = parseFactor();
                            for (;;) {
                                if      (eat('*')) x *= parseFactor(); // multiplication
                                else if (eat('/')) x /= parseFactor(); // division
                                else return x;
                            }
                        }

                        double parseFactor() {
                            if (eat('+')) return parseFactor(); // unary plus
                            if (eat('-')) return -parseFactor(); // unary minus

                            double x;
                            int startPos = this.pos;
                            if (eat('(')) { // parentheses
                                x = parseExpression();
                                eat(')');
                            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                                x = Double.parseDouble(str.substring(startPos, this.pos));
                            } else if (ch >= 'a' && ch <= 'z') { // functions
                                while (ch >= 'a' && ch <= 'z') nextChar();
                                String func = str.substring(startPos, this.pos);
                                x = parseFactor();
                                if (func.equals("sqrt")) x = Math.sqrt(x);
                                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                                else throw new RuntimeException("Unknown function: " + func);
                            } else {
                                throw new RuntimeException("Unexpected: " + (char)ch);
                            }

                            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                            return x;
                        }
                    }.parse();
                }

            }
        });


        krishnaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickFixedAddButton=0;
                Toast.makeText(getApplicationContext(),"I evol ilapiD",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String obj = savedInstanceState.getString("dataResult");
        String obj1 = savedInstanceState.getString("dataStrins");
        eDitText.setText(obj);
        text.setText(obj1);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("dataResult",eDitText.getText().toString() );
        outState.putString("dataStrins",text.getText().toString() );
    }
}
