package io.paperplane.techpanda.reportcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Justin Eichenlaub on 10/22/17 for the Udacity Android Basics course
 * Multiscreen apps course - Lesson 3. This is a report card app with all of the functions
 * of the app taking place in the {@link ReportCard} Class as per the parameters of the lesson.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard student = new ReportCard(1337);

        List<String> subjectsTaken = new ArrayList<>();
        subjectsTaken.add("Programming");
        subjectsTaken.add("College Algebra II");
        subjectsTaken.add("Intro to Philosophy");
        subjectsTaken.add("Business Writing");
        subjectsTaken.add("Life Sciences II");

        student.setSubjects(subjectsTaken);

        List<Integer> gradesEarned = new ArrayList<>();
        gradesEarned.add(89);
        gradesEarned.add(97);
        gradesEarned.add(76);
        gradesEarned.add(88);
        gradesEarned.add(79);

        student.setGrades(gradesEarned);


    }
}
