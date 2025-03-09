public class WasteManagementSystemApp {
    public static void main(String[] args) {
        WasteCollectionChain wasteCollector = new WasteCollectionChain();
        WasteContainer organicWaste = new WasteContainer("organic", 50,20);
        WasteContainer recyclableWaste = new WasteContainer("recyclable", 30,30);
        WasteContainer hazardousWaste = new WasteContainer("hazardous", 20,40);

        wasteCollector.collect(organicWaste);
        wasteCollector.collect(recyclableWaste);
        wasteCollector.collect(hazardousWaste);

    }
}