package challenge;

// MegaBytes Converter
public class Challenge5 {
  static void main() {
    printMegaBytesAndKiloBytes(-1);
    printMegaBytesAndKiloBytes(0);
    printMegaBytesAndKiloBytes(1024);
    printMegaBytesAndKiloBytes(2048);
    printMegaBytesAndKiloBytes(4096);
    printMegaBytesAndKiloBytes(2056);
  }

  static void printMegaBytesAndKiloBytes(int kiloBytes) {
    int megaBytes = kiloBytes / 1024;
    int remainingKiloBytes = kiloBytes % 1024 ;
    System.out.println(
        kiloBytes < 0 ? "Invalid Value" : (kiloBytes + " KB = " + megaBytes + " MB and " +
            remainingKiloBytes + " KB")
    );
  }
}
