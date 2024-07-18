import java.util.*;
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
            System.out.println("Number of Cores: " +no_cores);
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
        int price,no_cores,memory;
        String manufacturer;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the price of the CPU: ");
        price=sc.nextInt();
        CPU cpu=new CPU(price);
        System.out.print("Enter no of cores in the processor: ");
        no_cores =sc.nextInt();
        System.out.print("Enter manufacturer of the processor: ");
        manufacturer =sc.next();

        CPU.Processor processor=cpu.new Processor(no_cores,manufacturer);

        System.out.print("Enter memory capacity of RAM: ");
        memory =sc.nextInt();
        System.out.print("Enter manufacturer of the RAM: ");
        manufacturer =sc.next();
        CPU.RAM ram =new CPU.RAM(memory,manufacturer);

        cpu.display();
        processor.display();
        ram.display();
    }
}