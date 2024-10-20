class method{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1, double n2){
        return n1 + n2;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        method calc = new method();

        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5,10,15));
        System.out.println(calc.add(5.5, 10.7));
    }
}
