package oocpsDay1;


public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    
    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
        
    }

    
    public void setClock(int secondsSinceMidnight) {
        this.hours = (secondsSinceMidnight / 3600) % 24;
        this.minutes = (secondsSinceMidnight % 3600) / 60;
        this.seconds = secondsSinceMidnight % 60;
    }

    
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Set-methods
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Invalid hour: " + hours);
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Invalid minute: " + minutes);
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Invalid second: " + seconds);
        }
    }

    
    public void tick() {
        this.seconds++;
        if (this.seconds >= 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes >= 60) {
                this.minutes = 0;
                this.hours = (this.hours + 1) % 24;
            }
        }
    }

   
    public void tickDown() {
        this.seconds--;
        if (this.seconds < 0) {
            this.seconds = 59;
            this.minutes--;
            if (this.minutes < 0) {
                this.minutes = 59;
                this.hours = (this.hours - 1 + 24) % 24;
            }
        }
    }

    
    public void addClock(Clock other) {
        int totalSeconds = this.toSeconds() + other.toSeconds();
        this.setClock(totalSeconds);
    }

    // Method to subtract time from another Clock object
    public Clock subtractClock(Clock other) {
        int totalSeconds = this.toSeconds() - other.toSeconds();
        if (totalSeconds < 0) {
            totalSeconds += 24 * 3600; // wrap around a day
        }
        return new Clock(totalSeconds);
    }

    // Helper method to convert current time to seconds since midnight
    private int toSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    // toString method to return the time in (hh:mm:ss) format
    @Override
    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
}

// 
