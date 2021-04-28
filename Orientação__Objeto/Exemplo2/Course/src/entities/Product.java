package entities;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public Product(){}

    public Product(String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }
    
    public double totalValueStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f",totalValueStock());
    }
}
