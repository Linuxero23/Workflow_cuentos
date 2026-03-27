package app;

import java.io.IOException;
import java.util.Scanner;

import model.Cuento;
import util.ArchivoUtil;
import workflow.EtapaCuento;
import workflow.WorkflowCuento;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuento cuento = new Cuento();
        WorkflowCuento workflow = new WorkflowCuento();

        try {
            mostrarBienvenida();
            solicitarTitulo(scanner, cuento);

            while (!workflow.estaFinalizado()) {
                mostrarEtapaActual(workflow.getEtapaActual());
                capturarInformacionDeEtapa(scanner, cuento, workflow.getEtapaActual());
                workflow.avanzarEtapa();
            }

            System.out.println();
            System.out.println("Workflow completado con exito.");
            cuento.mostrarCuento();

            String rutaArchivo = ArchivoUtil.guardarCuentoEnArchivo(cuento);
            System.out.println("El cuento se guardo en: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("No fue posible guardar el cuento en archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void mostrarBienvenida() {
        System.out.println("========================================");
        System.out.println("          BIENVENIDO A STORYFLOW        ");
        System.out.println("========================================");
        System.out.println("Crea tu cuento paso a paso desde la consola.");
        System.out.println();
    }

    private static void solicitarTitulo(Scanner scanner, Cuento cuento) {
        String titulo = leerCampoNoVacio(scanner, "Ingresa el titulo del cuento: ");
        cuento.setTitulo(titulo);
    }

    private static void mostrarEtapaActual(EtapaCuento etapa) {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Etapa actual: " + etapa);
        System.out.println("----------------------------------------");
    }

    private static void capturarInformacionDeEtapa(Scanner scanner, Cuento cuento, EtapaCuento etapaActual) {
        switch (etapaActual) {
            case IDEA:
                cuento.setIdeaPrincipal(leerCampoNoVacio(scanner,
                        "Escribe la idea principal del cuento: "));
                break;
            case PERSONAJES:
                cuento.setPersonajes(leerCampoNoVacio(scanner,
                        "Describe los personajes principales: "));
                break;
            case ESCENARIO:
                cuento.setEscenario(leerCampoNoVacio(scanner,
                        "Describe el escenario donde sucede la historia: "));
                break;
            case INICIO:
                cuento.setInicio(leerCampoNoVacio(scanner,
                        "Escribe como inicia la historia: "));
                break;
            case CONFLICTO:
                cuento.setConflicto(leerCampoNoVacio(scanner,
                        "Escribe el conflicto principal: "));
                break;
            case DESENLACE:
                cuento.setDesenlace(leerCampoNoVacio(scanner,
                        "Escribe el desenlace del cuento: "));
                break;
            case FINALIZADO:
                break;
            default:
                throw new IllegalStateException("Etapa no reconocida.");
        }
    }

    private static String leerCampoNoVacio(Scanner scanner, String mensaje) {
        String valor;

        do {
            System.out.print(mensaje);
            valor = scanner.nextLine().trim();

            if (valor.isEmpty()) {
                System.out.println("El campo no puede estar vacio. Intenta nuevamente.");
            }
        } while (valor.isEmpty());

        return valor;
    }
}
