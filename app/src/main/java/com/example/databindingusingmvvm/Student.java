package com.example.databindingusingmvvm;

public class Student {

    String name;
    int rollNumber;
    int marks;

    public Student(String sName, int sRollNumber, int sMarks){

        this.name= sName;
        this.rollNumber= sRollNumber;
        this.marks= sMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
}
