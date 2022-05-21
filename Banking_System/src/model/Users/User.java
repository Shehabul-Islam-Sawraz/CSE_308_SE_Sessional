package model.Users;

public abstract class User {
    private final UserType type;

    public User(UserType type) {
        this.type = type;
    }

    public UserType getType() {
        return type;
    }

    public abstract void lookUpUser(User user);
    public abstract void approveLoan();
}
