package ReaderAndWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.InputStream;

public class XmlHandlerReader implements AutoCloseable{
    private final Logger logger = LoggerFactory.getLogger(XmlHandlerReader.class);
    private final XMLInputFactory FACTORY = XMLInputFactory.newInstance();
    private final XMLEventReader reader;

    public XmlHandlerReader(InputStream is) throws XMLStreamException {
        reader = FACTORY.createXMLEventReader(is);
    }

    public XMLEventReader getReader() {
        return reader;
    }

    @Override
    public void close() {
        if (reader != null) {
            try {
                reader.close();
            } catch (XMLStreamException e){
                logger.error("FAILED", e);
            }
        }
    }
}
