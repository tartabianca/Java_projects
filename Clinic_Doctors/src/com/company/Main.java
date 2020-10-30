package com.company;

import javax.swing.*;
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        //crearea listelor
        ArrayList<Patient> patients = new ArrayList<Patient>(100);
        ArrayList<Doctor> doctors = new ArrayList<Doctor>(10);

        createDoctorList(doctors);
        createPatientList(patients);

        //meniu
        int opt = -1;
        while (opt != 7) {
            System.out.println("Choose:\n1. Print the list of doctors\n2. Print the list of patients\n3. Summary of all patients\n4. Store the list of patients in a file on disk\n5. Store the list of doctors in a file on disk\n6. Simulate the system\n7. Exit");
            System.out.println("Your option: ");
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();

            switch (opt) {
                case 1:
                    printDoctorsList(doctors);
                    break;
                case 2:
                    printPatientList(patients);
                    break;
                case 3:
                    createSummary(patients);
                    break;
                case 4:
                    storePatients(patients);
                    System.out.println("Open the file 'PatientList' to see the result");
                    break;
                case 5:
                    storeDoctors(doctors);
                    System.out.println("Open the file 'DoctorList' to see the result");
                    break;
                case 6:
                    simulateSystem(doctors, patients);
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }
    }

    static void simulateSystem(ArrayList<Doctor> doctors, ArrayList<Patient> patients) {
        // clinica e deschisa 12 ore pe zi & sunt 8 doctori => am presupus ca fiecare doctor lucreaza 6 ore pe zi

        int x = 0;
        System.out.println("List of consults: ");
        for (int i = 0; i < doctors.size(); i++) {
            int n = 0, min = 0, sum = 0, j;
            for (j = x; j < patients.size() && min < 360; j++) {
                n++;
                if (patients.get(i).getReason().toString() == "Consultation") {
                    min += 30;
                    sum += 50;
                }
                if (patients.get(i).getReason().toString() == "Prescription") {
                    min += 20;
                    sum += 20;
                }
                if (patients.get(i).getReason().toString() == "Treatment") {
                    min += 40;
                    sum += 35;
                }
            }
            x = j;
            System.out.println(doctors.get(i).getFn() + ", " + doctors.get(i).getLn() + " - "
                    + doctors.get(i).getId() + ": " + n + " patients, " + min + " minutes, " + sum + " RON\n");
        }
        System.out.println("List of patients which were not consulted: ");
        for (int i = x; i < patients.size(); i++) {
            patients.get(i).afisare();
        }

    }

    static void storeDoctors(ArrayList<Doctor> doctors) {
        try {
            FileWriter fw = new FileWriter("DoctorList");
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i < doctors.size(); i++)
                output.write("Doctor " + (i + 1) + ":\n" + doctors.get(i).getFn().toString() + "\n" + doctors.get(i).getLn() + "\n" + doctors.get(i).getAge() + "\n\n");
            output.close();
        } catch (Exception c) {
            JOptionPane.showMessageDialog(null, "I can't create the file");
        }

    }

    static void storePatients(ArrayList<Patient> patients) {
        try {
            FileWriter fw = new FileWriter("PatientList");
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i < patients.size(); i++)
                output.write("Patient " + (i + 1) + ":\n" + patients.get(i).getFn().toString() + "\n" + patients.get(i).getLn() + "\n" + patients.get(i).getAge() + "\n" + patients.get(i).getReason() + "\n\n");
            output.close();
        } catch (Exception c) {
            JOptionPane.showMessageDialog(null, "I can't create the file");
        }

    }

    static void createSummary(ArrayList<Patient> patients) {
        int children = 0, pupil = 0, student = 0, adults = 0;
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).age <= 1)
                children++;
            else if (patients.get(i).age <= 7)
                pupil++;
            else if (patients.get(i).age <= 18)
                student++;
            else
                adults++;
        }
        System.out.println("Children (0-1): " + children + " patients" + "\nPupil (1-7): " + pupil + " patients" + "\nStudents (7-18): " + student + " patients" + "\nAdults (>18): " + adults + " patients");

    }

    static void printPatientList(ArrayList<Patient> patients) {
        for (int i = 0; i < patients.size(); i++) {
            patients.get(i).afisare();
        }
    }

    static void createPatientList(ArrayList<Patient> patients) {
        // id-ul, numele si varsta pacientilor le-am generat cu ajutorul functiei Random
        // am luat o variabila k pentru a crea pe rand cate un pacient cu fiecare motiv (pentru a nu introduce manual la fiecare pacient in parte)

        int k = 0;
        for (int i = 0; i < 100; i++) {
            String reason = "";
            if (k == 0)
                reason = "Consultation";
            else if (k == 1)
                reason = "Treatment";
            else
                reason = "Prescription";

            Patient p = new Patient(getRandomString(5), getRandomString(4), getRandomNumber(0, 85), reason);
            patients.add(p);

            if (k == 2)
                k = 0;
            else
                k++;
        }

    }

    static void printDoctorsList(ArrayList<Doctor> doctors) {
        for (int i = 0; i < doctors.size(); i++) {
            doctors.get(i).afisare();
        }
    }

    static void createDoctorList(ArrayList<Doctor> doctors) {
        // id-ul, numele si varsta pacientilor le-am generat cu ajutorul functiei Random

        for (int i = 0; i < 8; i++) {
            Doctor d = new Doctor(getRandomNumber(1000, 9999), getRandomString(3), getRandomString(2), getRandomNumber(30, 65));
            doctors.add(d);
        }
    }

    static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    static String getRandomString(int n) {

        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}
