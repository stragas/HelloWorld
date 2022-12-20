package ru.homework;

public class Main {
    public static void main(String[] args) {

        Book myBook1 = new Book("Александр Дюма" , "Три мушкетёра" , 1948);
        Book myBook2 = new Book("Александр Пушкин", "Руслан и Людмила", 1978);
        Author  myAuthor1 = new Author("Александр", "Дюма");
        Author  myAuthor2 = new Author("Александр", "Пушкин");
      //  System.out.println(myAuthor1.getFirstName());


        myBook1.setPublishingYear(1967);
        System.out.println(myBook1.getPublishingYear());


    }
}
