class UserManager {
String username;
    int userId;
    String role;
    String email;
    String location;

    UserManager() {
        this("Rahul", 101);
        System.out.println("Default Constructor");
    }

    UserManager(String username, int userId) {
        this(username, userId, "Admin");
        System.out.println("Two Parameter Constructor");
    }

    UserManager(String username, int userId, String role) {
        this(username, userId, role, "rahul@gmail.com");
        System.out.println("Three Parameter Constructor");
    }

    UserManager(String username, int userId, String role, String email) {
        this(username, userId, role, email, "Bangalore");
        System.out.println("Four Parameter Constructor");
    }

    UserManager(String username, int userId, String role, String email, String location) {
        this.username = username;
        this.userId = userId;
        this.role = role;
        this.email = email;
        this.location = location;

        System.out.println("Username : " + username);
        System.out.println("User ID  : " + userId);
        System.out.println("Role     : " + role);
        System.out.println("Email    : " + email);
        System.out.println("Location : " + location);
    }
}