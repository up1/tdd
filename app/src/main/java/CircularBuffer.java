public class CircularBuffer {
    public static final int DEFAULT_SIZE = 5;
    private int count;
    private String[] elements;
    private int start;

    public CircularBuffer() {
        this(DEFAULT_SIZE);
    }

    public CircularBuffer(int size) {
        elements =new String[size];
    }

    public void add(String element) {
        this.elements[count++] = element;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public String remove() {
        count--;
        return this.elements[start++];
    }

    public boolean isFull() {
        return false;
    }

    public int size() {
        return this.elements.length;
    }
}
