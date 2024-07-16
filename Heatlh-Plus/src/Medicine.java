


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Medicine {
    private String Name,description;
    private int id,Quantity,buyingPrice,sellingPrice;

    public Medicine() {
        this.Name = "";
        this.Quantity = 0;
        this.id=0;
        this.buyingPrice = 0;
        this.sellingPrice = 0;
        this.description="";
    }

    public Medicine(String Name,String description,int id, int Quantity, int buyingPrice, int sellingPrice) {
        this.Name = Name;
        this.Quantity = Quantity;
        this.id=id;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description=description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

   
    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine{" + "Name=" + Name + ", description=" + description + ", id=" + id + ", Quantity=" + Quantity + ", buyingPrice=" + buyingPrice + ", sellingPrice=" + sellingPrice + '}';
    }

    

   

   
   

    
}
