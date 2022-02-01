package org.user.library;


import java.io.Serializable;

public class MySerializable implements Serializable {
    public String first;
    public String second;

    public MySerializable(String first, String second) {
        this.first = first;
        this.second = second;
    }
}
