package com.epam.triangle.figure;


public class Triangle {
    private Dot dotA;
    private Dot dotB;
    private Dot dotC;
    private double sideA;
    private double sideB;
    private double sideC;


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Triangle(){

    }

    public Dot getDotA() {
        return dotA;
    }

    public void setDotA(Dot dotA) {
        this.dotA = dotA;
    }

    public Dot getDotB() {
        return dotB;
    }

    public void setDotB(Dot dotB) {
        this.dotB = dotB;
    }

    public Dot getDotC() {
        return dotC;
    }

    public void setDotC(Dot dotC) {
        this.dotC = dotC;
    }

    @Override
    public int hashCode() {
        return (int)getDotA().getX()>>>2+(int)getDotA().getY()>>>4+
                (int)getDotB().getX()*3+(int)getDotB().getY()/2+
                (int)getDotC().getX()+(int)getDotC().getY();
    }

    @Override
    public boolean equals(Object obj) {
       if (obj==this)
           return true;
       if (obj==null||obj.getClass()!=this.getClass())
           return false;
       Triangle tr=(Triangle)obj;
       return  (tr.getDotA().equals(this.getDotA()) && tr.getDotB().equals(this.getDotB())
               && tr.getDotC().equals(this.getDotC()));

    }

    @Override
    public String toString() {
        return "Dot A is in "+getDotA().getX()+", "+getDotA().getY()+"\n" +
                "Dot B is in "+getDotB().getX()+", "+getDotB().getY()+"\n" +
                "Dot C is in "+getDotC().getX()+", "+getDotC().getY()+"\n" +
                "The length of AB is "+getSideA()+"\n" +
                "The length of BC is "+getSideB()+"\n" +
                "The length of AC is "+getSideC()+"\n";
    }
}
