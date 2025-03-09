class HazardousWasteCollector implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equals("hazardous")) {
            System.out.println("Collecting hazardous waste with capacity: " + container.getCapacity());
        } else {
            System.out.println("No handler found for waste type: " + container.getType());
        }
    }
}
