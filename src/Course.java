public class Course {
    int id;
    String title;
    String description;
    static int lastID = 0;

    public Course( String title, String description){
        this.id = lastID++;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
