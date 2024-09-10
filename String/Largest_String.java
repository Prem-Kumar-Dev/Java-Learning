public class Largest_String {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};

        String largestString = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].compareTo(largestString)>0) {
                largestString = fruits[i];
            }
        }
        System.out.println(largestString);

    }
}