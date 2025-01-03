package md.tekwill.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList;

    private String libraryName;
    public Library(String libraryName){
        this.libraryName = libraryName;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
        System.out.println("The book has been added to the library stock: " + book.getTitle());
    }

    public void addBooksFromAnotherList(List<Book> importList){
        bookList.addAll(importList);
    }

    public int getTotalNumberOfBooks(){
        return bookList.size();
    }

    public void removeBookFromTheStock(Book book){
        if(bookList.remove(book)){
        System.out.println("The book " + book.getTitle() + " has been removed");
    }else{
        System.out.println("The book " + book.getTitle() + " has not been found");
    }
  }

  public void displayTheBookTitles(){
        for (int i = 0; i <bookList.size(); i++){
            System.out.println(bookList.get(i).getTitle());
        }
  }
}