package navalApp.navalPackage;


/**
* navalApp/navalPackage/MatrixArrayBoolHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from navalApp.idl
* lunes 4 de junio de 2018 02:47:00 PM BOT
*/

public final class MatrixArrayBoolHolder implements org.omg.CORBA.portable.Streamable
{
  public boolean value[][] = null;

  public MatrixArrayBoolHolder ()
  {
  }

  public MatrixArrayBoolHolder (boolean[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = navalApp.navalPackage.MatrixArrayBoolHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    navalApp.navalPackage.MatrixArrayBoolHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return navalApp.navalPackage.MatrixArrayBoolHelper.type ();
  }

}
