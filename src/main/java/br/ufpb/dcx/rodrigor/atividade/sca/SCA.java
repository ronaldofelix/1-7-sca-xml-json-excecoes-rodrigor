package br.ufpb.dcx.rodrigor.atividade.sca;

import java.util.Scanner;

import br.ufpb.dcx.rodrigor.atividade.sca.persistencia.json.GerenciadorAlunosJSON;
import br.ufpb.dcx.rodrigor.atividade.sca.persistencia.xml.GerenciadorAlunosXML;
import br.ufpb.dcx.rodrigor.atividade.sca.text_ui.MenusTexto;

public class SCA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de arquivo que deseja criar (JSON ou XML):");
        String tipoArquivo = scanner.nextLine();

        if (tipoArquivo.equalsIgnoreCase("JSON")) {
            new MenusTexto(new GerenciadorAlunosJSON("alunos.json")).exibirMenu();
        } else if (tipoArquivo.equalsIgnoreCase("XML")) {
            new MenusTexto(new GerenciadorAlunosXML("alunos.xml")).exibirMenu();
        } else {
            System.out.println("Tipo de arquivo inválido.");
        }
        scanner.close();

    }
}
