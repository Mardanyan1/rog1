package ru.mirea.lab1;
import java.lang.*;

public class book
{
    private String bookname;
    private int pages;

    public book(String n, int p)
    {
        bookname =n;
        pages =p;
    }
    public void setBookname(String bookname)
    {
        this.bookname = bookname;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public String getBookname()
    {
        return bookname;
    }
    public int getPages()
    {
        return pages;
    }
    public String toString()
    {
        return "book{" + "book name='" + this.bookname + '\'' + ", pages=" + this.pages + '}';
    }
}