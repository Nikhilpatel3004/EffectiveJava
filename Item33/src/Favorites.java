import java.util.HashMap;
import java.util.Map;

public class Favorites {

    private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

    public <T> void putClass(Class<T> type,T instance){
          if(type == null){
              throw new NullPointerException();
          }
        favorites.put(type,type.cast(instance));

    }

    public <T> T getFavorites(Class<T> type){
        return (type.cast(favorites.get(type) ));
    }

}
