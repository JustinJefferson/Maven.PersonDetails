package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {

        String result = "";

        // create a `counter`
        Integer counter = 0;

        // while `counter` is less than length of array
        while(counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

            result += personArray[counter].toString();

            counter++;


        }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        StringBuilder builder = new StringBuilder(result);

        for(int counter = 0; counter < personArray.length; counter ++) {

            // use the above clauses to declare for-loop signature
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            builder.append(personArray[counter].toString());

            // end loop
        }

        result = builder.toString();

        return result;
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();

        // identify array's type
        // identify array's variable-name

        for (Person name : personArray) {

            result.append(name.toString());

        }

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
