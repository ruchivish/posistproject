class encrypt_decrypt
{
String hashValue=null;
public static String encryptdata(String sdata)
{ try
 {
            MessageDigest md = MessageDigest.getInstance("MD5");
        
            md.update(sdata.getBytes());
         
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            hashvalue = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return hashvalue;
    }
        }
