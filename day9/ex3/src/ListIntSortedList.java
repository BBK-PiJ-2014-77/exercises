/**
 * Created by digibrose on 28/11/2014.
 */
public class ListIntSortedList implements IntSortedList{

    private int value;
    private ListIntSortedList Next = null;
//    private ListIntSortedList Floater = null;

    public ListIntSortedList(int val) {
        this.value = val;

    }

    @Override
    public void add(int value) {
        if (this.Next == null) {
            this.Next = new ListIntSortedList(value);
            this.Next.value = value;
        }
        else if (this.Next.value >= value) {
            ListIntSortedList Floater;
            Floater = this.Next;
            this.Next = new ListIntSortedList(value);
            this.Next.Next = Floater;
        }
        else {
            this.Next.add(value);
        }

    }

    @Override
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

 //   public String toString(){
 //
 //   }
}
