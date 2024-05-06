public class IntArrayList implements IntList {
    private int[] elements;
    private int size;

    public IntArrayList() {
        elements = new int[10]; // Default length is 10
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == elements.length) {
            // Increase array size by 50%
            int newSize = elements.length + elements.length / 2;
            elements = resizeArray(newSize);
        }
        elements[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + id);
        }
        return elements[id];
    }

    private int[] resizeArray(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        return newArray;
    }
}
