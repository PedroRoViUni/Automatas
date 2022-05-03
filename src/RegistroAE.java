public class RegistroAE{

	private String AE = "";
	private String Nombre_latino = "";
	private String Familia = "";
	private String Procedencia = "";
	private String Extraccion = "";
	private String Descripcion_olfativa = "";
	private String Apariencia = "";
	private String Nota_de_Perfume = "";
	private String Perfume = "";
	private String Soluble_en = "";
	private String Indisoluble_en = "";
	private String Descripcion = "";
	private String Usos_generales = "";
	private String Propiedades = "";
	private String Beneficios_Aromaterapeuticos = "";
	private String Sinergia = "";
	private String Precauciones = "";
	private String Contraindicaciones = "";
	private String Uso = "";
	
	public String getAE(){
		return(AE);
	}
	public void setAE(String c){
		AE = c;
	}
	public String getNombre_latino(){
		return(Nombre_latino);
	}
	public void setNombre_latino(String c){
		Nombre_latino = c;
	}
	public String getFamilia(){
		return(Familia);
	}
	public void setFamilia(String c){
		Familia = c;
	}
	public String getProcedencia(){
		return(Procedencia);
	}
	public void setProcedencia(String c){
		Procedencia = c;
	}
	public String getExtraccion(){
		return(Extraccion);
	}
	public void setExtraccion(String c){
		Extraccion = c;
	}
	public String getDescripcion_olfativa(){
		return(Descripcion_olfativa);
	}
	public void setDescripcion_olfativa(String c){
		Descripcion_olfativa = c;
	}
	public String getApariencia(){
		return(Apariencia);
	}
	public void setApariencia(String c){
		Apariencia = c;
	}
	public String getNota_de_Perfume(){
		return(Nota_de_Perfume);
	}
	public void setNota_de_Perfume(String c){
		Nota_de_Perfume = c;
	}
	public String getPerfume(){
		return(Perfume);
	}
	public void setPerfume(String c){
		Perfume = c;
	}
	public String getSoluble_en(){
		return(Soluble_en);
	}
	public void setSoluble_en(String c){
		Soluble_en = c;
	}
	public String getIndisoluble_en(){
		return(Indisoluble_en);
	}
	public void setIndisoluble_en(String c){
		Indisoluble_en = c;
	}
	public String getDescripcion(){
		return(Descripcion);
	}
	public void setDescripcion(String c){
		Descripcion = c;
	}
	public String getUsos_generales(){
		return(Usos_generales);
	}
	public void setUsos_generales(String c){
		Usos_generales = c;
	}
	public String getPropiedades(){
		return(Propiedades);
	}
	public void setPropiedades(String c){
		Propiedades = c;
	}
	public String getBeneficios_Aromaterapeuticos(){
		return(Beneficios_Aromaterapeuticos);
	}
	public void setBeneficios_Aromaterapeuticos(String c){
		Beneficios_Aromaterapeuticos = c;
	}
	public String getSinergia(){
		return(Sinergia);
	}
	public void setSinergia(String c){
		Sinergia = c;
	}
	public String getPrecauciones(){
		return(Precauciones);
	}
	public void setPrecauciones(String c){
		Precauciones = c;
	}
	public String getContraindicaciones(){
		return(Contraindicaciones);
	}
	public void setContraindicaciones(String c){
		Contraindicaciones = c;
	}
	public String getUso(){
		return(Uso);
	}
	public void setUso(String c){
		Uso = c;
	}
	@Override
	public String toString(){
		return "\nAE: "  + getAE() + "\nNombre_latino: "  + getNombre_latino() + "\nFamilia: "  + getFamilia() + "\nProcedencia: "  + getProcedencia() + "\nExtraccion: "  + getExtraccion() + "\nDescripcion_olfativa: "  + getDescripcion_olfativa() + "\nApariencia: "  + getApariencia() + "\nNota_de_Perfume: "  + getNota_de_Perfume() + "\nPerfume: "  + getPerfume() + "\nSoluble_en: "  + getSoluble_en() + "\nIndisoluble_en: "  + getIndisoluble_en() + "\nDescripcion: "  + getDescripcion() + "\nUsos_generales: "  + getUsos_generales() + "\nPropiedades: "  + getPropiedades() + "\nBeneficios_Aromaterapeuticos: "  + getBeneficios_Aromaterapeuticos() + "\nSinergia: "  + getSinergia() + "\nPrecauciones: "  + getPrecauciones() + "\nContraindicaciones: "  + getContraindicaciones() + "\nUso: "  + getUso();
	}
}