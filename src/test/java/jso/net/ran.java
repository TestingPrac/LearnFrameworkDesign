package jso.net;

import org.apache.commons.lang.RandomStringUtils;

public class ran {
    public static void main(String[] args) {
        String EmpCode= RandomStringUtils.random(3, false, true)+"Emp30";
        System.out.println(EmpCode);
        String fName= RandomStringUtils.random(5, true, false);
        String mName= RandomStringUtils.random(1, true, false);
        String lName= RandomStringUtils.random(4, true, false);
        String primaryemail= RandomStringUtils.random(7, true, false)+"@abc.com";
        String PrimaryPhoneNumber= "923"+RandomStringUtils.random(7, false, true);
        System.out.println(fName);
        System.out.println(mName);
        System.out.println(lName);
        System.out.println(primaryemail);
        System.out.println(PrimaryPhoneNumber);

//        // Custom input string
//        String s = "Yes,no";
//
////
////        for (String a : y)
////            System.out.println(a);
//
//        String parts[]=s.split(",");
//        String part1=parts[0];
//        String part2=parts[1];
//
//        System.out.println(part1.trim());
//        System.out.println("asdf"+part2);

    }
}