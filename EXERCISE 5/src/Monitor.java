class Monitor {
    private VGA vga;

    public Monitor(VGA vga) {
        this.vga = vga;
    }

    public void display(){
        System.out.println("Monitor expecting VGA Port...");
        vga.connectWithVGA();
        System.out.println("Monitor Connected.");
    }
}