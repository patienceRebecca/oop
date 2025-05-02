class TopClass extends NurseryClass {
    public TopClass(String classId) {
        super(classId, "Top Class", 25);
    }

    @Override
    protected boolean isValidTeacher(Teacher teacher) {
        return true; // No specific role restriction for Top Class
    }

    @Override
    protected boolean isValidStudent(Student student) {
        return student.getAge() >= 4 && student.getAge() <= 5;
    }

    @Override
    public void trackProgress() {
        System.out.println("Focus on basic reading, writing, and arithmetic. Includes term assessments.");
    }
}