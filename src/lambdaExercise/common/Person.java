package lambdaExercise.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
