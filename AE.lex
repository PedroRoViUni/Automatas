import java_cup.runtime.Symbol;

%%

%public
%standalone
%class AE
%unicode

%states A, B

%cup

%%
<YYINITIAL, A>
AE: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.AE);
}
"Nombre latino": {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.NOMBRE_LATINO);
}
Familia: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.FAMILIA);
}
Procedencia: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.PROCEDENCIA);
}
Extracción: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.EXTRACCION);
}
"Descripción olfativa": {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.DESCRIPCION_OLFATIVA);
}
Apariencia: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.APARIENCIA);
}
"Nota de Perfume": {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.NOTA_DE_PERFUME);
}
Perfume: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.PERFUME);
}
"Soluble en": {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.SOLUBLE_EN);
}
"Indisoluble en": {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.INDISOLUBLE_EN);
}
Descripción: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.DESCRIPCION);
}
"Usos generales": {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.USOS_GENERALES);
}
Propiedades: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.PROPIEDADES);
}
"Beneficios Aromaterapeúticos": {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.BENEFICIOS_AROMATERAPEUTICOS);
}
Sinergia: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.SINERGIA);
}
Precauciones: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.PRECAUCIONES);
}
Contraindicaciones: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.CONTRAINDICACIONES);
}
Uso: {
	//System.out.print(yytext());
	yybegin(B);
	return new Symbol(sym.USO);
}

. {
	//System.out.print(yytext());
	return new Symbol(sym.DATOS_QUE_NO_SE_USA);
}

<B> .* {
	//System.out.print("|" + yytext() + "|");
	yybegin(A);
	return new Symbol(sym.DATOS, new String(yytext().replace("\n","")));
}

. {}