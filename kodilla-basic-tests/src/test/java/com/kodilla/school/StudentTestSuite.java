package com.kodilla.school;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentTestSuite {

    @Test
    public void shouldCalculateCorrectAvragesIfValuesAreInRange(){
        Student student = new Student("Martin");
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(3.33, geographyAverage, 0.01);
        assertEquals(3, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(0, physicsAverage, 0.01);
    }
}
