package base;


public class Main {

    public static void main(String[] args) {
        Array array = new Array(5);

        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);

        System.out.println("Index is: " + array.indexOf(1));

        array.print();


    }
}
