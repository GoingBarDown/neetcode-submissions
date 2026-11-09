class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;
   
   public DynamicArray(int capacity) {
    this.capacity = capacity;
    this.length = 0;
    this.arr = new int[this.capacity];
   }

   public int get(int i) {
    return arr[i];
   }

   public void set(int i, int j) {
    arr[i] = j;
   }

   public void pushback(int i) {
    if (length == capacity) {
        resize();
    }
    arr[length] = i;
    length++;
   }

   public int popback() {
    if (length > 0) {
        length--;
    }
    return arr[length];
   }

   public void resize() {
    capacity *= 2;
    int[] newArr = new int[capacity];
    for (int i = 0; i < length; i++) {
        newArr[i] = arr[i];
    }
    arr = newArr;
   }

   public int getSize() {
    return length;
   }

   public int getCapacity() {
    return capacity;
   }
}
