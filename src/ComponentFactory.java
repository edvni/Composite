interface ComponentFactory {
    ComponentBasic createCPU();
    ComponentBasic createRAM();
    ComponentBasic createSSD();
    CompositeComponent createMotherboard();
    CompositeComponent createComputerCase();

}
