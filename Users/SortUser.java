package Users;

import java.util.Comparator;

public class SortUser implements Comparator<User> {

   public int compare(User user1,User user2){



       String us1= user1.getUserName();
       String us2=user2.getUserName();

        return us1.compareTo(us2);
    }
}
