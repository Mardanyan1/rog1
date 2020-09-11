package ru.mirea.lab1;
import java.lang.*;

public class ball
{
    private String color;
    private int radius;
    public static void main(String[] args)
    {

    }
    public ball(String n, int p)
    {
        color =n;
        radius =p;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setRadius(int radius)
    {
        this.radius=radius;
    }
    public String getColor()
    {
        return color;
    }
    public int getRadius()
    {
        return radius;
    }
    public String toString()
    {
        return "ball{" + "color='" + this.color + '\'' + ", radius=" + this.radius + '}';
    }
}