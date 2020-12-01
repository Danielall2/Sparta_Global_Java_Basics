package com.sparta.daniel;

public class SwitchCase {

    public static void switchCase(int caseNumber){

        switch(caseNumber) {
            case 1:
                System.out.println("This is Case " + caseNumber);
                break;
            case 2:
                System.out.println("This is Case " + caseNumber + ", well done!");
                break;
            case 3:
                System.out.println("Whats this? You dare pick number " + caseNumber + "!");
                break;
            case 4:
                System.out.println("This is getting out of hand! Who in there right mind picks 4?");
                break;
            case 5:
                System.out.println("Just go");
                break;
            default:
                System.out.println("Pick an integer between 1 and 5 god damn it!");
        }

    }
}
