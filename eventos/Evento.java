package eventos;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("evento")
public class Evento {
    String nombre;
    String fecha;
    String descripcion;
    String horario;
    String pago;
    String link;
    String ubicacion;
    String done;
    String rol;
    String opinion;
}
