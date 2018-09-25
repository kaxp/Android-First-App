package com.example.kapil.android_first.models;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    public String uname;
    public String upass;
    public String Fname;
    public String Lname;


    public User(String uname, String upass) {
        this.uname = uname;
        this.upass = upass;

    }

    public User(String uname, String upass, String Fname, String Lname) {
        this.uname = uname;
        this.upass = upass;
        this.Fname = Fname;
        this.Lname = Lname;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uname);
        dest.writeString(this.upass);
        dest.writeString(this.Fname);
        dest.writeString(this.Lname);
    }

    protected User(Parcel in) {
        this.uname = in.readString();
        this.upass = in.readString();
        this.Fname = in.readString();
        this.Lname = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}



