package com.example.chelseaplayer.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {
    private String name;
    private String position;
    private String country;
    private String photo;
    private int height;
    private int age;
    private int weight;
    private int match;
    private int goal;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    void setPosition(String position) {
        this.position = position;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMatch() {
        return match;
    }

    void setMatch(int match) {
        this.match = match;
    }

    public int getGoal() {
        return goal;
    }

    void setGoal(int goal) {
        this.goal = goal;
    }

    public String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }

    public String getPhoto() {
        return photo;
    }

    void setPhoto(String photo) {
        this.photo = photo;
    }

    Player() {
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.position);
        dest.writeString(this.country);
        dest.writeString(this.photo);
        dest.writeInt(this.height);
        dest.writeInt(this.age);
        dest.writeInt(this.weight);
        dest.writeInt(this.match);
        dest.writeInt(this.goal);
    }

    private Player(Parcel in) {
        this.name = in.readString();
        this.position = in.readString();
        this.country = in.readString();
        this.photo = in.readString();
        this.height = in.readInt();
        this.age = in.readInt();
        this.weight = in.readInt();
        this.match = in.readInt();
        this.goal = in.readInt();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel source) {
            return new Player(source);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
