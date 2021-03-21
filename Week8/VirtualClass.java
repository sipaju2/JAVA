public class VirtualClass {
    public Instructor instructor;
    public String virtualMedia;
    public String problem;

    public VirtualClass(String virtual, Instructor instructor) {
        this.instructor = instructor;
        this.virtualMedia = virtual;
    }

    public void setVirtualType(String virtual) {
        this.virtualMedia = virtual;
    }

    public String getVirttualType() {
        return virtualMedia;
    }

    public String toString() {
        return " This class uses the " + getVirttualType() + "for virtual class";
    }

}
