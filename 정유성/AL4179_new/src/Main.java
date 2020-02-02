import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static class vertex {
		int x;
		int y;
		char data;

		public void setVertex(int x, int y, char data) {
			this.x = x;
			this.y = y;
			this.data = data;
		}

		public int getCoordinateX() {
			return this.x;
		}

		public int getCoordinateY() {
			return this.y;
		}

		public char getData() {
			return this.data;
		}
	}

	/*
	 * static class edge extends vertex { vertex headVertex; vertex tailVertex;
	 * 
	 * public void setEdge(vertex headVertex, vertex tailVertex) {
	 * this.headVertex = headVertex; this.tailVertex = tailVertex; }
	 * 
	 * public vertex getHeadVertex() { return this.headVertex; }
	 * 
	 * public vertex getTailVertex() { return this.tailVertex; }
	 * 
	 * }
	 */

	static class graph extends vertex{
		
		public ArrayList<ArrayList<vertex>> edgeSet;
		// public vertex[][] coordinateSet;
		// public edge[][] edgeSet;

		public graph( int R, int C ) {
			this.edgeSet = new ArrayList<ArrayList<vertex>>();
			for(int i=0;i<R*C;i++){
				edgeSet.add(new ArrayList<vertex>());
			}
			// this.edgeSet = new edge[R*C][];
		}

		public void addVertex(int i, vertex newVertex) {
			edgeSet.get(i).add(newVertex);
		}
		public void isTrue(){
			
		}
		/*
		 * public void initEdge(vertex[][] coordinateSet){ int rowSize =
		 * coordinateSet.length; int colSize = coordinateSet[0].length;
		 * 
		 * for(int i =0;i) switch(){ case '#'://벽 break; case '.'://갈 수 있음
		 * break; case 'J': //주인공 위치 break; case 'F': //불 break; }
		 */

		public void deleteEdge(int i, int j) {

		}

		public void fireBleed() {

		}
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		graph graph = new graph(R,C);
		vertex tempVertex = null;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				tempVertex.setVertex(i, j,input.next().charAt(0));
				graph.addVertex(i, tempVertex);
			}
		}
		System.out.println();

	}

}
