class VGAToHDMI implements VGA {
    private HDMI hdmi;

    public VGAToHDMI(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void connectWithVGA() {
        System.out.println("Adapting HDMI to VGA...");
        hdmi.connectWithHDMI();
    }
}