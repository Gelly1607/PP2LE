/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp2le;

/**
 *
 * @author Allysa Maravilla
 */
public class StudentPatient extends Person{

    private String studentID;
    private String college;
    private String yearLevel;
    private String course;
    private String major;

    private String height;
    private String weight;
    private String bloodPressure;
    private String temperature;
    private String bloodType;
    private String allergies;
    private String medicalHistory;
    private String symptoms;
    private String medicinesTaken;
    private String dateVisit;
    private String nurseRemarks;
    private String labResultPath;

    public StudentPatient(
            String firstName,
            String lastName,
            String studentID,
            String college,
            String yearLevel,
            String course,
            String major
    ) {

        super(firstName, lastName);

        this.studentID = studentID;
        this.college = college;
        this.yearLevel = yearLevel;
        this.course = course;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getMedicinesTaken() {
        return medicinesTaken;
    }

    public void setMedicinesTaken(String medicinesTaken) {
        this.medicinesTaken = medicinesTaken;
    }

    public String getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(String dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getNurseRemarks() {
        return nurseRemarks;
    }

    public void setNurseRemarks(String nurseRemarks) {
        this.nurseRemarks = nurseRemarks;
    }

    public String getLabResultPath() {
        return labResultPath;
    }

    public void setLabResultPath(String labResultPath) {
        this.labResultPath = labResultPath;
    }
    
    @Override
    public String displayInfo() {

    return getFirstName() + " "
            + getLastName()
            + " - "
            + studentID;
    }
    
    public String toCSV() {

    return getFirstName() + "," +
           getLastName() + "," +
           studentID + "," +
           college + "," +
           yearLevel + "," +
           course + "," +
           major + "," +
           height + "," +
           weight + "," +
           bloodPressure + "," +
           temperature + "," +
           bloodType + "," +
           allergies + "," +
           medicalHistory + "," +
           symptoms + "," +
           medicinesTaken + "," +
           dateVisit + "," +
           nurseRemarks + "," +
           labResultPath;
    }
}
