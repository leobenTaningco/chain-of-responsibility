class OrganicWasteCollector implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equals("organic")) {
            System.out.println("Collecting organic waste with capacity: " + container.getCapacity());
        } else {
            nextHandler.collect(container);
        }
    }
}