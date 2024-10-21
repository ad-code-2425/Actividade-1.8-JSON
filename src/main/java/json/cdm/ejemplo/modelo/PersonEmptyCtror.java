package json.cdm.ejemplo.modelo;

public class PersonEmptyCtror {
    private  String firstName = "";
    private  String lastName = "";
    private  int age = 0;

    public PersonEmptyCtror(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //Default constructor es necesario
    public PersonEmptyCtror() {
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    };

}