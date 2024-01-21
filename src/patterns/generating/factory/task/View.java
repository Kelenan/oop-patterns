package patterns.generating.factory.task;

public class View implements Fabric{
    private final String property;
    private User user;

    public View() {
        this.property = FactoryPropertyLoader.load();
        this.user = createUser();
    }


    @Override
    public User createUser() {
        if(property.equalsIgnoreCase("dev")){
            this.user = new UnauthorizedUser();
        }
        if(property.equalsIgnoreCase("prod")){
            AuthorizedUser u = new AuthorizedUser();
            if(DataBase.contains(u)){
                this.user = u;
            }
            else {
                throw new RuntimeException("Wrong login or password");
            }
        }
        System.out.println("You'r registered successfully");
        return user;
    }
}
