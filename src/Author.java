public class Author {
    private String Fullname;
    private String email;
    private char gender;

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Author(String fullname, String email, char gender) {
        Fullname = fullname;
        this.email = email;
        this.gender = gender;


    }

    @Override
    public String toString() {
        return "Author{" +
                "Fullname='" + Fullname + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
