package com.company;
import java.util.Random;
public class Dice {
    Random random=new Random();
    Changes c=new Changes();
    public int d(){
        int a= random.nextInt(7);
        return a;
    }
public int userone(int o,int onedata,int twodata){

        onedata=onedata+o;
    if(onedata>15){
        System.out.println("user cannot move beyond the limit");
        onedata=onedata-o;
    }
    if(onedata==15){
        c.c(onedata,twodata);
       return 30;
        // System.out.println("user one is the winner");
    }
else
    {
        c.c(onedata, twodata);
    }
        return onedata;
}
public  int usertwo(int o,int onedata,int twodata){
        twodata=twodata+o;
    if(twodata>15){
        System.out.println(" cannot move beyond the limit");
        twodata=twodata-o;
       // return 80;
    }if(twodata==15){
        //System.out.println(username+" two is the winner");
        c.c(onedata,twodata);
        return 30;
        //twodata=twodata-o;

    }

    else {
        c.c(onedata,twodata);}

        return twodata;
    }

}
