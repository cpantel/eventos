package eventos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 

class ListaEventos {

    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
         try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
    
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    public static void main(String [] args) throws Exception {
        Conversor conversor = new Conversor();
        String data = readFile("data.json");

        Eventos eventos = conversor.load(data);
        for (Evento evento: eventos.eventos) {
            if (! "".equals(evento.nombre) ) {
              System.out.println("<h3>" + evento.nombre + "</h3>");
              if (!"".equals(evento.fecha)) { System.out.println("Fecha: " + evento.fecha + "<br/>"); }
              if (!"".equals(evento.horario)) { System.out.println("Horario: " + evento.horario + "<br/>"); }
              if (!"".equals(evento.ubicacion)) { System.out.println("Ubicaci&oacute;n: " + evento.ubicacion + "<br/>"); }
              if (!"".equals(evento.pago)) { System.out.println("Costo: " + evento.pago + "<br/>"); }
              if (!"".equals(evento.link)) { System.out.println("Link: " + evento.link + "<br/>"); }
              if (!"".equals(evento.descripcion)) { System.out.println("Descripci&oacute;n: " + evento.descripcion + "<br/>"); }
              if (!"".equals(evento.opinion) && evento.opinion != null ) {
                 System.out.println("<a href=\"" + evento.opinion + "\">Opini&oacute;n</a><br/>");
              }
              System.out.println("<hr/>");
            }

        }
    }
}

