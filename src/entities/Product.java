package entities;

public class Product {
    public String nameProduct;
    public String description;
    public Double value;
    public Double percentage;
    public int quantity;

    public Product() { } //default

    //construtor sobrecarregado
    public Product(String nameProduct, String description, Double value, Double percentage, int quantity) {
        this.nameProduct = nameProduct;
        this.description = description;
        this.value = value;
        this.percentage = percentage;
        this.quantity = quantity;
    }

    //metodos de acesso - getters - setter
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String name) {
        this.nameProduct = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //métodos da classe
    @Override
    public String toString(){
        return "Nome: "+getNameProduct()+" Descrição: "+getDescription()+" Valor de comprar: "+getValue()+" Porcentagem de lucro: "+getPercentage()+" Quantidade em estoque: "+getQuantity()+"\n";
    }
}
