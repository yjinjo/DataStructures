package Inheritance;

public class Computer {
    public String manufacturer;
    public String processor;
    public int ramSize;
    public int diskSize;
    public double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = processorSpeed;
    }

    public double computerPower() {
        return ramSize * processorSpeed;
    }

    public double getRamsize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public String toString() {
        String result = "Manufacturer: " + manufacturer +
                "\nCPU: " + processor +
                "\nRAM: "  + ramSize + " megabytes" +
                "\nDisk: " + diskSize + " gigabytes" +
                "\nProcessor speed: " + processorSpeed + " gigahertz";
        return result;
    }
}
