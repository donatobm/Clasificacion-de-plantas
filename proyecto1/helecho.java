public class helecho extends planta{
	String	T;
	String U;


public helecho(String	D, int E, int L, String T, String U)
{
	super(D,E,L);
	this.T = T;
	this.U = U;
}
public void mostrarH(int pos, String tex)
{
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(pos, tex);
	super.mostrar(10, "PLANTA DE TIPO HELECHO");
	MCursor.TCen(pos, "     		 TIPO: ["+T+" ]");
	MCursor.TCen(pos, "         UBICACION: ["+U+" ]");
	MCursor.TCen(10, "============================================================");
}
}