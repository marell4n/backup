public class Test {
    public static void main(String[] args) {
        Lens wideLens = new Lens("Wide");
        SmartPhone HP = new SmartPhone("081234567890", wideLens);

        System.out.println("Nomor HP: " + HP.phoneNumber);

        HP.call();
        HP.receiveCall();

        HP.captureImage();
        HP.readCard();
    }
}