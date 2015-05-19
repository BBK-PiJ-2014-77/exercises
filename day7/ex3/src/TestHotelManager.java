/**
 * Created by digibrose on 10/11/2014.
 */
public class TestHotelManager {

    public static void main(String[] args) {
        HospitalManager Hm = new HospitalManager();
        Hm.launch();
        Patient secondPatient = new Patient("Peter", 42, "Flu");
        Hm.patientListStart.addPatient(secondPatient);
        Patient thirdPatient = new Patient("James", 82, "Stroke");
        Hm.patientListStart.addPatient(thirdPatient);
        Patient fourthPatient = new Patient("Fred", 92, "Heamorhage");
        Hm.patientListStart.addPatient(fourthPatient);
        Patient fifthPatient = new Patient("Sid", 62, "Dementia");
        Hm.patientListStart.addPatient(fifthPatient);
        Patient sixthPatient = new Patient("Amos", 52, "Diabetes");
        Hm.patientListStart.addPatient(sixthPatient);
        Patient seventhPatient = new Patient("Jared", 22, "Depression");
        Hm.patientListStart.addPatient(seventhPatient);
        Patient eigthPatient = new Patient("Tim", 12, "Leukemia");
        Hm.patientListStart.addPatient(eigthPatient);
        Patient ninethPatient = new Patient("Sue", 48, "Epilepsy");
        Hm.patientListStart.addPatient(ninethPatient);

        Hm.patientListStart.PatientList();

        Hm.patientListStart.deletePatient(thirdPatient);

        Hm.patientListStart.PatientList();

    }
}
