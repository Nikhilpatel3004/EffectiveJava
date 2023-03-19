public class Dog {
    private final int leg;
    private final int eye;

    public Dog(int leg, int eye) {
        this.leg = leg;
        this.eye = eye;
    }



    //this is overloading
    //so it is not working correctly because of the way equal work
    public boolean equals(Dog d){
        return leg == d.leg && eye == d.eye;
    }


    //overriding
    public boolean equals(Object o){
         if(!(o instanceof Dog)){
             return false;
         }
         Dog d = (Dog) o;
        return leg == d.leg && eye == d.eye;
    }


}
