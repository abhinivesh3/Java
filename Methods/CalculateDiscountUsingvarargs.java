package Methods;

public class CalculateDiscountUsingvarargs {
    static double sum(double ...P){
        double sum=0;
        
        for(int i=0;i<P.length;i++){
            sum+=P[i];
        }
        if(sum<500) {
            return sum*0.10;
        }
        else if(sum>=500 && sum<1000){
            return sum*0.15;
        }
        else{
             return sum*0.20;
        }
        
    }
    public static void main(String[] args) {
        double B[]={24.0,48.0,63.0,09.0,47.9};
        System.out.println(sum(B));
    }
}
