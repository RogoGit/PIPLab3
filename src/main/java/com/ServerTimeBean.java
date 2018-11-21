package com;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerTimeBean implements Serializable{
    private String time;
    
    public String getTime() {
        return time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm:ss "));
    }

    public void setTime(String time) {
        this.time = time;
    }
}
