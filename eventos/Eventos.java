package eventos;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("eventos")
public class Eventos {
    public 
    @XStreamImplicit
    Evento[] eventos;
}
