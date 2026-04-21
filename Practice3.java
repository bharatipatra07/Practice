public class Practice3{
    public static void main(String[] args){
        int[] vals={29,89,10,90,100};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int val:vals){
             if(val>max){
                secondMax=max;
                max=val;
                }else if(val>secondMax && val!=max){
                    secondMax=val;
                }
        }
        System.out.println(secondMax);
    }
}