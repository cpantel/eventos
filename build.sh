javac -cp lib/xstream-1.4.8.jar:lib/jettison-1.3.3.jar  \
eventos/Evento.java \
eventos/Eventos.java \
eventos/Conversor.java \
eventos/ListaEventos.java \
||  exit 1

jar -cvfm eventos.jar MANIFEST.MF eventos/*.class
