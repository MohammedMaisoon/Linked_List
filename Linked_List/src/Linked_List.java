import java.util.LinkedList;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial LinkedList: " + fruits);
        fruits.addFirst("Mango");
        fruits.addLast("Grape");
        System.out.println("After adding elements: " + fruits);
        String firstFruit = fruits.removeFirst();
        System.out.println("Removed first fruit: " + firstFruit);
        String lastFruit = fruits.removeLast();
        System.out.println("Removed last fruit: " + lastFruit);
        System.out.println("After removing elements: " + fruits);
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);
        System.out.println("Size of the LinkedList: " + fruits.size());
        System.out.println("Iterating through the LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}