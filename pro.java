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
  try {
           
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordToHash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
           
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        System.out.println(generatedPassword);
 Node genesisNode=new Node(dt,id,
 
 }
 }
