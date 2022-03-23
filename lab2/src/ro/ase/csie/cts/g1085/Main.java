package ro.ase.csie.cts.g1085;

import java.util.ArrayList;

// de refacut user
// din user:
// order - lista produse, id
// cart // plasare comanda => golire cos
// de scos cantitate produs -> mutat in oshop: map(id,qty) + plasare comanda => modifcare stoc


// variabile membre calculate nu trebuie declarate
public class Main {

    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,ProductCategory.valueOf("laptop"), 1123, 1);
        Product p2 = new Product("Frigider", 207.95, 1,ProductCategory.valueOf("electrocasnice"), 1245, 2);
        Product p3 = new Product(p1);

        p3.setquantity(5);
        p3.setProductName("Paine");

        o.modifyProductsList(1,p1);
        o.modifyProductsList(1,p2);

        o.modifyProductsList(2, p1);
        System.out.println(p1.equals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String i;
    private ArrayList<Product> Products;

    OShop(String name, String img, ArrayList<Product> Products)
    {
        this.Products = new ArrayList<Product>();
        this.i = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, Product p)
    {
        if(what == 1)
        {
            this.Products.add(p);
        }
        else
            this.Products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getI() {
        return i;
    }

    public void setImg(String img) {
        this.i = img;
    }
}

enum ProductCategory{
    laptop,
    electrocasnice,
    alimente
}

class Product
{
    private int id;
    private String ProductName;
    private double ProductPrice;
    private int ProductType;
    private ProductCategory productCategory;
    private int quantity;
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String n, double p, int pt, ProductCategory pc, int id, int quantity)
    {
        try{
            if(n.length() < 5){
                throw new Exception();
            }else{
                this.ProductName = n;
            }
            if(id < 0){
                throw new Exception();
            }else{
                this.id = id;
            }
            if(quantity > 0){
                throw new Exception();
            }else{
                this.quantity = quantity;
            }
        }catch(Exception e){
            System.out.println("Something went wrong.");
        }

        this.ProductPrice = p;
        this.ProductType = pt;
        this.productCategory = pc;
    }

    public Product(Product p)
    {
        new Product(p.ProductName,p.ProductPrice, p.ProductType, p.productCategory, p.id, p.quantity);
        System.out.println("aaa");
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getProductType() {
        return ProductType;
    }

    public void setProductType(int ProductType) {
        this.ProductType = ProductType;
    }

    public boolean equals(Product p)
    {
        if(p.id != this.id)
            return false;
        if(!p.ProductName.equals(this.ProductName))
            return false;
        if(p.ProductPrice != this.ProductPrice)
            return false;
        if(p.ProductType != p.ProductType)
            return false;
        if(p.productCategory != this.productCategory)
            return false;

        return true;
    }

    // 2 metode: reducere + scumpire
    public void modify(boolean flag, double val)
    {
        if(flag)
            this.ProductPrice+=this.ProductPrice*val;
        if(!flag)
            this.ProductPrice-=this.ProductPrice*val/100;
    }

    public void applyDiscount(double val){
        this.ProductPrice-=this.ProductPrice*val/100;
    }

    public void raisePrice(double val){
        this.ProductPrice+=this.ProductPrice*val/100;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String usn;
    private String userId;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String usn, String userId)
    {
        this.usn = usn;
        this.userId = userId;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<Product> l;
    private String addr;

    public Order()
    {
        l = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(l.size() > 99)
            return;

        l.add(p);
    }

    public void remove(Product p)
    {
        l.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

class InventoryP
{
    private Product p;
    private int q;

    public InventoryP(Product p, int q)
    {
        this.p = new Product(p);
        this.q = q;
    }
    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}




