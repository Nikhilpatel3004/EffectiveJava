public class Main {
    public static void main(String[] args) {

        Favorites favorites = new Favorites();
        favorites.putClass(String.class,"Nikhil");
        favorites.putClass(Integer.class,30);
        favorites.putClass(Class.class,Favorites.class);
        
    }
}