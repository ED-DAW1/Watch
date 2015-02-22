package daw.ed.uml.watch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author carlos
 */
public class WatchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Watch watch = new Watch();

        try {
            while (true) {
                System.out.print("Press ");
                switch (get_line()) {
                    case "BR":
                        watch.BR();
                        break;
                    case "BA":
                        watch.BA();
                        break;
                    case "BM":
                        watch.BM();
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Watch Function unsupported: "
                    + e.getMessage());
            e.printStackTrace();
        }
    }

    static String get_line() {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }

}
