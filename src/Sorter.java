import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Sorter {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.printList(sorter.readList());
    }

    public List<Integer> readList() {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        return list;
    }

    public void printList(List<Integer> list) {
        TreeSet<Integer> integers = new TreeSet<>(list);
        for (Integer i : integers)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("count: " + list.size());
        System.out.println("distinct: " + integers.size());
        System.out.println("min: " + integers.first());
        System.out.println("max: " + integers.last());
    }

}