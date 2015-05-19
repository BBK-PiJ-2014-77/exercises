/**
 * Created by digibrose on 25/11/2014.
 */
public class TreeIntSortedList  implements IntSortedList{

    private int value;
    private TreeIntSortedList left;
    private TreeIntSortedList right;
    private TreeIntSortedList floater1;
    private TreeIntSortedList floater2;

    public TreeIntSortedList(int rootnumber) {
        this.value = rootnumber;
    }

    @Override
    public void add(int value) {

        if (value > this.value) {
            if (right == null) {
                right = new TreeIntSortedList(value);
            }
            else {
                right.add(value);
            }
        }
        else if (value == this.value){
            floater1 = this.left;
            floater2 = this.right;
            this.left = new TreeIntSortedList(value);
            this.right = null;
            this.left.left = floater1;
            this.left.right = floater2;
        }
        else {
            if (left == null) {
                left = new TreeIntSortedList(value);
            }
            else {
                left.add(value);
            }
        }

    }

    @Override
    public boolean contains(int value) {
        if (value == this.value)  {
            return true;
        }
        else if (value > this.value) {
            if (right == null){
                if (left != null  && this.value == this.left.value) {
                    return left.contains(value);
                }
                else {
                    return false;
                }
            }
            else {
                return right.contains(value);
            }
        }
        else if (this.value == this.left.value) {
            return left.contains(value);
        }

        else {
            if (left == null) {
                return false;
            }
            else {
                return left.contains(value);
            }
        }
    }

    public String toString(){
        String Output = "";

        if (this.left != null && this.right != null) {
            Output = Output + value + "," + left.toString() + "," + right.toString();
        }
        if (this.left != null && this.right == null) {
            Output = Output + value + "," + left.toString();
        }
        if (this.right != null  && this.left == null) {
            Output = Output + value + "," + right.toString();
        }
        if (this.left == null && this.right == null) {
            Output = Output + value;
        }
        return Output;
    }

    public boolean containVerbose(int value){
        if (value == this.value)  {
            System.out.println(this.value);
            return true;
        }
        else if (value > this.value) {
            if (right == null){
                if (left != null  && this.value == this.left.value) {
                    System.out.println(this.value);
                    return left.containVerbose(value);
                }
                else {
                    System.out.println(this.value);
                    return false;
                }
            }
            else {
                System.out.println(this.value);
                return right.containVerbose(value);
            }
        }
        else if (this.value == this.left.value) {
            System.out.println(this.value);
            return left.containVerbose(value);
        }

        else {
            if (left == null) {
                System.out.println(this.value);
                return false;
            }
            else {
                System.out.println(this.value);
                return left.containVerbose(value);
            }
        }
    }
}
