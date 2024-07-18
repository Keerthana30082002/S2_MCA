public class CPU 
{
    double price;
    class Processor 
    {
        int no_cores;
        String manufacturer;

        Processor(int no_cores,String manufacturer)
        {
            this.no_cores=no_cores;
            this.manufacturer=manufacturer;
        }
        void display()
        {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + no_Cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    static class RAM 
    {
        int memory;
        String manufacturer;

        RAM(int memory,String manufacturer)
        {
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void display()
        {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    CPU(double price)
    {
        this.price=price;
    }
    void display() {
        System.out.println("CPU Price: $" + price);
}

    public static void main(String[] args) 
    {
        CPU cpu=new CPU(250.00);
        CPU.Processor processor=cpu.new Processor(8,"Intel");
        CPU.RAM ram =new CPU.RAM(16,"Corsair");

        cpu.display();
        processor.display();
        ram.display();
    }
}