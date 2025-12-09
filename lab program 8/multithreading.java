class BMS extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("BMS College Of Engineering");
            try {
                Thread.sleep(10000);
            } 
            catch (Exception e) {
            }
        }
    }
}
class CS extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("CSE");
            try {
                Thread.sleep(2000);
            } 
            catch (Exception e) {
            }
        }
    }
}
public class multithreading {
    public static void main(String args[]){
        BMS c1 = new BMS();
        c1.start();

        CS i1 = new CS();
        i1.start();
    }
}