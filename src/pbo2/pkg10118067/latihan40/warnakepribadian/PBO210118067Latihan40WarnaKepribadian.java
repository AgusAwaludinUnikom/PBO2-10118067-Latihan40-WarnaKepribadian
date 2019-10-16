/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * Agus Awaludin
 * 10118067
 * PBO2
 * Latihan ini berisi tentang bagaimana menampilkan kepribadian dari
 * warna yang user pilih
 */
public class PBO210118067Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warna warna = new Warna();
        User user = new User();
        
        System.out.printf("%sYUK %sCEK %sKEPRIBADIANMU %sDARI "
            + "%sWARNA %sFAVORITMU",
            Warna.RED, Warna.GREEN, Warna.YELLOW, Warna.CYAN, Warna.MAGENTA,
            Warna.BLUE
        );
        System.out.println();
        System.out.println();
        System.out.printf("%s\tMERAH\t\t%n", (Warna.BG_RED + Warna.WHITE));
        System.out.printf("%s\tHIJAU\t\t%n", (Warna.BG_GREEN + Warna.WHITE));
        System.out.printf("%s\tKUNING\t\t%n", (Warna.BG_YELLOW + Warna.WHITE));
        System.out.printf("%s\tBIRU\t\t%n", (Warna.BG_BLUE + Warna.WHITE));
        System.out.printf("%s\tUNGU\t\t%n", (Warna.BG_MAGENTA + Warna.WHITE));
        
        System.out.println();
        System.out.print(Warna.RESET+"PILIH WARNA FAVORITMU : ");
        user.setWarna(scanner.next().toUpperCase());
        System.out.print("NAMA KAMU : ");
        user.setNama(scanner.next().toUpperCase());
        
        System.out.println();
        System.out.println("===HASIL TEST KEPRIBADIAN "
            + user.getNama() + "===");
        warna.tampilkanKepribadian(user.getWarna());
    }
    
}
