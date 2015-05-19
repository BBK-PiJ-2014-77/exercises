/**
 * Created by digibrose on 02/03/2015.
 */

interface Person {

    public  default String getName(){
        return "Name";
    }


}

interface Academic extends Person {

}

interface Student extends Person {

}

interface TeachingAssistant extends Academic, Student {

}

class TAImpl implements TeachingAssistant {

}

class Test {
    public static void main(String[] args) {
        Person ta = new TAImpl();
        System.out.println(ta.getName());
    }
}
