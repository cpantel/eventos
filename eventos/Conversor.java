package eventos;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class Conversor {
    public Eventos load(String data) {
        XStream xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.setMode(XStream.NO_REFERENCES);

        xstream.processAnnotations(Evento.class);
        xstream.processAnnotations(Eventos.class);

        return (Eventos) xstream.fromXML(data);
    }
}

