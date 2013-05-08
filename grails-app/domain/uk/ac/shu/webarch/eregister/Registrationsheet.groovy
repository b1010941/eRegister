package uk.ac.shu.webarch.eregister

class Registrationsheet {

Course course

Date sheetDate

Set signatories

String notes

  static hasMany = [classes: Registerentry]

    static mappedBy = [classes: 'regSheet']



    static constraints = {
course(nullable:false, blank:false);
sheetDate(nullable:false, blank:false);
notes(nullable:true, blank:true);
    }

static mapping = {
notes column: 'course_desc', type:'text'

}
}
