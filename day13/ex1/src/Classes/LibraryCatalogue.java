package Classes;
import Interfaces.Catalogue;

/**
 * Created by digibrose on 12/01/2015.
 */
public class LibraryCatalogue implements Interfaces.Catalogue {

    LibraryBook First = null;


    @Override
    public String get(LibraryBook book) {
        if (First == null) return "NotPresent";
        else
    {
        LibraryBook stepper = First;
        while (stepper.GetName() != book.GetName()) {
            if (stepper.GetNextBook() == null) return "NotPresent";
            else {
                stepper = stepper.GetNextBook();
            }
        }
        return stepper.GetName();
    }
    }

    @Override
    public String get(int index) {
        LibraryBook stepper = First;
        while (stepper.GetIndex() != index) {
            if (stepper.GetNextBook() == null) return "NotPresent";
            else {
                stepper = stepper.GetNextBook();
            }
        }
        return stepper.GetName();
    }

    @Override
    public void add(LibraryBook book) {
        if (First == null) {
            First = book;
        } else {
            LibraryBook next = First;
            while (next.GetNextBook() != null) {
                next = next.GetNextBook();
            }
            next.SetNextBook(book);
        }
    }

    @Override
    public void remove(LibraryBook book) {
        if (First != null) {
            LibraryBook next = First;
            if (next.equals(book)) {
                First = First.GetNextBook();
            } else {
                while (!next.GetNextBook().equals(book)) {
                    next = next.GetNextBook();
                }
                next.SetNextBook(next.GetNextBook().GetNextBook());
            }

        }

    }

    public void remove(int index) {
        if (get(index).equals("NotPresent")){
            return;
        }
        else if (First != null) {
            LibraryBook next = First;
            if (next.GetIndex() == (index)) {
                First = First.GetNextBook();
            } else {
                while (!(next.GetNextBook().GetIndex() == index)) {
                    next = next.GetNextBook();
                }
                next.SetNextBook(next.GetNextBook().GetNextBook());
            }
        }
    }

}
