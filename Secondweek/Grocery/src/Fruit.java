class Fruit {

    private String name;
    private double qty = 0;
    private double price = 0;

    public Fruit(String name,int qty,int price){
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void getstockControl(){
        System.out.println("Stoktaki "+name+" miktarı : "+qty+" KG");
    }

    public String getName() {
        return name;
    }

    public double getQty() {
        return qty;

    }

    public double getPrice() {
        return price;
    }

    public void sell(int buyqty) {
        if (buyqty <= this.qty) {
            System.out.println("Satılan "+this.name+" miktarı :" + this.qty+" KG");
            this.qty -= buyqty;
        } else {
            System.out.println("Satılan "+this.name+" miktarı depoda bulunan miktardan fazladır");
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(double qty) {
        this.qty = qty;

    }
}

