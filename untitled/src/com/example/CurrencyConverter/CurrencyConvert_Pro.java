package com.example.CurrencyConverter;
import java.util.*;
import java.text.DecimalFormat;
public class CurrencyConvert_Pro {
    public static void main(String[] args) {
double rupee,dollar,pound,code,euro,KWD;
DecimalFormat f=new DecimalFormat("##.###");
Scanner sc=new Scanner(System.in);
        System.out.println("*** Welcome To Sheku's Currency Converter Project ***\nEnter the currncy Code \n1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Kuwaiti dinar");
        code=sc.nextInt();
        if(code==1){
            System.out.println("Enter amount in rupees:");
            rupee= sc.nextInt();
            dollar=rupee*0.012;
            System.out.println("Dollar:"+f.format(dollar));
            pound=rupee*0.0096;
            System.out.println("Pound:"+f.format(pound));
            euro=rupee*0.011;
            System.out.println("Euro:"+f.format(euro));
            KWD=rupee*0.0037;
            System.out.println("Kuwaiti dinar:"+f.format(KWD));
        }
        else if (code==2) {
            System.out.println("Enter amount in dollar:");
            dollar=sc.nextInt();
            rupee=dollar*0.012;
            System.out.println("Rupees:"+f.format(rupee));
            pound=dollar*1.26;
            System.out.println("Pound:"+f.format(pound));
            euro=dollar*1.08;
            System.out.println("Euro:"+f.format(euro));
            KWD=dollar*3.23;
            System.out.println("Kuwaiti dinar:"+f.format(KWD));
        }
        else if (code==3) {
            System.out.println("Enter amount in Pound:");
            pound=sc.nextInt();
            rupee=pound*104.12;
            System.out.println("Rupees:"+f.format(rupee));
            dollar=pound*1.26;
            System.out.println("Dollar:"+f.format(dollar));
            euro=pound*1.17;
            System.out.println("Euro:"+f.format(euro));
            KWD=pound*0.39;
            System.out.println("Kuwaiti dinar:"+f.format(KWD));
        }
        else if (code == 4) {
            System.out.println("Enter amount in Euro:");
            euro=sc.nextInt();
            rupee=euro*89.09;
            System.out.println("Rupees:"+f.format(rupee));
            dollar=euro*1.08;
            System.out.println("Dollar:"+f.format(dollar));
            pound=euro*0.86;
            System.out.println("Pound:"+f.format(pound));
            KWD=euro*0.33;
            System.out.println("Kuwaiti dinar:"+f.format(KWD));
        }
        else if (code==5) {
            System.out.println("Enter amount in Kuwaiti dinar:");
            KWD=sc.nextInt();
            rupee=KWD*267.56;
            System.out.println("Rupees:"+f.format(rupee));
            dollar=KWD*3.23;
            System.out.println("Dollar:"+f.format(dollar));
            pound=KWD*2.57;
            System.out.println("Pound:"+f.format(pound));
            euro=KWD*3.00;
            System.out.println("Euro:"+f.format(euro));
        }
        else
            System.out.println("Invalid Code!");
    }
}
