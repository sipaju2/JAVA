public class PhiloVirtual extends VirtualClass {

    public PhiloVirtual(String virtual, Instructor instructor, String problem) {
        super(virtual, instructor);
        this.problem = problem;

    }

    @Override
    public void setVirtualType(String virtual) {
        this.virtualMedia = virtual;
    }

    @Override
    public String getVirttualType() {
        return this.virtual;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getProblem() {
        return this.problem;
    }

    @Override
    public String toString() {

        return "This is a Philosophy virtual class, it's tought with " + super.getVirttualType()
                + "\ntoday we will be talking about " + getProblem() + "\n and the teacher is " + instructor.toString();

    }

}