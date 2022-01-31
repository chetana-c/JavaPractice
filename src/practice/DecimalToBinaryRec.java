package practice;

public class DecimalToBinaryRec {
    public static void main(String[] args) {
        //1. sep emthod

        int decimal = 233;
        String res = "";
        String fin_res  = binary(decimal,res);
        System.out.println(fin_res);

    }
    public static String binary(int decimal,String result){
        //2. base case/ending case --> when the remainder = 0 ; return remainder
        if(decimal == 0)
            return result;
        //3. when to call the method rec'ly
        result = decimal%2 + result; // 233%2 + "" = 1 +""
        return binary(decimal/2,result); // binary(233/2,1+"") ==> 116%2,1 => 01

    }
}
