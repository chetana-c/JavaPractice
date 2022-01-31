package practice;

public class practice {
    public static void main(String[] args) {
        String[] flags = new String[]  { "FLAG_UHC_FI", "FLAG_NOT_CURR_MBR", "FLAG_QIS_PREV_CTRL", "FLAG_MEDICA", "FLAG_DNS_GLOBAL", "FLAG_DNS_PRG", "FLAG_PREV_PRG_REF", "FLAG_PREV_OUTBOUND_MSG", "FLAG_EXISTING_CSE", "FLAG_PRG_PURCHASE", "FLAG_CO_MANAGE", "FLAG_CO_MANAGE_IN_OUTB", "FLAG_QIS_NEW_CTRL", "FLAG_DUP_MSG_IN_PRG", "FLAG_DUP_MSG_ACROSS_PRG", "FLAG_PARASITE_MSG_NO_HOST", "FLAG_NO_ADDR", "FLAG_EXCEED_MAX_MSG", "FLAG_DEACTIVATED" };
        StringBuffer sBuffer = new StringBuffer("");
        String str = "REFRL 1NN-NNNNNNYN--N-NNNN";
      String second = str.substring(7, str.length());
        System.out.println(second); // NN-NNNNNNYN--N-NNNN
        String[] darray = second.split("");

     // System.out.println("****"+second+"*****");
        for (int i = 0; i < darray.length; ++i) {
            sBuffer.append(String.valueOf(flags[i]) + "\u0003" + darray[i] + "\u0002");
        }
        System.out.println(sBuffer);
    // System.out.println("**CONS_MSG_FACT_TYP_CD\u0003"+"REFRL"+ "\u0002**");
    }

}

//                                               9000001.0000000                                                 .                                                        .