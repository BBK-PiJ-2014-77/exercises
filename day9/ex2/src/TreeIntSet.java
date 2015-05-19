/**
 * Created by digibrose on 24/11/2014.
 */
public class TreeIntSet implements IntSet {

    private int value;
    private TreeIntSet left;
    private TreeIntSet right;

    public TreeIntSet(int rootnumber) {
        this.value = rootnumber;
    }

    public void add(int value) {
        if (this.contains(value) == true) {
            System.out.println(value + " is already present");
        }
        else if (value > this.value) {
            if (right == null) {
                right = new TreeIntSet(value);
            } else {
                right.add(value);
            }
        }
        else {
            if (left == null) {
                left = new TreeIntSet(value);
            }
            else {
                left.add(value);
            }
        }
    }

    public boolean contains(int value){
        if (value == this.value)  {
            return true;
        }
        else if (value > this.value) {
            if (right == null) {
                return false;
            }
            else {
                return right.contains(value);
            }
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

    /**
     * Print the value on the screen
     */
    public boolean containVerbose(int value){
        if (value == this.value)  {
            System.out.println(this.value);
            return true;
        }
        else if (value > this.value) {
            if (right == null) {
                System.out.println(this.value);
                return false;
            }
            else {
                System.out.println(this.value);
                return right.containVerbose(value);
            }
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



}
