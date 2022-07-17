package org.example;

public class GradeCalculator {
    private int marks;
    private double inputMarks;

    public char graderForThreeCreditCourse(String mark){
        try{
            inputMarks = Double.parseDouble(mark);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Input marks is not a number!");
        }

        if(inputMarks<0){
            throw new IllegalArgumentException("Marks can't be negative!");
        }

        marks = (int) Math.ceil(inputMarks);
        if(marks < 180){
            return 'F';
        }
        else if(marks < 210){
            return 'C';
        }
        else if(marks < 240){
            return 'B';
        }
        else if(marks <= 300){
            return 'A';
        }
        else{
            throw new IllegalArgumentException("Marks can't be more than 300 for a 3 credit course");
        }
    }

    public char graderForFourCreditCourse(String mark){
        try{
            inputMarks = Double.parseDouble(mark);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Input marks is not a number!");
        }

        if(inputMarks<0){
            throw new IllegalArgumentException("Marks can't be negative!");
        }

        marks = (int) Math.ceil(inputMarks);
        if(marks < 240){
            return 'F';
        }
        else if(marks < 280){
            return 'C';
        }
        else if(marks < 320){
            return 'B';
        }
        else if(marks <= 400){
            return 'A';
        }
        else{
            throw new IllegalArgumentException("Marks can't be more than 400 for a 3 credit course");
        }
    }
}
