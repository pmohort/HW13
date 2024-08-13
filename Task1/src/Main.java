//import calc.ArithmeticCalculator;
//import calc.Operation;

import comp.Computer;
import comp.harddisc.HardDisc;
import comp.harddisc.HardDiscType;
import comp.keyboard.Illuminate;
import comp.keyboard.Keyboard;
import comp.keyboard.KeyboardType;
import comp.memory.Memory;
import comp.memory.MemoryType;
import comp.monitor.Monitor;
import comp.monitor.MonitorType;
import comp.processor.CoreCount;
import comp.processor.Creator;
import comp.processor.Frequency;
import comp.processor.Processor;

public class Main {
    public static void main(String[] args) {
//        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5, 2);
//        arithmeticCalculator.calculate(Operation.SUBTRACT);
        Processor processor = new Processor(Frequency.TWO_THOUSAND, CoreCount.ONE, Creator.AMD, 500);
        Memory memory = new Memory(MemoryType.DDR2, 16, 500);
        HardDisc hardDisc = new HardDisc(HardDiscType.HDD, 500, 500);
        Monitor monitor = new Monitor(17, MonitorType.IPS, 500);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS, Illuminate.YES, 500);

        Computer computer = new Computer(processor, memory, hardDisc, monitor, keyboard, "INTEL", "ROBOT");
        System.out.println(computer.getWeight());

    }
}