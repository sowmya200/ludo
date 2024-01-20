package com.company;
public class design {
    public void d(){
        System.out.println("                 A PLAYER  ");
        System.out.println("                 |");
        System.out.println("                 V");
        for(int i=0;i<16;i++){
            for(int j=0;j<16;j++){
                if(i==1&&j==7){
                    System.out.print(" W ");
                }
                else if(i==13&&j==7){
                    System.out.print(" X ");
                }
                else if(i%3==0&&j%3==0){
                    System.out.print(".");
                }
                else if(i%3==0&&j%3!=0){
                    System.out.print("---");
                }
                else if(i%3!=0&&j%3==0){
                    if(i==4&&j==6||i==5&&j==6||i==4&&j==9||i==5&&j==9
                    ||i==10&&j==6||i==11&&j==6||i==11&&j==9||i==10&&j==9){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("|");
                    }
                }
                else if(i==7&&j==7){
                    System.out.print("FIN");
                }
                else if(i==7&&j==8){
                    System.out.print("AL ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
        System.out.println("                ^");
        System.out.println("                |  ");
        System.out.println("                B");
    }
}
