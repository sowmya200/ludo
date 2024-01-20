package com.company;

import java.util.Scanner;
public class Main {
    public static int a=0;
    public static int one=0;
    public static int two=0;
    public static int onedata=1;
    public static int twodata=1;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dice dice=new Dice();
        design d=new design();
        Win w=new Win();
        Changes c=new Changes();
        System.out.println("Enter user one's name");
        String user1 =sc.nextLine();
        System.out.println("Enter user two's name");
        String user2=sc.nextLine();
        d.d();

        w.win();
        while(w.win()=="a"){
        if(a%2==0){
        System.out.println(user1 +" roll the dice by entering a digit");
        int ss= sc.nextInt();

            one=dice.d();
            onedata=dice.userone(one,onedata,twodata);
            if(onedata>16){
                System.out.println(user1+" is the winner********");
                break;
            }
            System.out.println(one);

        a++;}
        else{
            System.out.println(user2 +" roll the dice by entering a digit");
            int ss= sc.nextInt();
            two=dice.d();
            twodata=dice.usertwo(two,onedata,twodata);
            if(twodata>16){
                System.out.println(user2+" is the winner");
                break;
            }
           System.out.println(two);
            a++;
        }
    }}
}
