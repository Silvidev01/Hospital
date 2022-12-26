package Hospital;

public class Printer  <T extends Person> {
    private T fullname;

    public T getFullname() {
        return fullname;
    }

    public void setFullname(T fullname) {
        this.fullname = fullname;
    }

}
