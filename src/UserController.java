public class UserController {

    private static String username = "john";
    private static String password = "secret";

    public static boolean authenticated(String username, String password) {
        return UserController.username.equals(username) && UserController.password.equals(password);
    }

}
