

public class Role {
  public static void main(String[] args) {
    int menuIndex = 0;
    int subMenuIndex = 0;
    boolean isValidRole = false;

    if (args.length == 0) {
      System.out.println("What role you want to see ?");
      System.out.println("For example, try 'Admin'.");
      isValidRole = !isValidRole;
    } else if (args.length == 1) {
      
      if (args[0].equals("Super Admin")) {
        System.out.printf("%d. Super Admin\n",++menuIndex);
        System.out.printf("%2d.%d. CRUD Super Admin\n",menuIndex,++subMenuIndex);
        System.out.printf("%2d.%d. CRUD Admin\n",menuIndex,++subMenuIndex);
        System.out.printf("%2d.%d. CRUD User \n\n",menuIndex,++subMenuIndex); 
        subMenuIndex = 0;
        }
      
      if (args[0].equals("Admin") | args[0].equals("Super Admin")) {
        System.out.printf("%d. Admin\n",++menuIndex);
        System.out.printf("%2d.%d. CRUD Admin\n",menuIndex,++subMenuIndex);
        System.out.printf("%2d.%d. CRUD User\n\n",menuIndex,++subMenuIndex); 
        subMenuIndex = 0;
        }

      if (args[0].equals("User") | args[0].equals("Admin") | args[0].equals("Super Admin")) {
        System.out.printf("%d. User\n",++menuIndex);
        System.out.printf("%2d.%d. View\n",menuIndex,++subMenuIndex);
        System.out.printf("%2d.%d. Edit\n",menuIndex,++subMenuIndex);

      } else {
        System.out.println("Invalid Role");
        System.out.println("Valid Role : Super Admin, Admin, User");
        isValidRole = !isValidRole;
      }
    } else {
      System.out.println("Too many argument");
      isValidRole = !isValidRole;
    }
  }
}

