package com.example.recycler;

public class President {

    private  int id;
    private String name;
    private int dateOfElection;
    private String imageURL;


    //constructor
    public President(int id, String name, int dateOfElection, String imageURL) {
        this.id = id;
        this.name = name;
        this.dateOfElection = dateOfElection;
        this.imageURL = imageURL;
    }


    //to string, in order log in details of each president
    @Override
    public String toString() {
        return "President{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfElection=" + dateOfElection +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }


    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfElection() {
        return dateOfElection;
    }

    public void setDateOfElection(int dateOfElection) {
        this.dateOfElection = dateOfElection;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
