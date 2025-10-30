public class Phone {
    public String phoneNumber;

    public Phone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void call(){
        System.out.println("Memanggil ke " + phoneNumber);
    }

    public void receiveCall(){
        System.out.println(phoneNumber + " menerima telpon.");
    }
}
