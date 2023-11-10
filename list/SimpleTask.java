
public class SimpleTask implements Task{

    private String title;

    private String description;

    private String priority;


    public SimpleTask(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "SimpleTask{" +
               "title=" + title +"\"" + 
               ", description='" + description + '\'' +
                  ", priority='" + priority + '\'' +
                '}';
    }
    




}
