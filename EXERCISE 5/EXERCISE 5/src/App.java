public class App {
    public static void main(String[] args) throws Exception {
        
        HDMI pcWithHDMI = new HDMI();
        
        VGA adapter = new VGAToHDMI(pcWithHDMI);
        
        Monitor monitor = new Monitor(adapter);
        monitor.display();
    }
}
