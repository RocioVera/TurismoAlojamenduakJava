package kontroladorea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import net.codejava.hibernate.*;
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
 	
 	public List<ostatuak> zerrenda;
   
	
	
	public void datuakKargatuAterpe() throws IOException {
		 
		try {

			URL url = new URL("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/albergues_de_euskadi/opendata/alojamientos.xml");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String entrada;
			String cadena = "";
			zerrenda= new ArrayList();

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
		
		ostatuManager ost =  new ostatuManager();
		
		for(ostatuak ostatu : zerrenda) {
			try {
				ost.main(ostatu);
			}catch(Exception e) {
				System.out.println(ostatu);
			}
			
			
		}
		
		
		

		
			
		 
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
		
		try {

			URL url = new URL("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/alojamientos_rurales_euskadi/opendata/ostatuak.xml");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void addElement(Element primerElemento) throws SAXException {
		String tags[] = {"signatura","documentname","turismdescription","address","marks",
	    	       "tourismemail","phone","capacity","latwgs84","lonwgs84","lodgingtype","web","friendlyurl","zipfile","postalcode","municipalitycode"};
		String obtenido="";
		ostatuak osi =  new ostatuak();
		for(int s = 0; s < tags.length; s++) {
			try {
				obtenido = primerElemento.getElementsByTagName(tags[s]).item(0).getTextContent();
			}catch(Exception e) {
				obtenido="";
			}
			
	        switch (s) {
	            case 0:
	            	osi.setID_SIGNATURA(obtenido);
	                break;
	            case 1:
	            	osi.setOSTATU_IZENA(obtenido);
	                break;
	            case 2:
	            	osi.setDESKRIBAPENA(obtenido);
	                break;
	            case 3:
	            	osi.setOSTATU_HELBIDEA(obtenido);
	                break;
	            case 4:
	            	osi.setMARKA(obtenido);
	                break;
	            case 5:
	            	osi.setOSTATU_EMAIL(obtenido);
	                break;
	            case 6:
	                osi.setOSTATU_TELEFONOA(obtenido);
	                break;
	            case 7:
	            	osi.setPERTSONA_TOT(Integer.parseInt(obtenido));
	                break;
	            case 8:
	            	try {
	               osi.setLATITUDE(Double.parseDouble(obtenido));
	            	}catch(Exception o){
	            		osi.setLATITUDE(0.0);
	               }
	            	
	                break;
	            case 9:
	            	try {
	                osi.setLONGITUDE(Double.parseDouble(obtenido));
	            	}catch(Exception l) {
	            		osi.setLATITUDE(0.0);
	            	}
	                break;
	            case 10:
	            	osi.setMOTA(obtenido);
	                break;
	            case 11:
	                osi.setWEB_URL(obtenido);
	                break;
	            case 12:
	                osi.setADISKIDETSU_URL(obtenido);
	                break;
	            case 13:
	            	osi.setZIP_URL(obtenido);
	                break;
	            case 14:
	            	try {
	                osi.setPOSTA_KODEA(Integer.parseInt(obtenido));
	            	}catch(Exception kk) {
	            		osi.setPOSTA_KODEA(1000);
	            		osi.setHERRI_KODEA("000");
	            		s=s+2;
	            		
	            	}
	            	
	                break;
	            case 15:
	                osi.setHERRI_KODEA(obtenido);
	                break;
	            case 16:
	            	
	            	break;                   
	            default:
	                break;
			
			
		}}
		
		zerrenda.add(osi);
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void nireP1(P1 p1) {
		this.p1 = p1;

	}




























































	




























































	
}
