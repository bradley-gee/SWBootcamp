package com.bg.bookshop;

public class Book {
    private String title;
    private double price;
    private Author author;
    private Publisher publisher;
    private double salePercentage;

    public Book(String title, double price, Author author, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public void setSaleDiscount(double salePercentage) {
        this.salePercentage = salePercentage / 100.0;
    }

    public double calculateSalePrice() {
        return price - (price * salePercentage);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getStreet() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return String.format("Book [title=%s, author=%s, publisher=%s, price=%s]", title, author, publisher, price);
    }
}
