package system.model;


public class Title {
    private Integer id;
    private String message;

    public Title() {
    }

    public Title(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
