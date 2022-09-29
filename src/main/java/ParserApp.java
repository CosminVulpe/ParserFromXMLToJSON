import com.fasterxml.jackson.databind.ObjectMapper;
import model.PurchaseOrder;
import util.ReadConfigProperties;

import javax.xml.bind.JAXB;
import java.io.File;
import java.io.IOException;

public class ParserApp {
    public static void main(String[] args) throws IOException {
        final String inputPath = ReadConfigProperties.readConfigProperties("inputPathFile");
        final String outputPath = ReadConfigProperties.readConfigProperties("outputPathFile");

        File inputFile = new File(inputPath.concat("PurchaseOrders.xml"));
        PurchaseOrder purchaseOrder = JAXB.unmarshal(inputFile, PurchaseOrder.class);


        ObjectMapper objectMapper = new ObjectMapper();
        File outputFile = new File(outputPath.concat("temp.json"));
        objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValue(outputFile, purchaseOrder);
    }
}
