public class Day2 {
    public static void main(String[] args){
        int a = 9;
        a++;                        
        System.out.println (a);     //10
        a--;
        System.out.println (a);     //9
        ++a;
        System.out.println (a);     //10
        System.out.println (a++);   //10    
        System.out.println (a--);   //11
        System.out.println (--a);   //9
        System.out.println (++a);   //10

        int age = 18;
        String result = (age>=18) ? "Can Vote" : "Cannot Vote";
        System.out.println(result);

        int ch=6;
        switch(ch){
            case 1:
                for(int i=0;i<5;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=0;i<5;i++){
                    for(int j=1;j<5-i;j++)
                        System.out.print(" ");
                    for(int k=0;k<=i;k++)
                        System.out.print("*");
                    System.out.println();
                }
                break;
            case 3:
                for(int i=0;i<5;i++){
                    for(int j=5;j>5-i;j--)
                        System.out.print(" ");
                    for(int k=5;k>i;k--)
                        System.out.print("*");
                    System.out.println();
                }
                break;
            
            case 4:
                for(int i=0;i<5;i++){

                    for(int k=0;k<5-i;k++)
                        System.out.print(" ");
                
                    for(int j=0;j<=i;j++)
                        System.out.print(" $");
                    
                    System.out.println();
                }
                break;
            case 5:
                for(int i=0;i<5;i++){

                    for(int k=0;k<5-i;k++)
                        System.out.print(" ");
                
                    for(int j=0;j<=i;j++)
                        System.out.print(" "+j);
                    
                    System.out.println();
                }
                break;
            
            case 6:
                for(int i=5;i>0;i--){

                    for(int k=0;k<5-i;k++)
                        System.out.print(" ");
                
                    for(int j=0;j<=i;j++)
                        System.out.print(" *");
                    
                    System.out.println();
                }
                for(int i=0;i<5;i++){

                    for(int k=0;k<5-i;k++)
                        System.out.print(" ");
                
                    for(int j=0;j<=i;j++)
                        System.out.print(" *");
                    
                    System.out.println();
                }
                break;
                
            default:
                        
                for(int i=0;i<5;i++){

                    for(int k=0;k<5-i;k++)
                        System.out.print(" ");
                
                    for(int j=0;j<=i;j++)
                        System.out.print(" *");
                    
                    System.out.println();
                }
        }
    }
}
