/**
 * Created by digibrose on 10/11/2014.
 */
public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness ) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;

    }

    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
        }
        else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient oldPatient) {
        if (this.nextPatient == null) {
            return false;
        }
        else if (this.nextPatient.name.equals(oldPatient.name)) {
            this.nextPatient = nextPatient.nextPatient;
            return true;
        }
        else {
            return this.nextPatient.deletePatient(oldPatient);
        }
    }

    public void PatientList () {

        if (this.nextPatient == null) {
            System.out.println(this.name);
            System.out.println("");
        } else {
            System.out.println(this.name);
            this.nextPatient.PatientList();
        }
    }
}
