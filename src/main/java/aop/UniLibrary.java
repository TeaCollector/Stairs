package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We are taking the book from UniLiibrary: ");
        System.out.println("------------------------------------------------------------");
    }
    public void addBook(String personName, Book book) {
        System.out.println("We are adding new/old book in UniLiibrary: ");
        System.out.println("------------------------------------------------------------");
    }

    public String returnBook() {
        int number = 10 / 0;
        System.out.println("We are return the Book!");
        return "War And Peace";
    }

    public void getMagazine() {
        System.out.println("Please take your magazine!");
        System.out.println("------------------------------------------------------------");
    }
    public void addMagazine() {
        System.out.println("We are adding new/old magazine in UniLibrary!");
        System.out.println("------------------------------------------------------------");
    }
    public void returnMagazine() {
        System.out.println("We are retrun the magazine!");
        System.out.println("------------------------------------------------------------");
    }
}
