import java.time.LocalDateTime;

public class Conversion {
    private String monedaParaCambio;
    private String monedaDeConversion;
    private Double valorDeCambio;
    private Double valorConversion;
    private LocalDateTime horaDeLaTransaccion;

    public Conversion(String monedaParaCambio,
                      String monedaDeConversion,
                      double valorDeCambio,
                      double valorConversion) {
        this.monedaParaCambio = monedaParaCambio;
        this.monedaDeConversion = monedaDeConversion;
        this.valorDeCambio = valorDeCambio;
        this.valorConversion = valorConversion;
        this.horaDeLaTransaccion = LocalDateTime.now();
    }

    public String getMonedaParaCambio() {
        return monedaParaCambio;
    }

    public void setMonedaParaCambio(String monedaParaCambio) {
        this.monedaParaCambio = monedaParaCambio;
    }

    public String getMonedaDeConversion() {
        return monedaDeConversion;
    }

    public void setMonedaDeConversion(String monedaDeConversion) {
        this.monedaDeConversion = monedaDeConversion;
    }

    public Double getValorDeCambio() {
        return valorDeCambio;
    }

    public void setValorDeCambio(Double valorDeCambio) {
        this.valorDeCambio = valorDeCambio;
    }

    public Double getValorConversion() {
        return valorConversion;
    }

    public void setValorConversion(Double valorConversion) {
        this.valorConversion = valorConversion;
    }

    public LocalDateTime getHoraDeLaTransaccion() {
        return horaDeLaTransaccion;
    }

    public void setHoraDeLaTransaccion(LocalDateTime horaDeLaTransaccion) {
        this.horaDeLaTransaccion = horaDeLaTransaccion;
    }
}
