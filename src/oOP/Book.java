package oOP;

public class Book {
    private  String name;
    private Autor autor;
    private double price;
    private int qtyInStock;
private  int satis;
    public static int sayac=0;

    public Book(String name, Autor autor, double price) {
        this.name = name;
        this.autor = autor;
        this.price = price;
qtyInStock--;

    }

    public Book(String name, Autor autor, double price, int qtyInStock) {
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }

    public String getName() {
        return name;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;

    }

    @Override
    public String toString() {
        return name +autor.toString();

    }

public void bookSat(int satis){


}


}
