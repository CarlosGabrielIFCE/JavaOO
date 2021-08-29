import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Collections.sort(palavras, new ComparadorPorTamanho());
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			} else if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//		for (String p : palavras) {
//			System.out.println(p);
//		}

		palavras.forEach(System.out::println);
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}
