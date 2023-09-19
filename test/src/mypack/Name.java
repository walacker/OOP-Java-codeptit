package mypack;

import java.util.*;

public class Name {
    private String firstName, midName, lastName;

    public Name(String name) {
        String[] arr = name.trim().split("\\s+");
        this.lastName = arr[arr.length - 1];
        this.firstName = arr[0];
        this.midName = String.join(" ", Arrays.copyOfRange(arr, 1, arr.length - 1));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + midName + " " + lastName;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}