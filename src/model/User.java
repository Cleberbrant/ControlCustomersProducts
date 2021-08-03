package model;

public class User {
    private String name;
    private String adress;
    private String telephone;

    public User() { } //default

    //construtor sobrecarregado
    public User(String name, String adress, String telephone) {
        this.name = name;
        this.adress = adress;
        this.telephone = telephone;
    }

    //metodos de acesso - getters - setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    //métodos da classe
    @Override
    public String toString(){
        return "Nome: "+ name +"/"+" Endereço: " + adress +"/"+" Telefone: "+telephone+ "\n";
    }
}