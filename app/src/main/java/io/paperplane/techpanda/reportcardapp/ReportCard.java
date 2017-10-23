package io.paperplane.techpanda.reportcardapp;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JustinE on 10/22/17.
 * This Class manages all of the data for this app, as per the instructions set by the
 * Multiscreen Apps course - Lesson 3.
 */

public class ReportCard {


    int studentId;          // Student identification number
    List<String> subjects;  // List of subjects the student is taking
    List<Integer> grades;    // Subject grades based on a 100 point scale where < 50 is fail


    // The constructor uses the studentId to check which student's grades to lookup
    public ReportCard(int studentId) {
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    // This gets the average grade and returns the value
    public float getGradeAverage() {
        int numberOfGrades = 0;

        for(int i = 0; i < grades.size(); i++) {
            numberOfGrades += grades.get(i);
        }
        float gradeAverage = numberOfGrades / grades.size();
        return gradeAverage;
    }

    public String getSingleSubjectAndGrade(int index) {
        List<String> subjects = getSubjects();
        List<Integer> grades = getGrades();

        String subjectWithGrade = subjects.get(index) + " with a grade of " +
                Integer.toString(grades.get(index));
        return subjectWithGrade;
    }

    public String getAllSubjectsAndgrades() {
        String allSubjectsAndGrades = "";

        for (int i = 0; i < subjects.size(); i++) {
            allSubjectsAndGrades += (getSingleSubjectAndGrade(i) + "\n");
        }
        return allSubjectsAndGrades;
    }

    @Override
    public String toString() {
        String filledReportCard = "Student ID: " + Integer.toString(studentId) + "\n"
                + "Subjects Taken: " + getAllSubjectsAndgrades() + "Average Grade: " +
                getGradeAverage();

        return filledReportCard;
    }
}
