public class EmptyStringException extends Exception {
    private String name;

    public String getNameEx() {
        return name;
    }

    public EmptyStringException(String massage) {

        super(massage);
        name = "noName";




    }
}
