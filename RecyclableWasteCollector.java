class RecyclableWasteCollector implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equals("recyclable")) {
            System.out.println("Collecting recyclable waste with capacity: " + container.getCapacity());
        } else {
            nextHandler.collect(container);
        }
    }
}
