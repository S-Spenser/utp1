class Adder{
    public int add(int x, int y){
        return x + y;
    }
}

class Subtractor{
    public int subtract(int x, int y){
        return x - y:
    }
}

public class Main {
    public static void main(String[] args){
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.subtract(6,3));
    }
}
