public class TestaSmartTv {
    public static void main(String[] args) {
        SmartTv st1 = new SmartTv();
        st1.setVolume(120);
        st1.setVolume(40);
        System.out.println("Volume de ST1: " + st1.getVolume());

        SmartTv  st2 = new SmartTv("Samsung", "WideScreen 65''", 0);
    }
}