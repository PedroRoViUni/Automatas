
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java.util.LinkedHashSet;
import java.util.Scanner;
import java_cup.runtime.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\005\000\002\004\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\005\000\002\004\005\000\002\004" +
    "\005\000\002\004\005\000\002\004\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\004\000\002\004\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\004\004\004\001\002\000\004\027\011\001" +
    "\002\000\006\002\uffff\004\004\001\002\000\004\002\007" +
    "\001\002\000\004\002\000\001\002\000\004\002\001\001" +
    "\002\000\054\002\uffea\004\uffea\005\022\006\013\007\026" +
    "\010\021\011\020\012\033\013\014\014\016\015\015\016" +
    "\025\017\034\020\024\021\012\022\031\023\032\024\035" +
    "\025\023\026\030\030\027\001\002\000\004\027\101\001" +
    "\002\000\004\027\077\001\002\000\004\027\075\001\002" +
    "\000\004\027\073\001\002\000\004\027\071\001\002\000" +
    "\006\002\ufffe\004\ufffe\001\002\000\004\027\067\001\002" +
    "\000\004\027\065\001\002\000\004\027\063\001\002\000" +
    "\004\027\061\001\002\000\004\027\057\001\002\000\004" +
    "\027\055\001\002\000\004\027\053\001\002\000\054\002" +
    "\uffea\004\uffea\005\022\006\013\007\026\010\021\011\020" +
    "\012\033\013\014\014\016\015\015\016\025\017\034\020" +
    "\024\021\012\022\031\023\032\024\035\025\023\026\030" +
    "\030\027\001\002\000\004\027\050\001\002\000\004\027" +
    "\046\001\002\000\004\027\044\001\002\000\004\027\042" +
    "\001\002\000\004\027\040\001\002\000\004\027\036\001" +
    "\002\000\054\002\uffea\004\uffea\005\022\006\013\007\026" +
    "\010\021\011\020\012\033\013\014\014\016\015\015\016" +
    "\025\017\034\020\024\021\012\022\031\023\032\024\035" +
    "\025\023\026\030\030\027\001\002\000\006\002\uffee\004" +
    "\uffee\001\002\000\054\002\uffea\004\uffea\005\022\006\013" +
    "\007\026\010\021\011\020\012\033\013\014\014\016\015" +
    "\015\016\025\017\034\020\024\021\012\022\031\023\032" +
    "\024\035\025\023\026\030\030\027\001\002\000\006\002" +
    "\ufff3\004\ufff3\001\002\000\054\002\uffea\004\uffea\005\022" +
    "\006\013\007\026\010\021\011\020\012\033\013\014\014" +
    "\016\015\015\016\025\017\034\020\024\021\012\022\031" +
    "\023\032\024\035\025\023\026\030\030\027\001\002\000" +
    "\006\002\ufff8\004\ufff8\001\002\000\054\002\uffea\004\uffea" +
    "\005\022\006\013\007\026\010\021\011\020\012\033\013" +
    "\014\014\016\015\015\016\025\017\034\020\024\021\012" +
    "\022\031\023\032\024\035\025\023\026\030\030\027\001" +
    "\002\000\006\002\uffef\004\uffef\001\002\000\054\002\uffea" +
    "\004\uffea\005\022\006\013\007\026\010\021\011\020\012" +
    "\033\013\014\014\016\015\015\016\025\017\034\020\024" +
    "\021\012\022\031\023\032\024\035\025\023\026\030\030" +
    "\027\001\002\000\006\002\ufff0\004\ufff0\001\002\000\054" +
    "\002\uffea\004\uffea\005\022\006\013\007\026\010\021\011" +
    "\020\012\033\013\014\014\016\015\015\016\025\017\034" +
    "\020\024\021\012\022\031\023\032\024\035\025\023\026" +
    "\030\030\027\001\002\000\006\002\uffec\004\uffec\001\002" +
    "\000\006\002\uffeb\004\uffeb\001\002\000\054\002\uffea\004" +
    "\uffea\005\022\006\013\007\026\010\021\011\020\012\033" +
    "\013\014\014\016\015\015\016\025\017\034\020\024\021" +
    "\012\022\031\023\032\024\035\025\023\026\030\030\027" +
    "\001\002\000\006\002\ufffb\004\ufffb\001\002\000\054\002" +
    "\uffea\004\uffea\005\022\006\013\007\026\010\021\011\020" +
    "\012\033\013\014\014\016\015\015\016\025\017\034\020" +
    "\024\021\012\022\031\023\032\024\035\025\023\026\030" +
    "\030\027\001\002\000\006\002\ufff4\004\ufff4\001\002\000" +
    "\054\002\uffea\004\uffea\005\022\006\013\007\026\010\021" +
    "\011\020\012\033\013\014\014\016\015\015\016\025\017" +
    "\034\020\024\021\012\022\031\023\032\024\035\025\023" +
    "\026\030\030\027\001\002\000\006\002\ufff2\004\ufff2\001" +
    "\002\000\054\002\uffea\004\uffea\005\022\006\013\007\026" +
    "\010\021\011\020\012\033\013\014\014\016\015\015\016" +
    "\025\017\034\020\024\021\012\022\031\023\032\024\035" +
    "\025\023\026\030\030\027\001\002\000\006\002\uffed\004" +
    "\uffed\001\002\000\054\002\uffea\004\uffea\005\022\006\013" +
    "\007\026\010\021\011\020\012\033\013\014\014\016\015" +
    "\015\016\025\017\034\020\024\021\012\022\031\023\032" +
    "\024\035\025\023\026\030\030\027\001\002\000\006\002" +
    "\ufffd\004\ufffd\001\002\000\054\002\uffea\004\uffea\005\022" +
    "\006\013\007\026\010\021\011\020\012\033\013\014\014" +
    "\016\015\015\016\025\017\034\020\024\021\012\022\031" +
    "\023\032\024\035\025\023\026\030\030\027\001\002\000" +
    "\006\002\ufffa\004\ufffa\001\002\000\054\002\uffea\004\uffea" +
    "\005\022\006\013\007\026\010\021\011\020\012\033\013" +
    "\014\014\016\015\015\016\025\017\034\020\024\021\012" +
    "\022\031\023\032\024\035\025\023\026\030\030\027\001" +
    "\002\000\006\002\ufff9\004\ufff9\001\002\000\054\002\uffea" +
    "\004\uffea\005\022\006\013\007\026\010\021\011\020\012" +
    "\033\013\014\014\016\015\015\016\025\017\034\020\024" +
    "\021\012\022\031\023\032\024\035\025\023\026\030\030" +
    "\027\001\002\000\006\002\ufff6\004\ufff6\001\002\000\054" +
    "\002\uffea\004\uffea\005\022\006\013\007\026\010\021\011" +
    "\020\012\033\013\014\014\016\015\015\016\025\017\034" +
    "\020\024\021\012\022\031\023\032\024\035\025\023\026" +
    "\030\030\027\001\002\000\006\002\ufff5\004\ufff5\001\002" +
    "\000\054\002\uffea\004\uffea\005\022\006\013\007\026\010" +
    "\021\011\020\012\033\013\014\014\016\015\015\016\025" +
    "\017\034\020\024\021\012\022\031\023\032\024\035\025" +
    "\023\026\030\030\027\001\002\000\006\002\ufff7\004\ufff7" +
    "\001\002\000\054\002\uffea\004\uffea\005\022\006\013\007" +
    "\026\010\021\011\020\012\033\013\014\014\016\015\015" +
    "\016\025\017\034\020\024\021\012\022\031\023\032\024" +
    "\035\025\023\026\030\030\027\001\002\000\006\002\ufffc" +
    "\004\ufffc\001\002\000\054\002\uffea\004\uffea\005\022\006" +
    "\013\007\026\010\021\011\020\012\033\013\014\014\016" +
    "\015\015\016\025\017\034\020\024\021\012\022\031\023" +
    "\032\024\035\025\023\026\030\030\027\001\002\000\006" +
    "\002\ufff1\004\ufff1\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\006\002\005\003\004\001\001\000\002\001" +
    "\001\000\006\002\007\003\004\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\016\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\051\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\036\001\001\000\002" +
    "\001\001\000\004\004\040\001\001\000\002\001\001\000" +
    "\004\004\042\001\001\000\002\001\001\000\004\004\044" +
    "\001\001\000\002\001\001\000\004\004\046\001\001\000" +
    "\002\001\001\000\004\004\050\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\053\001\001\000\002\001" +
    "\001\000\004\004\055\001\001\000\002\001\001\000\004" +
    "\004\057\001\001\000\002\001\001\000\004\004\061\001" +
    "\001\000\002\001\001\000\004\004\063\001\001\000\002" +
    "\001\001\000\004\004\065\001\001\000\002\001\001\000" +
    "\004\004\067\001\001\000\002\001\001\000\004\004\071" +
    "\001\001\000\002\001\001\000\004\004\073\001\001\000" +
    "\002\001\001\000\004\004\075\001\001\000\002\001\001" +
    "\000\004\004\077\001\001\000\002\001\001\000\004\004" +
    "\101\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	
	public static RegistroAE nuevoAceite = new RegistroAE();
	public static LinkedHashSet<RegistroAE> lista = new LinkedHashSet<RegistroAE>();


	public static void main(String args[]) throws Exception {

 		FileInputStream stream = new java.io.FileInputStream(args[0]);
       		Reader reader = new java.io.InputStreamReader(stream);

		try{
			new parser(new AE(reader)).parse();
		}
		catch ( Exception e) {
			System.out.println("Analisis INCORRECTO !!");
			System.exit(1);
		}
		System.out.println("Analisis Correcto ");
		RegistroAE[] listaAceites = lista.toArray(new RegistroAE[lista.size()]);
		boolean repetir = true;
		Scanner teclado = new Scanner(System.in);
		while(repetir == true){
			for(int i = 0; i<lista.size(); i++){
				System.out.println((i+1)+". "+listaAceites[i].getAE());
			}
			int n_introducido = -1;
			while(n_introducido < 0 || n_introducido > lista.size()){
				System.out.println("Introduzca el n� del aceite a consultar ( o 0 para salir): ");
				n_introducido = teclado.nextInt();
			}
			if(n_introducido == 0){
				System.exit(0);
			}
			System.out.println(listaAceites[n_introducido-1].toString());
			System.out.println("\n##############\n�Desea consultar otro aceite? (S/N)");
			String nuevaLectura = teclado.next();
			if(nuevaLectura.equals("N") || nuevaLectura.equals("n")){
				repetir = false;
			}
		}
		teclado.close();
	}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // lista ::= aceite lista 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= lista EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // lista ::= aceite 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // aceite ::= AE DATOS caracteristicas 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setAE(b.toString()); lista.add(nuevoAceite); nuevoAceite = new RegistroAE();
              CUP$parser$result = parser.getSymbolFactory().newSymbol("aceite",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // caracteristicas ::= NOMBRE_LATINO DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setNombre_latino(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // caracteristicas ::= FAMILIA DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setFamilia(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // caracteristicas ::= PROCEDENCIA DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setProcedencia(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // caracteristicas ::= EXTRACCION DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setExtraccion(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // caracteristicas ::= DESCRIPCION_OLFATIVA DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setDescripcion_olfativa(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // caracteristicas ::= APARIENCIA DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setApariencia(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // caracteristicas ::= NOTA_DE_PERFUME DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setNota_de_Perfume(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // caracteristicas ::= PERFUME DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setPerfume(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // caracteristicas ::= SOLUBLE_EN DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setSoluble_en(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // caracteristicas ::= INDISOLUBLE_EN DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setIndisoluble_en(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // caracteristicas ::= DESCRIPCION DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setDescripcion(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // caracteristicas ::= USOS_GENERALES DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setUsos_generales(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // caracteristicas ::= PROPIEDADES DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setPropiedades(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // caracteristicas ::= BENEFICIOS_AROMATERAPEUTICOS DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setBeneficios_Aromaterapeuticos(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // caracteristicas ::= SINERGIA DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setSinergia(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // caracteristicas ::= PRECAUCIONES DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setPrecauciones(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // caracteristicas ::= CONTRAINDICACIONES DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setContraindicaciones(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // caracteristicas ::= USO DATOS caracteristicas 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		nuevoAceite.setUso(b.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // caracteristicas ::= DATOS_QUE_NO_SE_USA caracteristicas 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // caracteristicas ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("caracteristicas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}