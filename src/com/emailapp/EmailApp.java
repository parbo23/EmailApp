package com.emailapp;

public class EmailApp {

    public static void main(String[] args) {
	  Email em1 = new Email("Join", "Smith");

        em1.showInfo();
        System.out.println(em1.showInfo());

        //Generate an email with the following syntax: firstname, lastname@department.company.com
        //Determine the department ( sales, development, accounting), if none leave blank
        //Generate a random String for a password
        //Have set methods to change the password, set the mailbox capacity, and define an alternate email address
        // have get methods to display the name, email, and mailbox capacity
    }
}
