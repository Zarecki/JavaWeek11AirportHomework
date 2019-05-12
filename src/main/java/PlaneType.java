public enum PlaneType {

    AIRBUS380(525),
    BOEING747(416),
    BOEING777(162),
    AIRBUSA340(350);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
