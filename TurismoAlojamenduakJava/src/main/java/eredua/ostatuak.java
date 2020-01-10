package eredua;
import javax.persistence.*;





@Entity
@Table(name = "ostatuak")
public class ostatuak {
	
	

	private String ID_SIGNATURA;
	private String OSTATU_IZENA;
	private String DESKRIBAPENA;
	private String OSTATU_HELBIDEA;
	private String MARKA;
	private String OSTATU_EMAIL;
	private String OSTATU_TELEFONOA;
	private int PERTSONA_TOT;
	private double LATITUDE;
	private double LONGITUDE;
	private String MOTA ;
 	private String WEB_URL;
 	private String ADISKIDETSU_URL;
 	private String ZIP_URL;
 	private int POSTA_KODEA ;
 	private String HERRI_KODEA;
 	
 	
 
 	
 	
 	
 	
 	
 	
 	
 
	public ostatuak() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name = "ID_SIGNATURA")
	public String getID_SIGNATURA() {
		return ID_SIGNATURA;
	}

	public void setID_SIGNATURA(String iD_SIGNATURA) {
		ID_SIGNATURA = iD_SIGNATURA;
	}

	public String getOSTATU_IZENA() {
		return OSTATU_IZENA;
	}

	public void setOSTATU_IZENA(String oSTATU_IZENA) {
		OSTATU_IZENA = oSTATU_IZENA;
	}

	public String getDESKRIBAPENA() {
		return DESKRIBAPENA;
	}

	public void setDESKRIBAPENA(String dESKRIBAPENA) {
		DESKRIBAPENA = dESKRIBAPENA;
	}

	public String getOSTATU_HELBIDEA() {
		return OSTATU_HELBIDEA;
	}

	public void setOSTATU_HELBIDEA(String oSTATU_HELBIDEA) {
		OSTATU_HELBIDEA = oSTATU_HELBIDEA;
	}

	public String getMARKA() {
		return MARKA;
	}

	public void setMARKA(String mARKA) {
		MARKA = mARKA;
	}

	public String getOSTATU_EMAIL() {
		return OSTATU_EMAIL;
	}

	public void setOSTATU_EMAIL(String oSTATU_EMAIL) {
		OSTATU_EMAIL = oSTATU_EMAIL;
	}

	public String getOSTATU_TELEFONOA() {
		return OSTATU_TELEFONOA;
	}

	public void setOSTATU_TELEFONOA(String oSTATU_TELEFONOA) {
		OSTATU_TELEFONOA = oSTATU_TELEFONOA;
	}

	public int getPERTSONA_TOT() {
		return PERTSONA_TOT;
	}

	public void setPERTSONA_TOT(int pERTSONA_TOT) {
		PERTSONA_TOT = pERTSONA_TOT;
	}

	public double getLATITUDE() {
		return LATITUDE;
	}

	public void setLATITUDE(double lATITUDE) {
		LATITUDE = lATITUDE;
	}

	public double getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(double lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}

	public String getMOTA() {
		return MOTA;
	}

	public void setMOTA(String mOTA) {
		MOTA = mOTA;
	}

	public String getWEB_URL() {
		return WEB_URL;
	}

	public void setWEB_URL(String wEB_URL) {
		WEB_URL = wEB_URL;
	}

	public String getADISKIDETSU_URL() {
		return ADISKIDETSU_URL;
	}

	public void setADISKIDETSU_URL(String aDISKIDETSU_URL) {
		ADISKIDETSU_URL = aDISKIDETSU_URL;
	}

	public String getZIP_URL() {
		return ZIP_URL;
	}

	public void setZIP_URL(String zIP_URL) {
		ZIP_URL = zIP_URL;
	}

	public int getPOSTA_KODEA() {
		return POSTA_KODEA;
	}

	public void setPOSTA_KODEA(int pOSTA_KODEA) {
		POSTA_KODEA = pOSTA_KODEA;
	}
	public String getHERRI_KODEA() {
		return HERRI_KODEA;
	}
	public void setHERRI_KODEA(String hERRI_KODEA) {
		HERRI_KODEA = hERRI_KODEA;
	}

	@Override
	public String toString() {
		return "ostatuak [ID_SIGNATURA=" + ID_SIGNATURA + ", OSTATU_IZENA=" + OSTATU_IZENA + ", DESKRIBAPENA="
				+ DESKRIBAPENA + ", OSTATU_HELBIDEA=" + OSTATU_HELBIDEA + ", MARKA=" + MARKA + ", OSTATU_EMAIL="
				+ OSTATU_EMAIL + ", OSTATU_TELEFONOA=" + OSTATU_TELEFONOA + ", PERTSONA_TOT=" + PERTSONA_TOT
				+ ", LATITUDE=" + LATITUDE + ", LONGITUDE=" + LONGITUDE + ", MOTA=" + MOTA + ", WEB_URL=" + WEB_URL
				+ ", ADISKIDETSU_URL=" + ADISKIDETSU_URL + ", ZIP_URL=" + ZIP_URL + ", POSTA_KODEA=" + POSTA_KODEA
				+ ", HERRI_KODEA=" + HERRI_KODEA + "]";
	}


 	
 	
 	
 	
 	
}
