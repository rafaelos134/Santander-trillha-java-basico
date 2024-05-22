public class usuario {
    public static void main(String[] args) throws Exception {
        sistemaTv smartv = new sistemaTv();

        smartv.aumentarVolume();

        System.out.println(smartv.volume);

    }
}
