/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp2le;

import java.util.ArrayList;
/**
 *
 * @author Allysa Maravilla
 */

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PatientArray {

    private ArrayList<StudentPatient> patientList;

    public PatientArray() {

        patientList = new ArrayList<>();

    }

    // ADD PATIENT
    public void addPatient(StudentPatient p) {

        patientList.add(p);

    }

    // DELETE PATIENT
    public void deletePatient(StudentPatient p) {

        patientList.remove(p);

    }

    // RETURN ALL PATIENTS
    public ArrayList<StudentPatient> getPatientList() {

        return patientList;

    }

    // SEARCH PATIENT
    public ArrayList<StudentPatient> searchPatient(String key) {

        ArrayList<StudentPatient> result =
                new ArrayList<>();

        key = key.toLowerCase();

        for(StudentPatient p : patientList) {

            if(p.getFirstName().toLowerCase().contains(key)
            || p.getLastName().toLowerCase().contains(key)
            || p.getStudentID().toLowerCase().contains(key)) {

                result.add(p);

            }

        }

        return result;

    }

    // FILTER COLLEGE
    public ArrayList<StudentPatient> filterCollege(String college) {

        ArrayList<StudentPatient> result =
                new ArrayList<>();

        for(StudentPatient p : patientList) {

            if(p.getCollege().equalsIgnoreCase(college)) {

                result.add(p);

            }

        }

        return result;

    }

    // SAVE CSV FILE
    public void writeToFile() throws FileNotFoundException {

        PrintWriter out =
                new PrintWriter("PatientRecords.csv");

        for(StudentPatient p : patientList) {

            out.println(p.toCSV());

        }

        out.close();

    }

}