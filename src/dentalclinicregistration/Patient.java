
package dentalclinicregistration;


public class Patient {
    
    private String patientID;
    private String patientName;
    private String patientAge;
    private String patientPhoneNum;
    private String patientAddress;
    private String dateRegister;
    private String numOfVisits;
  

    Patient(String patientID, String patientName, 
            String patientAge, String patientPhoneNum,String patientAddress,
            String dateRegister,String numOfVisits) {

        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientPhoneNum = patientPhoneNum;
        this.patientAddress = patientAddress;
        this.dateRegister = dateRegister;
        this.numOfVisits = numOfVisits;
        
    }

    void setpatientName(String patientName) {
        this.patientName = patientName;
    }

    void setpatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    void setpatientPhoneNum(String patientPhoneNum) {
        this.patientPhoneNum = patientPhoneNum;
    }
    
    void setpatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    void setdateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }

    void setnumOfVisits(String numOfVisits) {
        this.numOfVisits = numOfVisits;
    }

    String getpatientID() {
        return patientID;
    }

    String getpatientName() {
        return patientName;
    }

    String getpatientAge() {
        return patientAge;
    }

    String getpatientPhoneNum() {
        return patientPhoneNum;
    }
    
    String getpatientAddress() {
        return patientAddress;
    }

    String getdateRegister() {
        return dateRegister;
    }

    String getnumOfVisits() {
        return numOfVisits;
    }

}

