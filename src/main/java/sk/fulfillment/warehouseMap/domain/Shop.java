package sk.fulfillment.warehouseMap.domain;

public class Shop {
    private final int id;
    private final String abbreviation;
    private final String name;
    private final String shelving;
    private final String zone;

    public Shop(int id, String abbreviation, String name, String shelving, String zone) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.name = name;
        this.shelving = shelving;
        this.zone = zone;
    }

    public int getId() {
        return id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public String getShelving() {
        return shelving;
    }

    public String getZone() {
        return zone;
    }
}
