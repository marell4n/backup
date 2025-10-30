public class SmartPhone extends Phone implements Camera, CardReader{
    public Lens lens;

    public SmartPhone(String phoneNumber, Lens lens) {
        super(phoneNumber);
        this.lens = lens;
    }

    @Override
    public void call(){
        super.call();
    }

    @Override
    public void receiveCall(){
        super.receiveCall();
    }

    @Override
    public void captureImage(){
        System.out.println("Mengambil gambar dengan lensa " + lens.getType());
    }

    @Override
    public void readCard(){
        System.out.println("Membaca kartu");
    }

}