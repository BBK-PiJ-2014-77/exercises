/**
 * Created by digibrose on 24/11/2014.
 */
public class ListIntSet implements IntSet {

    private int value;
    private ListIntSet Next = null;

    public ListIntSet(int val) {
        this.value = val;

    }

    public void add(int value) {
        if (this.contains(value)) {
            System.out.println(value + " is already present");
        }
        else if (this.Next == null) {
        this.Next = new ListIntSet(value);
        this.Next.value = value;
        }
        else {
            this.Next.add(value);
        }

    }

    public boolean contains(int value) {
        if (this.Next == null) {
            if (this.value == value){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (this.value == value){
                return true;
            }
            else {
                return this.Next.contains(value);
            }
        }
    }

    public boolean containVerbose(int value) {
        if (this.Next == null) {
            System.out.println(this.value);
            if (this.value == value){
                return true;
            }
            else {
            return false;
            }
        }
        else {
            if (this.value == value){
                System.out.println(this.value);
                return true;
            }
            else {
                System.out.println(this.value);
                return this.Next.containVerbose(value);
            }
        }
    }

//    public String toString(){
//
//    }

}
