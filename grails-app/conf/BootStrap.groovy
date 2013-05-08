import uk.ac.shu.webarch.eregister.*;
class BootStrap {

    def init = { servletContext ->

    println("BootStrap::init");
    def ian_instructor = Instructor.findByStaffId('5443a') ?: new Instructor(staffId:'5443a', name:"Ian Ibbotson").save();


    def web_arch_course = Course.findByCourseCode('2354b') ?: new Course(courseCode:'2354b', courseName:'Web Architectures', description:'Headache for students').save();
    
    def new_class = new RegClass(name:'WebArch-Mondays' ,classInstructor:ian_instructor, course:web_arch_course).save();

    }
    def destroy = {
    }
}
