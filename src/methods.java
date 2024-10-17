class Computer{
    public void playMusic(){
        System.out.println("Hello");
    }
    public boolean getValue(int cost){
        if(cost >= 10) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        
        boolean result = obj.getValue(11);
        System.out.println(result);
    }
}
