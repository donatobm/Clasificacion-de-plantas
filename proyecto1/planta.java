public class planta{

String	D;
int		E;
int		L;


public planta(String D, int E,int L)
{
	this.D = D;
	this.E = E;
	this.L = L;
}

public void mostrar(int pos, String tex)
	{

		MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, "       DESCRIPCION: ["+D+"]");
		MCursor.TCen(pos, "       EXISTENCIA: ["+E+"] ");
		MCursor.TCen(pos, "    NUMERO DE LOTE: ["+L+"]");


}

}