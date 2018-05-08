package org.n3r.idworker;

public class InvalidSystemClock extends RuntimeException  {
    public InvalidSystemClock(String format) {
        super(format);
    }
}
