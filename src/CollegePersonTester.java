public class CollegePersonTester {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 12345, 2);
        Professor professor = new Professor("Dr. Smith", "Smithson", 56789, "Computer Science");
        Assistant assistant = new Assistant("Alice", "Johnson", 98765, true);

        // Invoke the goToCollege() method for each object
        System.out.println("Student:");
        student.goToCollege();
        System.out.println("\nProfessor:");
        professor.goToCollege();
        System.out.println("\nAssistant:");
        assistant.goToCollege();

        // Invoke the implemented methods from interfaces
        System.out.println("\nStudent is a LearningPerson:");
        student.studyAtHome();
        System.out.println("\nProfessor is a TeachingPerson:");
        professor.teachToOtherPeople();
        System.out.println("\nAssistant is a LearningPerson and TeachingPerson:");
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}