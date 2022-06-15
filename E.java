public class E {
    public static void main(String args[]){
        String s = new String("ABCABC");
        boolean m = s.equals("");
        s=s.replaceAll("[ABC]+", "* *");
        s=s.substring(1);
        int n= s.length();
        System.out.println(s);
    }
}
