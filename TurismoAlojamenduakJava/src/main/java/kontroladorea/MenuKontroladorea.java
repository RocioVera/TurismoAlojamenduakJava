package kontroladorea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import eredua.ostatuak;
import ikuspegia.P1;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.InputSource;

public class MenuKontroladorea {
	private P1 p1;
	private String ID_SIGNATURA_Tag;
	private String OSTATU_IZENA_Tag;
	private String DESKRIBAPENA_Tag;
	private String OSTATU_HELBIDEA_Tag;
	private String MARKA_Tag;
	private String OSTATU_EMAIL_Tag;
	private String OSTATU_TELEFONOA_Tag;
	private int PERTSONA_TOT_Tag;
	private double LATITUDE_Tag;
	private double LONGITUDE_Tag;
	private String MOTA_Tag;
 	private String WEB_Tag;
 	private String ADISKIDETSU_Tag;
 	private String ZIP_Tag;
 	private int POSTA_KODEA_Tag;
 	private String HERRI_KODEA_Tag;
 	ostatuak osi =  new ostatuak();
 	ArrayList<ostatuak> zerrenda;
   
	
	
	public void datuakKargatuAterpe() throws IOException {
		 
		try {

			URL url = new URL("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/albergues_de_euskadi/opendata/alojamientos.xml");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String entrada;
			String cadena = "";

			while ((entrada = br.readLine()) != null) {
				cadena = cadena + entrada;
			}

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			InputSource archivo = new InputSource();
			archivo.setCharacterStream(new StringReader(cadena));

			Document documento = db.parse(archivo);
			documento.getDocumentElement().normalize();

			NodeList nodeLista = documento.getElementsByTagName("row");
//			System.out.println("Informacion de los libros");
			zerrenda = new ArrayList<>();
			for (int s = 0; s < nodeLista.getLength(); s++) {

				Node primerNodo = nodeLista.item(s);

				if (primerNodo.getNodeType() == Node.ELEMENT_NODE) {

					Element primerElemento = (Element) primerNodo;
					//System.out.println(primerElemento.getElementsByTagName("signatura").item(0).getTextContent());
//					NodeList primerNombreElementoLista = primerElemento.getElementsByTagName("signatura");
//					Element primerNombreElemento = (Element) primerNombreElementoLista.item(0);
//					NodeList primerNombre = primerNombreElemento.getChildNodes();
//					titulo = ((Node) primerNombre.item(0)).getNodeValue().toString();
//					System.out.println(titulo);
					
					addElement(primerElemento);
						
						
					

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
//		try {
//			   URL url = new URL("https://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/hoteles_de_euskadi/opendata/alojamientos.json");
//			   JsonFactory factory = new JsonFactory();
//			   JsonParser parser = factory.createParser(url);
////			   URLConnection urlCon = url.openConnection();
////			   InputStream is = url.openStream();
////			   JsonReader rdr = Json.createReader(is);
////			   JsonObject obj = rdr.readObject();
////			   JsonArray results = obj.getJsonArray("data");
////			   InputStream is = url.openStream();
////			   javax.json.stream.JsonParser parser = Json.createParser(is);
//			   while (!parser.isClosed()) {
//			        // leer el elemento
//			        JsonToken token = parser.nextToken();
//			        // si la llamada a nextToken devuelve null, se ha alcanzado el final del fichero
//			        if (token == null)
//			            break;
//			 
//			        // Procesar el elemento leido
//			         String margen = "";
////			         procesaValorJSON(token, parser, margen);
//			    }
//				      
//			} catch (Exception e) {
//			   System.out.println(e.getMessage());
//			}
		
			
		 
	}
	
	
	public void datuakKargatuKanpin() throws IOException {
		try {

			URL url = new URL("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/campings_de_euskadi/opendata/ostatuak.xml");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String entrada;
			String cadena = "";

			while ((entrada = br.readLine()) != null) {
				cadena = cadena + entrada;
			}

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			InputSource archivo = new InputSource();
			archivo.setCharacterStream(new StringReader(cadena));

			Document documento = db.parse(archivo);
			documento.getDocumentElement().normalize();

			NodeList nodeLista = documento.getElementsByTagName("row");
//			System.out.println("Informacion de los libros");
			zerrenda = new ArrayList<>();
			for (int s = 0; s < nodeLista.getLength(); s++) {

				Node primerNodo = nodeLista.item(s);

				if (primerNodo.getNodeType() == Node.ELEMENT_NODE) {

					Element primerElemento = (Element) primerNodo;
					
					addElement(primerElemento);
						
						
					

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void datuakKargatuOstatu() throws IOException{
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void addElement(Element primerElemento) throws SAXException {
		String tags[] = {"signatura","documentname","turismdescription","address","marks",
	    	       "tourismemail","phone","capacity","latwgs84","lonwgs84","lodgingtype","web","friendlyurl","zipfile","postalcode","territorycode","object"};
		String obtenido="";
		for(int s = 0; s < tags.length; s++) {
			try {
				obtenido = primerElemento.getElementsByTagName(tags[s]).item(0).getTextContent();
			}catch(Exception e) {
				obtenido="";
			}
			
	        switch (tags[s]) {
	            case "signatura":
	            	osi.setID_SIGNATURA(obtenido);
	                break;
	            case "documentname":
	            	osi.setOSTATU_IZENA(obtenido);
	                break;
	            case "turismdescription":
	            	osi.setDESKRIBAPENA(obtenido);
	                break;
	            case "address":
	            	osi.setOSTATU_HELBIDEA(obtenido);
	                break;
	            case "marks":
	            	osi.setMARKA(obtenido);
	                break;
	            case "tourismemail":
	            	osi.setOSTATU_EMAIL(obtenido);
	                break;
	            case "phone":
	                osi.setOSTATU_TELEFONOA(obtenido);
	                break;
	            case "capacity":
	            	osi.setPERTSONA_TOT(Integer.parseInt(obtenido));
	                break;
	            case "latwgs84":
	               osi.setLATITUDE(Double.parseDouble(obtenido));
	                break;
	            case "lonwgs84":
	                osi.setLONGITUDE(Double.parseDouble(obtenido));
	                break;
	            case "lodgingtype":
	            	osi.setMOTA(obtenido);
	                break;
	            case "web":
	                osi.setWEB_URL(obtenido);
	                break;
	            case "friendlyurl":
	                osi.setADISKIDETSU_URL(obtenido);
	                break;
	            case "zipfile":
	            	osi.setZIP_URL(obtenido);
	                break;
	            case "postalcode":
	                osi.setPOSTA_KODEA(Integer.parseInt(obtenido));
	                break;
	            case "territorycode":
	                osi.setHERRI_KODEA(obtenido);
	                break;
	            case "object":
	            	zerrenda.add(osi);
	            	break;                   
	            default:
	                break;
			
			
		}}
		
		
	
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void nireP1(P1 p1) {
		this.p1 = p1;

	}




























































	




























































	
}
