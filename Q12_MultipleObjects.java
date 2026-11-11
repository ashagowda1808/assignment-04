public class Q12_MultipleObjects {
    int x = 25;
    public static void main(String[] args) {
        Q12_MultipleObjects myObj1 = new Q12_MultipleObjects();
        Q12_MultipleObjects myObj2 = new Q12_MultipleObjects();
        myObj2.x = 50;
        System.out.println("Object 1: " + myObj1.x);
        System.out.println("Object 2: " + myObj2.x);
    }
}
