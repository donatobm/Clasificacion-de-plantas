public class Empresa{

//METODOS
static final int MAX = 10;
static planta PLA[] = 	new planta [MAX];
static helecho HEL[] = 	new helecho [MAX];
static rosa ROS[] = new rosa [MAX];
static tulipan TUL[] = new tulipan [MAX];


static boolean auxi=true;
static byte opc;
static byte opc1;

//STRING
static String 	D;
static String  clasi;
static String  ubi;
static String  tipo;
static String  luz;

//INT
static int		r=0;
static int		h=0;
static int		t=0;
static int		nabo=0;
static int		E;
static int		L;

//FLOAT
static float	TP;


public static void main(String arg[]){
		do{ opc = menu();
		switch(opc)
		{
			case 1 : reg1();	break;
			case 2 : reg1();	break;
			case 3 : By();		break;

		}
		}while(opc != 0);

}//main

public static Byte menu()
{
		MCursor.BLinea(30);
		portada(10,"MENU DE OPCIONES");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "1.- REGISTRAR PLANTA");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "2.- MOSTRAR INVENTARIO");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "3.- DOCUMENTACION");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "0.- SALIR DEL SISTEMA");
		MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
		return Leer.NByte("ESCOJA SU OPCION = ");
}//menu

public static void ingreso(){

	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
	 MCursor.UCursor(20);
	 D = Leer.CString("DESCRIPCION = ").toUpperCase();
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
		   E = Leer.NInt("EXISTENCIA = ");
	}while(E<0);
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
			L = Leer.NInt("NUMERO DE LOTE = ");
	}while(L<0);

}

public static void rosa(){

	if(r<MAX){
	ingreso();
	MCursor.BLinea(30);
	portada(10,"REGISTRO");
	MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	clasi = Leer.CString("CLASIFICACION = ");
	MCursor.BLinea(30);
	portada(10,"REGISTRO");
	MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	TP = Leer.NFloat("TEMPERATURA DE MANTENIMIENTO RECOMENDADA = ");
	MCursor.TCen(10, "============================================================");
	MCursor.Salida();
	ROS[r]= new rosa(D,E,L,clasi,TP);
	r++;}
	if(r==MAX) error(30, "NO SE PUEDEN REGISTRAR MAS PLANTAS DE TIPO ROSA");
}

public static void helecho(){

	if(h<MAX){
	ingreso();
	MCursor.BLinea(30);
	portada(10,"REGISTRO");
	MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	ubi = Leer.CString("UBICACION = ");
	MCursor.BLinea(30);
	portada(10,"REGISTRO");
	MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	tipo = Leer.CString("TIPO = ");
	MCursor.TCen(10, "============================================================");
	MCursor.Salida();
	HEL[h]= new helecho(D,E,L,ubi,tipo);
	h++;}
	if(h==MAX) error(30, "NO SE PUEDEN REGISTRAR MAS PLANTAS DE TIPO HELECHO");
}

public static void tulipan(){

	if(t<MAX){
	ingreso();
	MCursor.BLinea(30);
	portada(10,"REGISTRO");
	MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	luz = Leer.CString("TIPO DE LUZ = ");
	MCursor.BLinea(30);
	portada(10,"REGISTRO");
	MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	nabo = Leer.NInt(" ABANO CADA N° DE DIAS= ");
	MCursor.TCen(10, "============================================================");
	MCursor.Salida();
	TUL[t]= new tulipan(D,E,L,luz,nabo);
	t++;}
	if(h==MAX) error(30, "NO SE PUEDEN REGISTRAR MAS PLANTAS DE TIPO TULIPAN");
}

public static void mostR(){

if(r>0){
	for(int i=0;i<r;i++){
		MCursor.BLinea(30);
		portada(10,"INVENTARIO");
		ROS[i].mostrarR(10, "ROSAS");
		MCursor.Salida();}}
	else error(30, "SIN DATOS EN EL SISTEMA");
}

public static void mostH(){

if(h>0){
	for(int i=0;i<h;i++){
		MCursor.BLinea(30);
		portada(10,"INVENTARIO");
		HEL[i].mostrarH(10, "HELECHO");
		MCursor.Salida();}}
	else error(30, "SIN DATOS EN EL SISTEMA");
}

public static void mostT(){

if(t>0){
	for(int i=0;i<t;i++){
		MCursor.BLinea(30);
		portada(10,"INVENTARIO");
		TUL[i].mostrarT(10, "TULIPAN");
		MCursor.Salida();}}
	else error(30, "SIN DATOS EN EL SISTEMA");
}

public static void portada(int F, String T)
{
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(10, "		BIENVENIDO AL SISTEMA  ");
			MCursor.TCen(15, "   	    INVERNADERO C.A   ");
		    MCursor.TCen(10, "============================================================");
			MCursor.TCen(F,T);
}
public static byte reg1(){
Byte opc1;
		do{ opc1 = reg();
		switch(opc1)
		{

			case 1 : if(opc==1)rosa();			break;
			case 2 : if(opc==1)helecho();		break;
			case 3 : if(opc==1)tulipan();		break;
			case 4 : if(opc==2)mostR(); 		break;
			case 5 : if(opc==2)mostH(); 		break;
			case 6 : if(opc==2)mostT(); 		break;

		}
		}while(opc1 != 0);
		return opc1;
}
public static byte reg()
{
			if(opc==1){
			MCursor.BLinea(30);
			portada(10,"REGISTRO");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "1.- PLANTAS DE TIPO ROSA");
			MCursor.TCen(20, "2.- PLANTAS DE TIPO HELECHO");
			MCursor.TCen(20, "3.- PLANTAS DE TIPO TULIPAN");
		    MCursor.TCen(10, "============================================================");
		    MCursor.TCen(20, "0.- MENU PRINCIPAL");
		    MCursor.TCen(10, "============================================================");
		    MCursor.UCursor(20);}
			if(opc==2){
			MCursor.BLinea(30);
			portada(10,"INVENTARIO");
		   	MCursor.TCen(20, "4.- ROSAS");
			MCursor.TCen(20, "5.- HELECHO");
			MCursor.TCen(20, "6.- TULIPAN");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "0.- MENU PRINCIPAL");
		    MCursor.TCen(10, "============================================================");
			MCursor.UCursor(20);}
			return Leer.NByte("ESCOJA SU OPCION = ");
}

public static void error(int F, String T)
{
			MCursor.BLinea(30);
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(18, "	E	R	R	O	R");
			MCursor.TCen(F,T);
		    MCursor.TCen(10, "============================================================");
		    MCursor.Salida();
}

public static void By()
{
			MCursor.BLinea(30);
			MCursor.TCen(10, "ACERCA DE...");
			MCursor.TCen(10, "============================================================");
		    MCursor.TCen(14, "BIENVENIDOS A LA APLICACION DE INVENTARIO PARA PLANTAS EN EL ");
		    MCursor.TCen(14, "INVERNADERO. LA MISMA CONSTA DE INGRESAR UN TIPO DE PLANTA,  ");
		    MCursor.TCen(14, "BIEN SEA DE TIPO ROSA, HELECHO O TULIPAN, PODEMOS INGRESAR UNA");
		    MCursor.TCen(14, "SERIE DE DATOS GENERALES Y POR CADA TIPO DE PLANTAS. ");
		    MCursor.TCen(14, "ASI MISMO, TENDREMOS LA OPCION DE VER EN INVENTARIO LOS  ");
		    MCursor.TCen(14, "TIPOS DE PLANTAS INGRESADOS. ");
		    MCursor.Salida();
}


}