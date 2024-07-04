package SachinSir.heaps;

public class ElementBean implements Comparable<ElementBean> {
    public Integer row;
    public Integer col;
    public Integer value;

    public ElementBean(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    @Override
    public int compareTo(ElementBean i) {
        return this.value.compareTo(i.value);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
