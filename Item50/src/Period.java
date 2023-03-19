import java.util.Date;

public final class Period {
     private final Date start;
     private final Date end;

    public Period(Date start, Date end) {
//        this.start = start;
//        this.end = end; not do this

        //do this
       this.start = new Date(start.getTime());
       this.end = new Date(end.getTime());
    }
}
