import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String>  ll = new LinkedList<>();
        CustomLinkedList<String> cll = new CustomLinkedList<>();
        cll.addFirst("TestF");
        cll.addLast("TestL");
        cll.add("Testadd");
        cll.set(1,"testset");
        System.out.println(cll.getFirst());
        System.out.println(cll.get(1));
        System.out.println(cll.get(2));
        System.out.println(cll.getLast());
        System.out.println(cll.get(3));
        System.out.println(cll.size());
    }
}