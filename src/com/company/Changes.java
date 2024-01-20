package com.company;

public class Changes {
    public static int c,d,e,f;
    public  int ifs(int i,int j,int a,int b,int k,int l,int m,int o,int t){
          if(i==a&&j==b){
        if(o==l){
            System.out.print("W");
        k=f;}
    if(t==m) {
        System.out.print("X");
    }
    }
          return 1;}



    public void c(int o,int t){
        System.out.println("                 A PLAYER  ");
        System.out.println("                 |");
        System.out.println("                 V");
        for(int i=0;i<16;i++){
            for(int j=0;j<16;j++){


                if(i%3==0&&j%3==0){
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
                    ifs(i,j,1,1,1,0,7,o,t);
                    ifs(i,j,1,4,2,0,8,o,t);
                    ifs(i,j,1,7,3,1,9,o,t);
                    ifs(i,j,1,10,4,2,10,o,t);
                    ifs(i,j,1,13,5,3,11,o,t);
                    ifs(i,j,4,13,6,4,12,o,t);
                    ifs(i,j,7,13,7,5,13,o,t);
                    ifs(i,j,10,13,8,6,0,o,t);
                    ifs(i,j,13,13,9,7,0,o,t);
                    ifs(i,j,13,10,10,8,0,o,t);
                    ifs(i,j,13,7,11,9,1,o,t);
                    ifs(i,j,13,4,12,10,2,o,t);
                    ifs(i,j,13,1,13,11,3,o,t);
                    ifs(i,j,10,1,14,12,4,o,t);
                    ifs(i,j,7,1,15,13,5,o,t);
                    ifs(i,j,4,1,16,0,6,o,t);
                    ifs(i,j,7,4,17,14,0,o,t);
                    ifs(i,j,8,7,18,15,15,o,t);
                    ifs(i,j,7,10,19,0,14,o,t);

                    System.out.print("   ");
                }

            }
            System.out.println();
        }
        System.out.println("                 ^ ");
        System.out.println("                 |  ");
        System.out.println("                B");
    }
}
