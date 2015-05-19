package Classes;

/**
 * Created by digibrose on 12/01/2015.
 */
public class LibraryBook {

    private String Name = null;
    private int Index;
    private LibraryBook NextBook = null;

    public LibraryBook(String Name, int Index){

        SetName(Name);
        SetIndex(Index);

    }

    public String GetName(){

        return Name;
    }

    public int GetIndex(){

        return Index;
    }

    public void SetName(String Name){

        this.Name = Name;

    }

    public void SetIndex(int Index){

        this.Index = Index;
    }

    public LibraryBook GetNextBook(){

        return NextBook;
    }

    public void SetNextBook(LibraryBook NextBook){

        this.NextBook = NextBook;
    }



}
