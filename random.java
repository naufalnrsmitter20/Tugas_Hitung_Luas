public class random {
    public static void main(String[] args) {
        int iniInt = 100;
        Integer iniInteger = iniInt;
        byte inibyte = iniInteger.byteValue();
        double inidouble = iniInteger.doubleValue();
        long inilong = iniInteger.longValue();
        System.out.println( inibyte + inidouble + inilong);
    }
}
