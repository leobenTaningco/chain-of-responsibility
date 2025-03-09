class WasteCollectionChain implements WasteHandler {
    private WasteHandler nextHandler;

    public WasteCollectionChain() {
        this.nextHandler = new OrganicWasteCollector();
        WasteHandler recyclableHandler = new RecyclableWasteCollector();
        WasteHandler hazardousHandler = new HazardousWasteCollector();

        nextHandler.setNextHandler(recyclableHandler);
        recyclableHandler.setNextHandler(hazardousHandler);
    }

    public void collect(WasteContainer container) {
        if (container.isFull()) { 
            nextHandler.collect(container);
        } else {
            System.out.println("Waste container (" + container.getType() + ") is not full. Skipping collection.");
        }
    }

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}