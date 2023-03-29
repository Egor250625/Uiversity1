public class Main {
    public static void main(String[] args) {
        AcademicActivity academicActivity = new AcademicActivity();
        SportActivity sportActivity = new SportActivity();
        Student student = new Student(
                "Egor",
                "Ivanov",
                "First group"
        );
        System.out.println(student);
        student.addActivity(academicActivity.setNameOfTheSubject());
        student.addActivity(sportActivity.setActivityName());
        student.showActivities(academicActivity.setNameOfTheSubject());
        student.showActivities(sportActivity.setActivityName());

        Student student1 = new Student(
                "Vladimir",
                "Smirnov",
                "Second group"
        );
        student1.addActivity(academicActivity.setNameOfTheSubject());
        student1.addActivity(sportActivity.setActivityName());
        student1.showActivities(academicActivity.setNameOfTheSubject());
        student1.showActivities(sportActivity.setActivityName());
        System.out.println(student1);


    }
}

