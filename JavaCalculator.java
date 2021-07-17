import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class JavaCalculator implements ActionListener {
    JLabel ope,eq,head,icon,calc, val1, val2;
    //JTextField  val2;
    JPanel jp, jp1,jp2,jp3, jp4,jp5;

    ArrayList <String> num1 = new ArrayList<String>();
    ArrayList <String> num2 = new ArrayList<String>();
    String out =""; 
    String operand1 = "";
    String operand2 = "";
    //String result = "";

    //String operand1andoperator = "";
    String operator = "";

    public JavaCalculator(){
        try {
            
        JFrame frame = new JFrame();
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(350,600));
        frame.setLocation(new Point(500,20));
       
        frame.setTitle("Simple Calculator");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Pictures\\bag.jpg"));
        frame.setLayout(new GridLayout(6,1));

        jp = new JPanel(new FlowLayout());
        head = new JLabel("STANDARD");
        jp.add(head);
        icon = new JLabel("                                                                   Icon");
        jp.add(icon);
        frame.add(jp);


        //jp1 = new JPanel(new FlowLayout());
        jp1 = new JPanel(new GridLayout(1,1));
        val1 = new JLabel("");
        val1.setHorizontalAlignment(JLabel.RIGHT);
        val1.setFont(new Font("Serrif",Font.BOLD,20 ));
        jp1.add(val1); 
        frame.add(jp1);
        

        //jp2 = new JPanel(new FlowLayout());
        jp2 = new JPanel(new GridLayout());
        eq = new JLabel("0");
        eq.setHorizontalAlignment(JLabel.RIGHT);
        eq.setFont(new Font("Serrif",Font.BOLD,40 ));
        jp2.add(eq);
        //jp2.add(val2);
        frame.add(jp2);


         jp3 = new JPanel(new GridLayout(1,6));
        //jp3 = new JPanel(new FlowLayout());
        JButton mc = new JButton("MC");
        mc.addActionListener(this);
        jp3.add(mc);
        JButton mr = new JButton("MR");
        mr.addActionListener(this);
        jp3.add(mr);
        JButton mP = new JButton("M+");
        mP.addActionListener(this);
        jp3.add(mP);
        JButton mM = new JButton("M-");
        mM.addActionListener(this);
        jp3.add(mM);
        JButton ms = new JButton("MS");
        ms.addActionListener(this);
        jp3.add(ms);
        JButton mCaret = new JButton("M^");
        mCaret.addActionListener(this);
        jp3.add(mCaret);

        frame.add(jp3);

        jp4 = new JPanel(new GridLayout(1,4));
        JButton perc = new JButton("%");
        perc.addActionListener(this);
        jp4.add(perc);
        JButton root = new JButton("sqrt");
        root.addActionListener(this);
        jp4.add(root);
        JButton sqr = new JButton("sqr");
        sqr.addActionListener(this);
        jp4.add(sqr);
        JButton oneX = new JButton("1/x");
        oneX.addActionListener(this);
        jp4.add(oneX);
        frame.add(jp4);

        jp5 = new JPanel(new GridLayout(5,4));
        JButton cE = new JButton("CE");
        cE.addActionListener(this);
        jp5.add(cE);
        JButton c = new JButton("C");
        c.addActionListener(this);
        jp5.add(c);
        JButton x = new JButton("x");
        x.addActionListener(this);
        jp5.add(x);
        JButton div = new JButton("/");
        div.addActionListener(this);
        jp5.add(div);
        JButton seven = new JButton("7");
        seven.addActionListener(this);
        jp5.add(seven);
        JButton eight = new JButton("8");
        eight.addActionListener(this);
        jp5.add(eight);
        JButton nine = new JButton("9");
        nine.addActionListener(this);
        jp5.add(nine);
        JButton mult = new JButton("X");
        mult.addActionListener(this);
        jp5.add(mult);
        JButton four = new JButton("4");
        four.addActionListener(this);
        jp5.add(four);
        JButton five = new JButton("5");
        five.addActionListener(this);
        jp5.add(five);
        JButton six = new JButton("6");
        six.addActionListener(this);
        jp5.add(six);
        JButton minus = new JButton("-");
        minus.addActionListener(this);
        jp5.add(minus);
        JButton one = new JButton("1");
        one.addActionListener(this);
        jp5.add(one);
        JButton two = new JButton("2");
        two.addActionListener(this);
        jp5.add(two);
        JButton three = new JButton("3");
        three.addActionListener(this);
        jp5.add(three);
        JButton plus = new JButton("+");
        plus.addActionListener(this);
        jp5.add(plus);
        JButton plusMinus = new JButton("+/-");
        plusMinus.addActionListener(this);
        jp5.add(plusMinus);
        JButton zero = new JButton("0");
        zero.addActionListener(this);
        jp5.add(zero);
        JButton point = new JButton(".");
        point.addActionListener(this);
        jp5.add(point);
        JButton equal = new JButton("=");
        equal.addActionListener(this);
        jp5.add(equal);
        frame.add(jp5);

        
        // eq = new JLabel();
        // jp1.add(eq);
        
        
        // jp2 = new JPanel(new FlowLayout());
        // JButton add = new JButton("+");
        // add.addActionListener(this);
        // jp2.add(add);
        // JButton subt = new JButton();
        // subt.addActionListener(this);
        // jp2.add(subt);
        // JButton mult = new JButton("*");
        // mult.addActionListener(this);
        // jp2.add(mult);
        // JButton divi = new JButton("/");
        // divi.addActionListener(this);
        // jp2.add(divi);
        // frame.add(jp2);
        
        //frame.pack();
        frame.setVisible(true);

        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }

    public void actionPerformed(ActionEvent ev){
       try {
        JButton but = (JButton) ev.getSource();
        String com = but.getActionCommand().toString();
        
        if (com =="+") {
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText(operand1 +"" + com);
            }else if(eq.getText() !="0"){
                  
                  operand1 = eq.getText();
                    operator = com;
                    val1.setText(operand1 +"" + com);
            }else{
                operator = com;
                 val1.setText(operand1 +"" + com);
            }

            

        }else if(com =="-"){
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText(operand1 +"" + com);
            }else if(eq.getText() !="0"){
                  
                  operand1 = eq.getText();
                    operator = com;
                    val1.setText(operand1 +"" + com);
            }else{
                operator = com;
                 val1.setText(operand1 +"" + com);
            }
        }else if(com =="X"){
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText(operand1 +"" + com);
            }else if(eq.getText() !=""){
                  
                  operand1 = eq.getText();
                    operator = com;
                    val1.setText(operand1 +"" + com);
            }else{
                operator = com;
                 val1.setText(operand1 +"" + com);
            }
        }else if(com =="/"){
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText(operand1 +"  " + com);
            }else if(eq.getText() !="0"){
                  
                  operand1 = eq.getText();
                    operator = com;
                    val1.setText(operand1+ com);
            }else{
                operator = com;
                 val1.setText(operand1+ com);
            }
        }else if(com =="sqr"){
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText(com+""+operand1);
                square();
            }else if(eq.getText() !="0"){
                  
                  String ope1 = eq.getText();
                String trim = ope1.trim();
                  operand1= trim;
                    operator = com;
                    val1.setText(com+""+operand1 );
                    square();
            }
        }else if(com =="sqrt"){
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText(com+operand1);
                root();
            }else if(eq.getText() !="0"){
                  
                String ope1 = eq.getText();
                String trim = ope1.trim();
                  operand1= trim;
                    operator = com;
                    val1.setText(com+""+operand1 );
                    root();
            }
        }else if(com =="1/x"){
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText("1/"+operand1);
                eq.setText("cannot divide by zero");
            }else if(eq.getText() !="0"){
                String ope1 = eq.getText();
                String trim = ope1.trim();
                  operand1= trim;
                    operator = com;
                    val1.setText("1/"+operand1 );
                    oneDiv();
            }
        }else if(com =="%"){
            if ((num1.size()== 0) && (eq.getText() == "0")) {
                operand1 ="0";
                operator =com;
                val1.setText(operand1 +"" + com);
            }else if(eq.getText() !="0"){
                  
                  operand1 = eq.getText();
                    operator = com; 
                    val1.setText(operand1 +"" + com);
            }else{
                operator = com;
                 val1.setText(operand1 +"" + com);
            }
        }else if(com =="C" || com =="CE" ){
                eq.setText("0");
                val1.setText("");
                num1.clear();
                num2.clear();
                 operand1 = "";
                operand2="";
                operator="";
                out="";

            
        }else if(com == "x"){
            delete(); 
        
        }else if(com == "1"){
           if (operator == "") {
            operand1= "";
            num1.add(com);
            input1(); 
           } else {
                operand2 = "";
               num2.add(com);
               
               input2();

           }  
        }else if(com == "2"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }  
        }else if(com == "3"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }   
        }else if(com == "4"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }    
        }else if(com == "5"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }   
        }else if(com == "6"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }    
        }else if(com == "7"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }   
        }else if(com == "8"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }  
        }else if(com == "9"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }    
        }else if(com == "0"){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }   
        }else if(com == "."){
            if (operator == "") {
                operand1= "";
                num1.add(com);
                input1(); 
               } else {
                    operand2 = "";
                   num2.add(com);
                   
                   input2();
    
               }  
        }else if(com == "="){

                if(operator  == "+"){
                    sum();
                
                }

                if (operator == "-") {
                   minus();
                }

                if (operator=="X") {
                    multiply();
                }

                if (operator == "/") {
                    divider();
                }
                if (operator == "%") {
                    modulus();
                }
                // if (operator == "sqr") {
                //     square();
                // }
                // if (operator == "sqrt") {
                //     root();
                // }
                

                num1.clear();
                num2.clear();
                val1.setText("");
                 operand1 = "";
                operand2="";
                operator="";
                out="";
        }
    

       } catch (Exception e) {
           //TODO: handle exception
       }
        
    } 

    //to set the first operand
    public void input1(){
        try {
            for(int i = 0; i < num1.size(); i++){
              
                operand1 += num1.get(i);
                 //eq.setText(operand1);
              
                //System.out.println(num1.get(i));
            }
            out = operand1;
    
             eq.setText(out);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }

        //to set the second operand
    public void input2(){
        try {
            for(int i = 0; i < num2.size(); i++){
              
                operand2 += num2.get(i);
            } 
            out = operand2;

            eq.setText(out);
        } catch (Exception e) {
            //TODO: handle exception
        }
         
    }

    public void sum(){
         try {
            float result =  Float.parseFloat(operand1) + Float.parseFloat(operand2);
            eq.setText(""+ result);
         } catch (Exception e) {
             //TODO: handle exception
         }
        
    }
    public void minus(){
        try {
            float result =  Float.parseFloat(operand1) - Float.parseFloat(operand2);
       eq.setText(""+ result);
       
        } catch (Exception e) {
            //TODO: handle exception
        }
   }

   public void multiply(){
        try {
            float result =  Float.parseFloat(operand1) * Float.parseFloat(operand2);
        eq.setText(""+ result);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void divider(){
        try {
            float result =  Float.parseFloat(operand1) / Float.parseFloat(operand2);
        eq.setText(""+ result);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void square(){
        try {
            float result =  Float.parseFloat(operand1) * Float.parseFloat(operand1);
            eq.setText(""+ result);
            num1.clear();
                num2.clear();
                 operand1 = "";
                operand2="";
                operator="";
                out="";
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void root(){
        try {
            double result = Math.sqrt(Double.parseDouble(operand1)); 
            eq.setText(""+ result);
            num1.clear();
            num2.clear();
             operand1 = "";
            operand2="";
            operator="";
            out="";
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void oneDiv(){
        try {
            double result = 1/(Double.parseDouble(operand1)); 
            eq.setText("                          "+ result);
            num1.clear();
            num2.clear();
             operand1 = "";
            operand2="";
            operator="";
            out="";
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    public void modulus(){
        try {
            float result =  Float.parseFloat(operand1) % Float.parseFloat(operand2);
        eq.setText(""+ result);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void delete(){
        if (num1.size() !=0 && operand2=="" ) {
            if (num1.size()== 1) {
                num1.remove(num1.size()-1);
                operand1 = "0";
                input1(); 
            }
            num1.remove(num1.size()-1);
            operand1 = "";
            input1();
        }else if (num1.size() !=0 && num2.size() != 0 ) {
            if (num2.size()== 1) {
                num2.remove(num2.size()-1);
                operand2 = "0";
                input2();
            }
            num2.remove(num2.size()-1);
            operand2 = "";
            input2();
           
            
        }
    }

   
    public static void main(String[] args) {
        JavaCalculator jC= new JavaCalculator();
    }
    
}




// public class SimpleCalculator implements ActionListener {
//     JLabel ope,eq,head,icon;
//     JTextField val1, val2;
//     JPanel jp, jp1,jp2;
//     public SimpleCalculator(){
        
//         JFrame frame = new JFrame();
//         frame.setForeground(Color.WHITE);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(new Dimension(100,300));
//         frame.setLocation(new Point(800,200));
       
//         frame.setTitle("Simple Calculator");
//         frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Pictures\\bag.jpg"));
//         frame.setVisible(true);
//         frame.setLayout(new GridLayout(3,1));

//         jp = new JPanel(new FlowLayout());
//         head = new JLabel("STANDARD");
//         jp.add(head);
//         icon = new JLabel("                                                                   Icon");
//         jp.add(icon);
//         frame.add(jp);


//         jp1 = new JPanel(new FlowLayout());
//         val1 = new JTextField(5);
//         jp1.add(val1);
//         ope= new JLabel("+");
//         jp1.add(ope);
//         val2 = new JTextField(5);
//         jp1.add(val2);
//         eq = new JLabel();
//         jp1.add(eq);
//         frame.add(jp1);
        
//         jp2 = new JPanel(new FlowLayout());
//         JButton add = new JButton("+");
//         add.addActionListener(this);
//         jp2.add(add);
//         JButton subt = new JButton();
//         subt.addActionListener(this);
//         jp2.add(subt);
//         JButton mult = new JButton("*");
//         mult.addActionListener(this);
//         jp2.add(mult);
//         JButton divi = new JButton("/");
//         divi.addActionListener(this);
//         jp2.add(divi);
//         frame.add(jp2);
//         frame.pack();

//     }

//     public void actionPerformed(ActionEvent e){
//         JButton but = (JButton) e.getSource();
//         String com = but.getActionCommand().toString();
//         String va1 = val1.getText();
//         String va2 = val2.getText();
//         ope.setText(com);
//         if (com =="+") {
//             float result = Float.parseFloat(va1) + Float.parseFloat(va2);
//             eq.setText(" "+result);
//         }else if(com == "-"){
//             float result = Float.parseFloat(va1) - Float.parseFloat(va2);
//             eq.setText(" "+result);
//         }else if(com == "*"){
//             float result = Float.parseFloat(va1) * Float.parseFloat(va2);
//             eq.setText(" "+result);
//         }else if(com == "/"){
//             float result = Float.parseFloat(va1) / Float.parseFloat(va2);
//             eq.setText(" "+result);
//         }
//     }


//     public static void main(String[] args) {
//         SimpleCalculator sc= new SimpleCalculator();
//     }
    
// }

