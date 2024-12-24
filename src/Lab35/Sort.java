package Lab35;

public class Sort {

    public static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public static void main(String[] args) {
        Chocolate[] chocolates = {
            new Chocolate("Twix", 55.5),
            new Chocolate("Snickers", 50.0),
            new Chocolate("KitKat", 45.3)
        };

        
        System.out.println("Before bs:");
        for (Chocolate chocolate : chocolates) {
            System.out.println(chocolate);
        }

        bubbleSort(chocolates);
        System.out.println("After bs:");
        for (Chocolate chocolate : chocolates) {
            System.out.println(chocolate);
        }

        Chocolate[] chocolatesForSelectionSort = {
                new Chocolate("Twix", 46.3),
                new Chocolate("Snickers", 50.0),
                new Chocolate("KitKat", 45.3)
            };

            System.out.println("Before selectionSort:");
            for (Chocolate chocolate : chocolatesForSelectionSort) {
                System.out.println(chocolate);
            }

            selectionSort(chocolatesForSelectionSort);
            System.out.println("After selectionSort:");
            for (Chocolate chocolate : chocolatesForSelectionSort) {
                System.out.println(chocolate);
            }
    }
}
