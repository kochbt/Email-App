import java.util.Random;
import java.util.Scanner;

class Email{
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private int mbCapacity;
    private int defaultPasswordLength = 10;
    private String password;
    private String altEmail;
    private String emailAddress;
    
    //Constructor
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = getDepartment();
        //System.out.println("Department: " + this.department);
        this.company = getCompany();
        this.emailAddress = generateEmail(this.firstName, this.lastName, this.department, this.company);
        System.out.println("Email Created: " + this.emailAddress);
        this.password = generatePassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        
    }

    //Methods to change the Password, Mailbox Capacity, and Alternate Email
    public void setMbCapacity(int mbCapacity) {
        this.mbCapacity = mbCapacity;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    //Methods to display the Name, Email, and Mailbox Capacity
    public String displayName(){
        return this.firstName + " " + this.lastname;
    }

    public String displayEmail(){
        return this.emailAddress;
    }

    public String displayMbCapacity(){
        return this.mbCapacity;
    }

    //Retrieve Company name from User
    private String getCompany() {
        System.out.println("Enter Company Name: ");
        Scanner in = new Scanner(System.in);
        String companyChoice = in.next();
        in.close();
        return companyChoice;
    }

    //Retrieve Department from User
    private String getDepartment() {
        System.out.println("Enter department code: 0 - None, 1 - Sales, 2 - Development, 3 - Accounting");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 0){
            return "None";
        }else if(depChoice == 1){
            return "Sales";
        }else if(depChoice == 2){
            return "Development";
        }else if(depChoice == 3){
            return "Accounting";
        }
        in.close();
        return "Not a valid department";
        
    }

    //Generates random password string of length 10 from the passwordSet characters
    private String generatePassword(int defaultPasswordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
        char[] password = new char[defaultPasswordLength];
        for (int i=0; i<defaultPasswordLength; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Takes the name, department, and company and forms an email address string
    private String generateEmail(String firstName, String lastName, String department, String company){
        String emailAddress;
        if(department=="None"){   
            emailAddress = firstName + "." + lastName + "@" + company + ".com";
        }else{
            emailAddress = firstName + "." + lastName + "@" + department + "." + company + ".com";
        }
        return emailAddress.toLowerCase();
    }

    public int getMbCapacity() {
        return mbCapacity;
    }
}

