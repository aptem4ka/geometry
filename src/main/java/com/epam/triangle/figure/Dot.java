package com.epam.triangle.figure;



public class Dot {
    private double x;
    private double y;

    public Dot(){

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        return 125/(int)getX()+10*(int)getY();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this)
            return true;
        if (obj==null||obj.getClass()!=this.getClass())
            return false;
        Dot dot=(Dot)obj;
        return this.getX()==dot.getX() && this.getY()==dot.getY();
    }

    @Override
    public String toString() {

        return getX()+", "+getY();
    }
}
