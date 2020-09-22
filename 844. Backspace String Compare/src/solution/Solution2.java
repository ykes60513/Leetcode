package solution;

public class Solution2 {
	public boolean backspaceCompare(String S, String T) {

		StringBuilder s1 = new StringBuilder();
		StringBuilder t1 = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == '#') {
				if (s1.length() == 0)
					continue;
				else {
					s1.setLength(s1.length() - 1);
				}
			} else {
				s1.append(ch);
			}
		}

		for (int i = 0; i < T.length(); i++) {
			char ch = T.charAt(i);
			if (ch == '#') {
				if (t1.length() == 0)
					continue;
				else {
					t1.setLength(t1.length() - 1);
				}
			} else {
				t1.append(ch);
			}
		}

		return s1.toString().equals(t1.toString());

	}
}
