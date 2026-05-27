/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp2le;

/**
 *
 * @author Allysa Maravilla
 */

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

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
    public ArrayList<StudentPatient> searchPatients(String keyword) {

        ArrayList<StudentPatient> result = new ArrayList<>();

        for (StudentPatient p : patientList) {

            if (p.getLastName().toLowerCase().contains(keyword.toLowerCase()) ||
                p.getFirstName().toLowerCase().contains(keyword.toLowerCase()) ||
                p.getStudentID().toLowerCase().contains(keyword.toLowerCase())) {

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

        PrintWriter out = new PrintWriter("PatientRecords.csv");

        for(StudentPatient p : patientList) {

            out.println(p.toCSV());

        }

        out.close();

    }
    
    public void readFromFile() {

    try {

        File file = new File("PatientRecords.csv");
        Scanner sc = new Scanner(file);

        patientList.clear();

        while (sc.hasNextLine()) {

        String line = sc.nextLine();

        if (line.trim().isEmpty()) continue;

        String[] data = line.split(",", -1);

        if (data.length < 19) {
            System.out.println("BROKEN CSV LINE (" + data.length + " fields): " + line);
            continue;
        }

        StudentPatient p = new StudentPatient(
            data[0],
            data[1],
            data[2],
            data[3],
            data[4],
            data[5],
            data[6]
        );

        p.setHeight(data[7]);
        p.setWeight(data[8]);
        p.setBloodPressure(data[9]);
        p.setTemperature(data[10]);
        p.setBloodType(data[11]);
        p.setAllergies(data[12]);
        p.setMedicalHistory(data[13]);
        p.setSymptoms(data[14]);
        p.setMedicinesTaken(data[15]);
        p.setDateVisit(data[16]);
        p.setNurseRemarks(data[17]);
        p.setLabResultPath(data[18]);

        patientList.add(p);
    }
        sc.close();

    } catch (FileNotFoundException e) {
        System.out.println("No CSV file found yet. Starting fresh.");
    }
}

}