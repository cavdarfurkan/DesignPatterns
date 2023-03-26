package behavioral.strategy;

public class Sorter {

    private SortStrategy sorter;

    public Sorter(SortStrategy sorter) {
        this.sorter = sorter;
    }

    public int[] sort(int[] dataset) {
        return this.sorter.sort(dataset);
    }

    public SortStrategy getSorter() {
        return sorter;
    }

    public void setSorter(SortStrategy sorter) {
        this.sorter = sorter;
    }
}
