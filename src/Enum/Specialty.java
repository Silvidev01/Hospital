package Enum;

public enum Specialty {
    TRAU ("Traumatology"),
    CARD ("Cardiology"),
    INT_MED ("Internal Medicine"), DERM ("Dermatology"), PSY ("Psychiatry"),
    NEU ("Neurology"), OPH("Ophtalmology"),   GAST("Gastroenterology"),
    GEN_SUR("General Surgery"),
    RAD("Radiology"),
    OTHO("Othorinolaryngology");
    private final String specialtyname;
    private Specialty(String specialtyname) {this.specialtyname=specialtyname;}
    public String getSpecialtyname(){
return specialtyname;

}
    @Override
    public String toString() { return specialtyname; }
}