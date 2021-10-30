public class tulipan extends planta{
	String	LUZ;
	int	ABO;


public tulipan(String D, int E, int L, String LUZ, int ABO)
{
	super(D,E,L);
	this.LUZ = LUZ;
	this.ABO = ABO;
}
public void mostrarT(int pos, String tex)
{
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(pos, tex);
	super.mostrar(10, "PLANTA DE TIPO TULIPAN");
	MCursor.TCen(pos, "     TIPO DE LUZ: ["+LUZ+" ]");
	MCursor.TCen(pos, "   ABANO CADA N° DE DIAS: ["+ABO+" ]");
	MCursor.TCen(10, "============================================================");
}
}