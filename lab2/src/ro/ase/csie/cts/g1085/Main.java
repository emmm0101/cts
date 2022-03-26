package ro.ase.csie.cts.g1085;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// de refacut user
// din user:
// order - lista produse, id
// cart // plasare comanda => golire cos
// de scos cantitate produs -> mutat in oshop: map(id,qty) + plasare comanda => modifcare stoc


// variabile membre calculate nu trebuie declarate
public class Main {

    public static void main(String[] args) {
        // write your code here
        Product p1 = new Product("Laptop", 3200.5, 1,ProductCategory.valueOf("laptop"), 1123, "procesor Intel");
        Product p2 = new Product("Frigider", 207.95, 1,ProductCategory.valueOf("electrocasnice"), 1245, "clasa A");
        Product p3 = new Product(p1);
        p3.setName("Paine");

        Map<Product, Integer> stock = new HashMap<Product, Integer>();
        stock.put(p1,2);
        stock.put(p3,3);

        OnlineShop onlineShop = new OnlineShop("Emag", "logo.jpg", stock);

        User user = new User("gigi", "1");
        Map<Product, Integer> cart = new HashMap<Product, Integer>();
        cart.put(p1,1);
        cart.put(p3,2);
        user.setCart(cart);

        user.placeOrder(onlineShop, "Strada V Argesului");


    }
}

class OnlineShop {
    private String shopName;
    private String image;
    private Map<Product, Integer> stock;

    OnlineShop(String shopName, String image, Map<Product, Integer> stock)
    {
        this.stock = new HashMap<>();
        for (Map.Entry<Product, Integer> mapEntry : stock.entrySet()) {
            this.stock.put(mapEntry.getKey(), mapEntry.getValue());
        }
        this.image = image;
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Map<Product, Integer> getStock() {
        return stock;
    }

    public void setStock(Map<Product, Integer> stock) {
        this.stock = new HashMap<Product, Integer>();
        for (Map.Entry<Product, Integer> mapEntry : stock.entrySet()) {
            this.stock.put(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    // modify stock
    public void modifyStock(Product product, int quantity )
    {
        if(quantity > 0 )
            this.stock.put(product, quantity);
        else
            this.stock.remove(product);
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
    private String name;
    private double price;
    private int type;
    private ProductCategory productCategory;
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, ProductCategory productCategory, int id, String details)
    {
        try{
            if(name.length() < 1){
                throw new Exception();
            }else{
                this.name = name;
            }
            if(id < 0){
                throw new Exception();
            }else{
                this.id = id;
            }

        }catch(Exception e){
            System.out.println("Something went wrong.");
        }
        this.details = details;
        this.price = price;
        this.type = type;
        this.productCategory = productCategory;
    }

    public Product(Product p)
    {
        this(p.getName(),p.getPrice(), p.getType(), p.getProductCategory(), p.getId(),p.getDetails() );
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int ProductType) {
        this.type = type;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public boolean equals(Product p)
    {
        if(p.id != this.id)
            return false;
        if(!p.name.equals(this.name))
            return false;
        if(p.price != this.price)
            return false;
        if(p.type != this.type)
            return false;
        if(p.productCategory != this.productCategory) // enum?
            return false;
        return true;
    }

    public void applyDiscount(double val){
        this.price-=this.price*val/100;
    }

    public void raisePrice(double val){
        this.price+=this.price*val/100;
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
    private String username;
    private String id;
    private ArrayList<Order> ordersHistory;
    private Map<Product, Integer> cart;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Order> getOrdersHistory() {
        return ordersHistory;
    }

    public void setOrdersHistory(ArrayList<Order> ordersHistory) {

        this.ordersHistory = new ArrayList<Order>();
        for(int i=0;i<ordersHistory.size();i++){
            this.ordersHistory.add(ordersHistory.get(i));
        }
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart=new HashMap<Product, Integer>();
        for (Map.Entry<Product, Integer> mapEntry : cart.entrySet()) {
            this.cart.put(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    public User(String username, String userId)
    {
        this.username = username;
        this.id = userId;
        ordersHistory=new ArrayList<Order>();
        cart=new HashMap<Product, Integer>();
    }

    public User(String username, String userId, Map<Product, Integer> cart)
    {
        this.username = username;
        this.id = id;
        cart=new HashMap<Product, Integer>();
        for (Map.Entry<Product, Integer> mapEntry : cart.entrySet()) {
            this.cart.put(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    public User(User user)
    {
        this(user.getUsername(),user.getId(), user.getCart());
    }

    public void addOrder(Order o)
    {
        this.ordersHistory.add(o);
    }

    public void addProductToCart(Product product, int quantity, OnlineShop onlineShop)
    {
        // vf q > 0 si q <= stoc
        int stock = onlineShop.getStock().get(product);
        if( quantity <= stock){
            this.cart.put(product, quantity);
        }else{
            System.out.println("Not so many elements in stock");
        }

    }

    public void removeProductFromCart(Product product, int quantity)
    {
        if(quantity > 0) {
            this.cart.remove(product, quantity);
        }
    }

    public void cleanCart(){
        cart = new HashMap<Product, Integer>();
    }

    // iterare cart
        // verificare stoc
            // update stoc
    public void placeOrder(OnlineShop onlineShop, String address){
        Map<Product, Integer> stockShop = onlineShop.getStock();
        for (Map.Entry<Product, Integer> mapEntry : this.cart.entrySet()) {
            int productStock = stockShop.get(mapEntry.getKey());
            stockShop.put(mapEntry.getKey(), productStock - mapEntry.getValue());
        }
        cleanCart();
        Random random = new Random();
        ordersHistory.add(new Order(random.nextInt(), address ));
    }

}

// add cart map ?
class Order
{
    private int id;
    private String address;

    public Order(int id, String address){
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}





