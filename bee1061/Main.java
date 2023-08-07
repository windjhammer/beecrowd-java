package bee1061;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        String[] stringDiaInicial = sc.nextLine().split(" ");
        String[] stringHoraInicial = sc.nextLine().replaceAll(" ", "").split(":");
        String[] stringDiaFinal = sc.nextLine().split(" ");
        String[] stringHoraFinal = sc.nextLine().replaceAll(" ", "").split(":");
        int diaInicial = Integer.parseInt(stringDiaInicial[1]);
        int horaInicial = Integer.parseInt(stringHoraInicial[0]);
        int minutoInicial = Integer.parseInt(stringHoraInicial[1]);
        int segundoInicial = Integer.parseInt(stringHoraInicial[2]);
        int diaFinal = Integer.parseInt(stringDiaFinal[1]);
        int horaFinal = Integer.parseInt(stringHoraFinal[0]);
        int minutoFinal = Integer.parseInt(stringHoraFinal[1]);
        int segundoFinal = Integer.parseInt(stringHoraFinal[2]);
        if (segundoFinal < segundoInicial) {
            segundos += (60 - segundoInicial) + segundoFinal;
            minutos--;
        } else if (segundoFinal > segundoInicial) {
            segundos += segundoFinal - segundoInicial;
        } else {
            segundos = 0;
        }
        if (minutoFinal < minutoInicial) {
            minutos += (60 - minutoInicial) + minutoFinal;
            horas--;
        } else if (minutoFinal > minutoInicial) {
            minutos += minutoFinal - minutoInicial;
        } else {
            minutos = 0;
        }
        if (horaFinal < horaInicial) {
            horas += (24 - horaInicial) + horaFinal;
            dias--;
        } else if (horaFinal > horaInicial) {
            horas += horaFinal - horaInicial;
        } else {
            horas = 0;
        }
        if (diaFinal < diaInicial) {
            dias += (30 - diaInicial) + diaFinal;
        } else if (diaFinal > diaInicial) {
            dias += diaFinal - diaInicial;
        } else {
            dias = 0;
        }
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
        sc.close();
    }
}