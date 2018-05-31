package ReaderAndWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.OutputStream;

public class XmlHandlerWriter implements AutoCloseable{
    private final Logger logger = LoggerFactory.getLogger(XmlHandlerWriter.class);
    private final XMLOutputFactory FACTORY = XMLOutputFactory.newInstance();
    private final XMLEventWriter writer;

    public XmlHandlerWriter(OutputStream os) throws XMLStreamException {
        writer = FACTORY.createXMLEventWriter(os);
    }

    public XMLEventWriter getReader() {
        return writer;
    }

    @Override
    public void close() {
        if (writer != null) {
            try {
                writer.close();
            } catch (XMLStreamException e){
                logger.error("FAILED", e);
            }
        }
    }
}
