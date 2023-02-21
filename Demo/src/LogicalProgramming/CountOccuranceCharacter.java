package LogicalProgramming;

public class CountOccuranceCharacter {
	public static void main(String[] args) {

		String str = "aabbbkjkhf";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '-';
				}

			}
			if (ch[i] != '-') {

				System.out.println(ch[i] + ":" + count);

			}
		}
	}
}