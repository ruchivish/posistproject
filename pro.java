//creating the node
import java.io.*;
import java.util.*;
class Node
{
Date date=new Date();
private int nodeNumber;
private String data;
private String nodeId;
private String referenceNodeId;
private String childReferenceNodeId;
private String genesisReferenceNodeId;
private String HashValue;

public Node(Date date,int nodeNumber,String data, String NodeId, String referenceId,String childReferenceNodeId,String genesisReferenceNodeId,String HashValue)
{
this.date=date;

this.nodeNumber=nodeNumber;
this.data=data;
this.nodeId=nodeid;
this.referenceNodeId=referenceNodeId;
this.genesisReferenceNodeId=genesisReferenceNodeId;
this.HashValue=HashValue;
}
}
 class pro
 {
 public static void main(String[] args)
 {
 //creating the genesisnode.
 Date dt=new Date();
 int id=1;
  int n_num=12345;
  double value=30.00;
  String owner_name="A";
  encrypt_decrypt en=new encrypt_decrypt();
 String data_to_encrypt="null"+value.toString()+owner_name+en.encrypt_data(Integer.toString(id)+Double.toString(value)+owner_name);
 Node genesisNode=new Node(dt,en.encrypt_data(data_to_encrypt),id,n_num,null,
 //creating the childnodes
  create_child children=new create_child(genesis);
 }
 }
