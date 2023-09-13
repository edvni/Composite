interface ComponentFactory {
    ComponentBasic createCPU();
    ComponentBasic createRAM();
    ComponentBasic createSSD();
    ComponentBasic createGPU();
    CompositeComponent createMotherboard();
    CompositeComponent createComputerCase();

}
