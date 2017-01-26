package com.example.popbuzz.popbuzzv0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timothy on 26/01/2017.
 */

public class Node
{
    private List<Node> children = null;
    private String value;
    private Node father;

    public Node(String value)
    {
        this.children = new ArrayList<> ();
        this.value = value;
    }

    public Node(String value, Node f)
    {
        this.children = new ArrayList<> ();
        this.value = value;
        this.father = f;
    }

    public void addChild(Node child)
    {
        children.add(child);
    }

    public Node getFather(){
        return father;
    }

}
