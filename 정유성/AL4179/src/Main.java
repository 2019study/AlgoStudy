import java.util.Scanner;
import java.util.LinkedList;

public class Main {

	/*public class node {
		String data = null;
		node upper = null;
		node lower = null;
		node left = null;
		node right = null;
		node parent = null;

		public node(String data) {
			this.data = data;
		}

		public void setParent(node parent) {
			this.parent = parent;
		}

		public void setChild(node upper, node lower, node left, node right) {
			this.upper = upper;
			this.lower = lower;
			this.left = left;
			this.right = right;
		}

		public void setData(String data) {
			this.data = data;
		}

		public node getRight() {
			return this.right;
		}

		public node getUpper() {
			return this.upper;
		}

		public node getLower() {
			return this.lower;
		}

		public node getLeft() {
			return this.left;
		}

		public node getParent() {
			return this.parent;
		}
	}*/
	public class directedMatrix extends edge{
		
		
	}
	public class edge{
		String headVertex;
		String tailVertex;
		public void setEdge(String headVertex,String tailVertex){
			this.headVertex = headVertex;
			this.tailVertex = tailVertex;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		String[][] coordinate = new String[C][R];
		String firstPosition = null;
		for (int i = 0; i < C; i++) { // data set 받기
			for (int j = 0; j < R; j++) {
				String s = input.next();
				coordinate[i][j] = s;
				if (s.equals("J"))
					firstPosition = s;

			}
		}
		int count = 0;
		/*node root = null;
		root.setData(firstPosition);
		for (int i = 0; i < C; i++) {// tree 생성하는 부분 4진트리
			node parent = null;
			node upper = null;
			node lower = null;
			node left = null;
			node right = null;

		}*/
	}

}
