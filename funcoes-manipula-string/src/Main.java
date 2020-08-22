/*
 * @author Professor Nelio alves - Curso Java Completo 2020
 * 
 * Formatar string: 
 * toLowerCase(): Tranforma para minusculo
 * toUpperCase(): Tranforma para maiusculo
 * trim() 		: Remove espaço
 * 
 * Recortar:
 * substring(inicio)
 * substring(inicio,fim)
 * str.Split(" ")  -> Recorta com base em um separador informado em vetores
 * 						ex: separador utilizado foi um espaço (" ")
 * 
 * Substituir:
 * Replace(char, char)
 * Replace(string, string)
 * 
 * Buscar:
 * IndexOf()
 * LastIndexOf()
 */
public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		String[] s08 = original.split(" ");
		
		System.out.println("Original             : -"+original+"-");
		System.out.println("");
		System.out.println("toLowerCase()        : -"+s01+"-");
		System.out.println("toUpperCase()        : -"+s02+"-");
		System.out.println("trim()               : -"+s03+"-");
		System.out.println("substring(2)         : -"+s04+"-");
		System.out.println("substring(2,9)       : -"+s05+"-");		
		System.out.println("replace('a','x')     : -"+s06+"-");
		System.out.println("replace('abc','xyz') : -"+s07+"-");		
		System.out.println("indexOf('bc')   	 : "+i);
		System.out.println("lastIndexOf('bc')	 : "+j);		
		System.out.println("split(' ') - vetor 0  : "+s08[0]);
		System.out.println("split(' ') - vetor 1  : "+s08[1]);
		System.out.println("split(' ') - vetor 2  : "+s08[2]);
		System.out.println("split(' ') - vetor 3  : "+s08[3]);
		System.out.println("split(' ') - vetor 4  : "+s08[4]);
	}
}