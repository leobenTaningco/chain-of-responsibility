interface WasteHandler {
    void setNextHandler(WasteHandler nextHandler);
    void collect(WasteContainer container);
}