package pkg1a;
public class RetailItem {
    String description;
    int units;
    double price;

    public RetailItem(String description , int units , double price){
        this.description = description;
        this.units = units;
        this.price = price;
    }

    public RetailItem() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setUnits(int units) {
        this.units = units;
    }

    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    public int getUnits() {
        return units;
    }
}

class Driver {
    public static void main(String[] args) {
        RetailItem a = new RetailItem("description1", 1, 23.5);
        RetailItem b = new RetailItem("description2", 2, 32.5);
        RetailItem c =  new RetailItem();

        c.setDescription("description3");
        c.setPrice(123.4);
        c.setUnits(3);

        System.out.println("FOR RETAIL ITEM A");
        System.out.println("DESC: " + a.getDescription() + " PRICE: " + a.getPrice() + " UNITS: " + a.getUnits());
        System.out.println("FOR RETAIL ITEM B");
        System.out.println("DESC: " + b.getDescription() + " PRICE: " + b.getPrice() + " UNITS: " + b.getUnits());
        System.out.println("FOR RETAIL ITEM ");
        System.out.println("DESC: " + c.getDescription() + " PRICE: " + c.getPrice() + " UNITS: " + c.getUnits());

    }
}
