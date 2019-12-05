import java.util.Random;

class Email{
    String firstName;
    String lastName;
    String department;
    String company;
    int mbCapacity;
    String password;
    String altEmail;
    
    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMbCapacity(int mbCapacity) {
        this.mbCapacity = mbCapacity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMbCapacity() {
        return mbCapacity;
    }

    public String generatePassword(){
        return ;
    }

    public String generateEmail(String firstName, String lastName, String department, String company){
        String emailAddress = firstName + "." + lastName + "@" + department + "." + company + ".com";
        return emailAddress;
    }
}

