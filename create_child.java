class create_child
{
void create_children(Node genesis, int id,double value,Node parent)
{ Date dt1=new date();
int id1=id+1;
double max=value;
double value1 = (Math.random()*((max-0.0)+1))+0.0;
 String name1=parent.getName()+1;  
 String data1=en.encrypt_data(Integer.toString(id1)+Double.toString(value1)+name1);
int number1=12315;
String hashvalue1=en.encrypt_data(dt1.toString()+data1+Integer.toString(number1)+Integer.toString(id1)+parent.toString()+"null"+genesis.toString());
Node child1=new Node(dt1,en.encrypt_data(Integer.toString(id1)+Double.toString(value1)+name1+data1+Integer.tostring(id1)+Integer.toString(number)+genesis.toString()+"null"+parent.toString()+hashvalue1);
int id2=id1+1;
double max=value-value1;
double value2 = (Math.random()*((max-0.0)+1))+0.0;
String name2=parent.getName()+2;
String data2=en.encrypt_data(Integer.toString(id2)+Double.toString(value2)+name2);
int number2=23224;
String hashvalue2=en.encrypt_data(dt1.toString()+data2+Integer.toString(number2)+Integer.toString(id2)+parent.toString()+"null"+genesis.toString());
Node child2=new Node(dt1,en.encrypt_data(Integer.toString(id2)+Double.toString(value2)+name2+data1+Integer.toString(number2)+genesis.toString()+"null"+parent.toString()+hashvalue2);
}
}
