package com.basic;

public class Person {
    private String fName;
    private String lName;
    private String mobNumber;

    private Address address;

        public Person(String fName, String lName, String mobNumber, Address address) {
        this.fName = fName;
        this.lName = lName;
        this.mobNumber = mobNumber;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    /*public boolean equals(Objects o){
        if (this == o) return true;
        if(o==null || getClass()!=o.getClass()) return false;

    }
    public int hasCode(){

    }*/
}
