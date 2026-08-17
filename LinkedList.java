public class LinkedList {
    public static void main(String args[]){
        java.util.LinkedList<String> list = new java.util.LinkedList<>();
        // add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        for (String fruit : list) {
            System.out.print(fruit +"->" );
        }
        System.out.println("null");
        //get element at index 1
        list.get(1); // returns "Banana"
        //add element at index 1 in between
        list.add(1, "Date");
        System.err.println(list);
        //set element
        list.set(2, "Elderberry");
        System.out.println(list);
        //delete element
        list.remove(0);
        System.out.println(list);
        //size of the list
        int size =list.size();
        System.out.println("Size of the list: " + size);
        //loop through the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
