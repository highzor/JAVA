public class Graph {
    private final int maxN = 10;
    private final int[][] table;
    private int curN;
    public MyStack stack = new MyStack();
    Vertex[] vertexList;

    public Graph() {
        vertexList = new Vertex[maxN];
        table = new int[maxN][maxN];
        curN = 0;
    }
    public void addVertex(char name) {
        vertexList[curN++] = new Vertex(name);
    }
    public void addEdge(int start, int end, int s) {
        table[start][end] = 1;
        table[end][start] = s; //symmetry
    }
    public int check(int v) {
        for (int i = 0; i < curN; i++) {
            if (table[v][i] == 1 && !vertexList[i].isVisited) return i;
        }
        return -1;
    }
    public void dfs(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        stack.push(index);
        while(!stack.isEmpty()) {
            int neigh = check(stack.peek());
            if (neigh == -1) {
                stack.pop();
            } else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }
        }
        for (int i = 0; i < curN; i++) {
            vertexList[i].isVisited = false;
        }
    }
}




