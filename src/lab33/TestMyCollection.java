package lab33;

public class TestMyCollection {
    public static void main(String[] args) {
        //test for list
    	MyCollection<String> myList = new MyList<>();
        
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        System.out.println("Size: " + myList.size()); // 3

        System.out.println("Contains Banana? " + myList.contains("Banana")); // true
        System.out.println("Contains Grape? " + myList.contains("Grape")); // false

        myList.remove("Banana");
        System.out.println("Size without 'Banana': " + myList.size()); // 2



        myList.clear();
        System.out.println("clearing, size: " + myList.size()); // 0

        System.out.println("\n test myset");
        MyCollection<String> mySet = new MySet<>();
        
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");
        mySet.add("Apple"); //no 2cate
        System.out.println("Size after adding elements: " + mySet.size()); // 3 (без дубликата)

        System.out.println("Contains 'Banana': " + mySet.contains("Banana")); // true
        System.out.println("Contains 'Grape': " + mySet.contains("Grape")); // false

        mySet.remove("Banana");
        System.out.println("Size without'Banana': " + mySet.size()); // 2


        mySet.clear();
        System.out.println("clear, size: " + mySet.size()); // 0
    }
}
