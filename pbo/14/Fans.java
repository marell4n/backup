public class Fans {
    private String name;
    public Fans(){
        this("noname");
        
    }
    
    public Fans(String name){
        this.name = name;
        
    }
    
    public void showName(){
        System.out.print(name);
        
    }
    
    public void watchingPerformance(){
        this.showName();
        System.out.println(": melihat idolanya dari youtube");
    }
    
    public void watchingPerformance(Musician musician){
        this.showName();
        System.out.print(": melihat idolanya");
        if (musician instanceof Singer){
            ((Singer) musician).perform();
        } else if (musician instanceof Kpop){
            ((Kpop) musician).perform();
        } else if (musician instanceof Biduan){
            ((Biduan) musician).perform();
        } else {
            musician.perform();
        }
        System.out.println();
    }
}
