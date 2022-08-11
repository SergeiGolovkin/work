package home_work_4;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer [] data = new Integer[3];
        DataContainer<Integer> container = new DataContainer<>(data);
        int index1 = container.add(2);
        int index2 = container.add(5);
        System.out.println();
        System.out.println(index2);

    }
}
