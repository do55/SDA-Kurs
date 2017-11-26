package pl.sda.sdajavaweekend.domain;


public class Programmer extends Employee {

    private String developerName;
    private String developerPosition;

    public Programmer(String developerName, String developerPosition) {
        super(developerName, developerPosition);
        this.developerName = developerName;
        this.developerPosition = developerPosition;



    }
}

