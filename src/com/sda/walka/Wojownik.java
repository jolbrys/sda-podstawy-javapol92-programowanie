package com.sda.walka;

public class Wojownik {
    public Wojownik(String imie, int sila, int hp) {
        this.imie = imie;
        this.sila = sila;
        this.hp = hp;
    }

    public Wojownik(String imie) {
        this.imie = imie;
        this.sila = 1;
        this.hp = 100;
    }

    private String imie;
    private int sila;
    private int hp;

    public String toString(){
        return "Wojownik " + this.imie + " o sile " + this.sila + " i " + this.hp + "hp";
    }

    public void fight(Wojownik enemy){
        while(enemy.isAlive() && this.isAlive()) {
            enemy.hurt(this.sila);
            this.hurt(enemy.sila);
        }
    }

    public void hurt(int dmg){
        this.hp -= dmg;
        System.out.println(this.getImie() + " otrzymuje " + dmg + "obrazen");
    }

    public boolean isAlive(){
        if(this.hp > 0){

            return true;
        }else{
            System.out.println(this.getImie() + "zginal");
            return false;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
