package Queue_Interface;

public class pb5 {
    private int[] buffer;
    private int tail = 0;
    private int head = 0;
    private int size = 0;
    private int capacity;

    public pb5(int capacity){
        this.capacity = capacity;
        buffer = new int[capacity];
    }
    public void add(int n){
        buffer[tail] = n;
        tail = (tail+1) % capacity;

        if(size < capacity){
            size++;
        }
        else {
            head = (head + 1) % capacity;
        }
    }
    public void printbuffer(){
        System.out.print('[');

        for(int i = 0; i<size; i++){
            int index = (head+i) % capacity;
            System.out.print(buffer[index]);
            if(i != size-1) System.out.print(", ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        pb5 obj1 = new pb5(3);

        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.printbuffer();
        obj1.add(4);
        obj1.add(5);
        obj1.printbuffer();
    }
}
