package edu.wust.operators;

class Tree {
	int height;

	Tree() {
		prt("播种：");
		height = 0;
	}

	Tree(int i) {
		prt("种颗 " + i + " 米高的新树。");
		height = i;
	}

	void info() {
		prt("树高" + height );
	}

	void info(String s) {
		prt(s + ": 树高 " + height );
	}

	static void prt(String s) {
		System.out.println(s);
	}
}
