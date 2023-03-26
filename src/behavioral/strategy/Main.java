package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        int[] dataset = new int[]{1, 5 ,4 ,3 ,2 ,8};

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(dataset);

        sorter.setSorter(new QuickSortStrategy());
        sorter.sort(dataset);
    }
}
