public class IntVector implements IntList {
    private int[] elements;
    private int size;

    public IntVector() {
        elements = new int[20]; // Default length is 20
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == elements.length) {
            // Double the array size
            int newSize = elements.length * 2;
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
