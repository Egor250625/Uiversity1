public class AcademicActivity implements Activity {
    String ActivityName;

    @Override
    public String getActivityName() {
        return ActivityName;
    }


    String nameOfTheSubject;

    public String getNameOfTheSubject() {
        return nameOfTheSubject;
    }

    public Activity setNameOfTheSubject() {
        this.nameOfTheSubject = nameOfTheSubject;
        return null;
    }
}
