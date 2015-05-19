/**
 * Created by digibrose on 10/11/2014.
 */
public class HospitalManager {
    public Patient patientListStart = null;



    public void launch() {
        Patient firstPatient = new Patient("John", 33, "Tuberculosis");
        this.patientListStart = firstPatient;
    }



}
