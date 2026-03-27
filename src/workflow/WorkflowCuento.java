package workflow;

public class WorkflowCuento {
    private EtapaCuento etapaActual;

    public WorkflowCuento() {
        this.etapaActual = EtapaCuento.IDEA;
    }

    public EtapaCuento getEtapaActual() {
        return etapaActual;
    }

    public boolean estaFinalizado() {
        return etapaActual == EtapaCuento.FINALIZADO;
    }

    public void avanzarEtapa() {
        switch (etapaActual) {
            case IDEA:
                etapaActual = EtapaCuento.PERSONAJES;
                break;
            case PERSONAJES:
                etapaActual = EtapaCuento.ESCENARIO;
                break;
            case ESCENARIO:
                etapaActual = EtapaCuento.INICIO;
                break;
            case INICIO:
                etapaActual = EtapaCuento.CONFLICTO;
                break;
            case CONFLICTO:
                etapaActual = EtapaCuento.DESENLACE;
                break;
            case DESENLACE:
                etapaActual = EtapaCuento.FINALIZADO;
                break;
            case FINALIZADO:
                break;
            default:
                throw new IllegalStateException("Etapa no soportada: " + etapaActual);
        }
    }
}
