package pkg5a;

public class Driver {
    private int capacity = 2;    //initial queue size
    int[] queueArr;
    int front = 0;
    int rear = -1;
    int currentSize = 0;                //holds how many places are currently filled
    public Driver(){
        queueArr = new int[this.capacity];          //initializing array with capacity
    }
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full, increasing capacity...");
            increaseCapacity();
        }
        rear++;
        if(rear >= queueArr.length && currentSize != queueArr.length){
            rear = 0;
        }
        queueArr[rear] = item;
        currentSize++;
        System.out.println("Adding: " + item);
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            front++;
            if(front > queueArr.length-1){
                System.out.println("removed: "+queueArr[front-1]);
                front = 0;
            } else {
                System.out.println("removed: "+queueArr[front-1]);
            }
            currentSize--;
        }
    }
    public boolean isQueueFull(){
        return currentSize == queueArr.length;
    }
    public boolean isQueueEmpty(){
        return currentSize == 0;
    }
    private void increaseCapacity(){
        int newCapacity = this.queueArr.length*2;    //new capacity will be twice the current one
        int[] newArr = new int[newCapacity];
        int tmpFront = front;
        int index = -1;
        while(true){
            newArr[++index] = this.queueArr[tmpFront];
            tmpFront++;
            if(tmpFront == this.queueArr.length){
                tmpFront = 0;
            }
            if(currentSize == index+1){
                break;
            }
        }
        this.queueArr = newArr;
        System.out.println("New array capacity: "+this.queueArr.length);
//reset front & rear values
        this.front = 0;
        this.rear = index;
    }
    public static void main(String a[]){
        Driver queue = new Driver();
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.enqueue(24);
        queue.enqueue(98);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(435);
        queue.dequeue();
        queue.dequeue();
    }
}
