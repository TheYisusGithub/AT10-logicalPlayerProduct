package main.java.com.fundation.logic;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;

public class main {

    public static void main(String[] arg){
        WSEndpointReference.Metadata metadata = ImageMetadataReader.readMetadata(imagePath);
    }
}
