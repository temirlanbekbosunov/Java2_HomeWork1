package com.company;

public class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    private int generateDefaultAge(){
        return ((int) (Math.random()*10+5));
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public String getInfo(){
        return "Питомец{" +
                "возраст=" + age +
                ", приют=" + shelter.getName() + " " + shelter.getAddress() +
                ", цвет=" + color +
                '}';
    }
}
