public class OverRiding {
    public static void main(String[] args) {
        Wine[] wines  = { new Wine() , new SparklingWine() , new champagne()};


        for(Wine wine :wines){
            System.out.println(wine.name());
        }
    }
}
