import java.util.ArrayList;

public class Student  {
    ArrayList<Activity> list = new ArrayList<>();
    private ArrayList<Activity> activities;
    private String name;
    private String surname;
    private String group;

    public void addActivity(Activity activity) {
        list.add(activity);


    }
    public void removeActivity(Activity activity){
        list.remove(activity);
    }
    public void showActivities(Activity activity){
        System.out.println(activity);

    }


    public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
