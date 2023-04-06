package pl.mmiskiewicz;

import java.sql.Timestamp;

public class Joke {
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private Timestamp createdAt;
    private String value;

}
