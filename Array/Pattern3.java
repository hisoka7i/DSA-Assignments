public class Pattern3 {
    public static void main(String[] ags) {
        int count =0;
        for(int i=5;i>0;i--){
            for(int j=0;j<count;j++){
                System.out.print(" ");}
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            count++;
            System.out.println();
            
        }
    }
}
