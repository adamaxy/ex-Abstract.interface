class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        super(name, surname, id);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println(name + " is studying at home.");
    }


    public void teachToOtherPeople() {
        System.out.println(name + " is teaching and assisting students.");
    }
}