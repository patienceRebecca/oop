class BabyClass extends NurseryClass {
    public BabyClass(String classId) {
        super(classId, "Baby Class", 15);
    }

    @Override
    protected boolean isValidTeacher(Teacher teacher) {
        return "Early Childhood Educator".equals(teacher.getTeacherRole());
    }

    @Override
    protected boolean isValidStudent(Student student) {
        return student.getAge() >= 2 && student.getAge() <= 3;
    }

    @Override
    public void trackProgress() {
        System.out.println("Focus on motor skills and play-based learning.");
    }
}