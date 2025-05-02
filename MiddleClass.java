class MiddleClass extends NurseryClass {
    public MiddleClass(String classId) {
        super(classId, "Middle Class", 20);
    }

    @Override
    protected boolean isValidTeacher(Teacher teacher) {
        return true; // No specific role restriction for Middle Class
    }

    @Override
    protected boolean isValidStudent(Student student) {
        return student.getAge() >= 3 && student.getAge() <= 4;
    }

    @Override
    public void trackProgress() {
        System.out.println("Focus on language development, basic counting, and storytelling.");
    }
}