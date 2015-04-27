package sg.edu.nyp.firebasetest;

import java.util.Date;

/**
 * Created by chitboon on 4/24/15.
 */
public class Quote {
    String owner;
    String quote;
    Date timestamp;

    public Quote(String quote) {
        this.owner = "Anonymous";
        this.quote = quote;
        this.timestamp = new Date();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
