
%%

%class AE
%unicode
%standalone

%%
[:][^\n]* { 
	System.out.println(yytext().replace(": ", "").replace(":",""));
	}
. {}