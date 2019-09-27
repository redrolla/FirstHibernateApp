import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
/*        User user = new User("Dasha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);

        user.setName("Sasha");
        userService.updateUser(user);

        User cutUser = userService.findUser(7);
        userService.deleteUser(cutUser);
*/

        userService.deleteUser(userService.findUser(10));
    }
}
