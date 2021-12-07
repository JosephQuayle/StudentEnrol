package com.enrol

class Student {

    String studentName
    String studentID
    String studentEmail
    String studentUsername
    String studentPassword
    String course
    Date dob
    Boolean isFundingAvailable

    static constraints = {
    studentName blank: false nullable: false
    studentID blank: false nullable: false
    studentEmail blank: false nullable: false email: true
    studentUsername blank: false nullable: false unique: true
    studentPassword blank: false nullable: false
    course blank: false nullable: false
    dob blank: false nullable: false
    isFundingAvailable blank: false nullable: false
    }
}
