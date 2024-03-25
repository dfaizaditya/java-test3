public class Longsub {

    public static String longSub(String a, String b) {
        int lena = a.length();
        int lenb = b.length();

        int [][] arr = new int[lena +1][lenb+1];

        for (int i = 0; i < lena; i++) {
            for (int j = 0; j < lenb; j++) {
                if(a.charAt(i) == b.charAt(j)) {

                }
            }
        }
    }

    public static void main(String[] args){

    }
    
}
