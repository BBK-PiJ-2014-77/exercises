import java.util.LinkedList;
import java.util.List;

/**
 * Created by digibrose on 16/02/2015.
 */
public class DLList <T> {


    private node FirstElement = null;
    private node LastElement = null;
    private int SIZE = 0;

    public void add (T newobj){
        if (FirstElement == null) {
            FirstElement = new node(newobj);
            LastElement = FirstElement;
            SIZE++;
        }
        else {
            node Stepper = FirstElement;
            while (Stepper.getNext() != null){
                Stepper = Stepper.getNext();
        }
            node addnode = new node(newobj);
            Stepper.setNext(addnode);
            Stepper.getNext().setPrevious(Stepper);
            LastElement = Stepper.getNext();
            SIZE++;
    }
    }

    public void showlist (){
        node Stepper = FirstElement;
        while (Stepper.getNext() != null){
            System.out.println(Stepper.getElement());
            Stepper =  Stepper.getNext();
        }
        System.out.println(Stepper.getElement());
    }

    public void reverselist (){
        node Stepper = LastElement;
        while (Stepper.getPrevious() != null){
            System.out.println(Stepper.getElement());
            Stepper =  Stepper.getPrevious();
        }
        System.out.println(Stepper.getElement());
    }

    public boolean search (T search){
        node stepper = FirstElement;
        node revstepper = LastElement;
        System.out.println(SIZE);
        for (int i = 0; i <= SIZE; i++){
            System.out.println(stepper.getElement() + " inline" );
            if (stepper.getElement().equals(search) || revstepper.getElement().equals(search)){
                return true;
            }

        }
        return false;
    }

}

class node <T> {

    private node PreviousElement = null;
    private node NextElement = null;
    private T Element;


    public node (T newnode ){
        this.Element = newnode;
    }

    public node getNext(){
        return NextElement;
    }

    public node getPrevious(){
        return PreviousElement;
    }

    public T getElement(){
        return Element;
    }

    public void setNext(node add){
        this.NextElement = add;
    }

    public void setPrevious(node add){
        this.PreviousElement = add;
    }





}
