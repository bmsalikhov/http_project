package models;

public class Receiver {
    final String id;
    final String title;

    public Receiver(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
