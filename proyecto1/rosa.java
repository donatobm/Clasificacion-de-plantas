public class rosa extends planta{
	String	C;
	float	TP;


public rosa(String	D, int E, int L, String C, float TP)
{
	super(D,E,L);
	this.C = C;
	this.TP = TP;
}
public void mostrarR(int pos, String tex)
{
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(pos, tex);
	super.mostrar(10, "PLANTA DE TIPO ROSA");
	MCursor.TCen(pos, "     CLASIFICACION: ["+C+" ]");
	MCursor.TCen(pos, "   TEMPERATURA.M.R: ["+TP+" ]");
	MCursor.TCen(10, "============================================================");
}
}