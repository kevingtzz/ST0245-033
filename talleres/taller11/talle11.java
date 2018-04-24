import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Esta clase es una implementación de un digrafo usando listas de adyacencia
 *
 * @author Mauricio Toro
 * @version 1
 */
public class DigraphAL extends Graph
{
    private LinkedList [] list;
    public DigraphAL(int size)
    {
        super(size);
        this.list = new LinkedList[size];
    }

    public void addArc(int source, int destination, int weight) {
        couple p = new couple(destination, weight);
        list[source].add(p);
    }

    public int getWeight(int source, int destination) {
        LinkedList <couple> temp = list[source];
        for(int i = 0; i < temp.size(); i++) {
            if(temp.get(i).getVertice() == destination) {
                return temp.get(i).getWeight();
            }
        }
        return 0;
    }

    public ArrayList<Integer> getSuccessors(int vertice) {
        LinkedList <couple> temp = list[vertice];
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i = 0; i < temp.size(); i++) {
            if(temp.get(i).getWeight() != 0) {
                arr.add(temp.get(i).getVertice());
            }
        }
        return arr;
    }
}

public class DigraphAM extends Graph
{
    private int [][] m;
    public DigraphAM(int size) {
        super(size);
        this.m = new int[size][size];
    }

    public int getWeight(int source, int destination) {
        return this.m[source][destination];
    }

    public void addArc(int source, int destination, int weight) {
        this.m[source][destination] = weight;
    }

    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList <Integer> successors = new ArrayList<>();
        for(int i = 0; i <= m[vertex].length; i++) {
            if(m[vertex][i] != 0) {
                successors.add(i);
            }
        }
        return successors;
    }
}

public abstract class Graph
{
    protected int size;
    public Graph(int vertices)
    {
        size = vertices;
    }

    public  abstract void addArc(int source, int destination, int weight);

    public abstract ArrayList<Integer> getSuccessors(int vertice);

    public abstract int getWeight(int source, int destination);

    public  int size() {return size;}
}

public class couple
{
    private int vertice;
    private int weigth;
    couple(int vertice, int weigth) {
        this.vertice = vertice;
        this.weigth = weigth;
    }
    public int getVertice() {
        return this.vertice;
    }
    public int getWeight() {
        return this.weigth;
    }
}
