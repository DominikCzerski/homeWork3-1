package homeWork_10.komputerZPodzespolami;

public class ComputerTest {

    public static void main(String[] args) {
        Processor processor = new Processor("i7", "Intel", "2314A334FS", 60, 100);
        HardDrive hardDrive = new HardDrive("SSD", "WD", "A234342SD", 50, 70);
        Memory memory = new Memory("DDR4", "HyperX", "2132SSW2", 40, 80, 4096);
        Computer computer = new Computer(processor, memory, hardDrive);
        computer.getProcessor().increaseSpeed(200);
        System.out.println(computer.getProcessor());
        computer.getProcessor().increaseSpeed(400);
        computer.getMemory().increaseSpeed(200);
        System.out.println(computer.getMemory());


    }
}
