package mypack;

import java.io.*;

public class User implements Serializable {
        private String username;
        private String password;
        private String firstName;
    private String midName;
    private String lastName;

        public User(String username, String password, String firstName, String midName, String lastName) {
                this.username = username;
                this.password = password;
                this.firstName = firstName;
                this.midName = midName;
                this.lastName = lastName;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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
}
