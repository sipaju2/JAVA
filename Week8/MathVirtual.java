public class MathVirtual extends VirtualClass {

    public MathVirtual(String virtual, Instructor instructor, String problem) {
        super(virtual, instructor);
        this.problem = problem;

    }

    @Override
    public void setVirtualType(String virtual) {
        this.virtualMedia = virtual;
    }

    @Override
    public String getVirttualType() {
        return virtualMedia;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getProblem() {
        return this.problem;
    }

    @Override
    public String toString() {

        return "This is a Math virtual class, it's tought with " + super.getVirttualType()
                + "\ntoday we will be talking about " + getProblem() + "\nand the teacher is " + instructor.toString();

    }

}