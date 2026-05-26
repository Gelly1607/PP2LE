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
public class PatientArray {

    private ArrayList<StudentPatient> patientList;

    public PatientArray() {

        patientList = new ArrayList<>();

    }

    // ADD PATIENT
    public void addPatient(StudentPatient patient) {

        patientList.add(patient);

    }

    // DELETE PATIENT
    public void deletePatient(StudentPatient patient) {

        patientList.remove(patient);

    }

    // RETURN ALL PATIENTS
    public ArrayList<StudentPatient> getPatientList() {

        return patientList;

    }

    // SEARCH BY STUDENT ID
    public StudentPatient searchPatient(String studentID) {

        for (StudentPatient patient : patientList) {

            if (patient.getStudentID().equals(studentID)) {

                return patient;

            }

        }

        return null;

    }

}
