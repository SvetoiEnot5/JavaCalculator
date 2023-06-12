package application;

public class User {
    private String username;
    private int numberOfOperations;

    public User(String username, int numberOfOperations) {
        this.username = username;
        this.numberOfOperations = numberOfOperations;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumberOfOperations() {
        return numberOfOperations;
    }

    public void setNumberOfOperations(int numberOfOperations) {
        this.numberOfOperations = numberOfOperations;
    }
}
