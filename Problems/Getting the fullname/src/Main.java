

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if(null != firstName) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if(null != lastName) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        if(firstName.equals("") && lastName.equals("")) {
            return "Unknown";
        } else if (firstName.equals("")) {
            return this.lastName;
        } else if (lastName.equals("")) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}