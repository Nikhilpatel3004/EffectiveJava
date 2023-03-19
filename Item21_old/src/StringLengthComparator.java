public class StringLengthComparator implements Comparator<String>
{
    private StringLengthComparator() {
    }

    //not create object every time so make it singleton
    public static final StringLengthComparator INSTANCE = new StringLengthComparator();

    @Override
    public int compare(String t1, String t2) {
        return t1.length() - t2.length();
    }
}
