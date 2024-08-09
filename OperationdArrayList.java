import java.util.ArrayList;;
public class OperationdArrayList {
    public static void main(String args[]) {
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list.add(2);//O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        list.add(1, 9); //O(n)

        System.out.println(list);

        System.out.println("==================================");

        //get operation
        int element = list.get(2);
        System.out.println(element);
        System.out.println("==================================");
        //Delete
        list.remove(2);
        System.out.println(list);

        System.out.println("==================================");

        //set
        list.set(2, 10);
        System.out.println(list);

        System.out.println("==================================");

        //contains
        System.out.println(list.contains(9));
        System.out.println(list.contains(11));

        System.out.println("==================================");

        //size of ArrayList
        System.out.println(list.size());

        System.out.println("==================================");

        //print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        System.out.println("==================================");

        //reverse print
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        System.out.println("==================================");

        //find maximum
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            if(max<list.get(i)) {
                max=list.get(i);
            }
        }
        System.out.println("max element = " +max);

        System.out.println("==================================");

        //swap 2 numbers
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
