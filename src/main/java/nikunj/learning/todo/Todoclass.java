package nikunj.learning.todo;

import java.time.LocalDate;

public class Todoclass {

    private int id;
    private String title;
    private String details;
    private LocalDate localDate;

    public Todoclass( String title, String details, LocalDate localDate) {

        this.title = title;
        this.details = details;
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Todoclass{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", localDate=" + localDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todoclass)) return false;

        Todoclass todoclass = (Todoclass) o;

        return id == todoclass.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
