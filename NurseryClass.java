import java.util.ArrayList;
import java.util.List;

abstract class NurseryClass {
    protected String classId;
    protected String className;
    protected int maxCapacity;
    protected Teacher assignedTeacher;
    protected List<Student> students = new ArrayList<>();
    protected List<String> activities = new ArrayList<>();

    public NurseryClass(String classId, String className, int maxCapacity) {
        this.classId = classId;
        this.className = className;
        this.maxCapacity = maxCapacity;
    }

    public void assignTeacher(Teacher teacher) {
        if (isValidTeacher(teacher)) {
            this.assignedTeacher = teacher;
            teacher.setAssignedClass(this);
        } else {
            throw new IllegalArgumentException("Teacher does not meet the requirements for this class.");
        }
    }

    public void enrollStudent(Student student) {
        if (students.size() >= maxCapacity) {
            throw new IllegalStateException("Class is at full capacity.");
        }
        if (!isValidStudent(student)) {
            throw new IllegalArgumentException("Student does not meet the age requirements for this class.");
        }
        if (students.stream().anyMatch(s -> s.getStudentId().equals(student.getStudentId()))) {
            throw new IllegalArgumentException("Duplicate student ID is not allowed.");
        }
        students.add(student);
        student.setRegisteredClass(this);
    }

    public void conductActivity(String activityName) {
        activities.add(activityName);
        System.out.println("Activity conducted: " + activityName);
    }

    public void generateClassReport() {
        System.out.println("Class Report for " + className);
        System.out.println("Assigned Teacher: " + (assignedTeacher != null ? assignedTeacher.getTeacherName() : "None"));
        System.out.println("Number of Students: " + students.size());
        System.out.println("Activities Conducted: " + activities);
        trackProgress();
    }

    protected abstract boolean isValidTeacher(Teacher teacher);

    protected abstract boolean isValidStudent(Student student);

    public abstract void trackProgress();
}