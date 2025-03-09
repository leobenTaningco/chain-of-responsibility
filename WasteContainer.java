class WasteContainer {
    private String type;
    private int capacity;
    private int currentFill; 

    public WasteContainer(String type, int capacity, int currentFill) {
        this.type = type;
        this.capacity = capacity;
        this.currentFill = currentFill;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return currentFill >= capacity;
    }
}