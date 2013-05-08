package uk.ac.shu.webarch.eregister

class RegClass {

String name


	Instructor classinstructor

        Course course

        Set enrolledStudents

    

    static constraints = {
    }

    static mapping = {
    classInstructor column: 'instructor_fk'
    course column: 'course_fk'
    }
}

