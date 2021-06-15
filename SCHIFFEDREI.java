

 class SCHIFFEDREI
{ 
  RUMPFSYMBOL[] rumpf;
  public int x;
  public int y;
    SCHIFFEDREI (int x, int y, char richtung)
  {
      rumpf = new RUMPFSYMBOL [3];
      rumpf[0]= new RUMPFSYMBOL();
      rumpf[1]= new RUMPFSYMBOL();
      rumpf[2]= new RUMPFSYMBOL();
      
  }
  
  void SchiffedreiSetzen (int x, int y, char richtung)
  { switch (richtung)
       {case 'N':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y +1);
      rumpf[2]. PositionSetzen(x, y+2);
      break;
       case 'n':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y-1);
      rumpf[2]. PositionSetzen(x, y-2);
      break;
      case 'O':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x +1, y);
      rumpf[2]. PositionSetzen(x +2, y);
      break;
      case 'o':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x -1, y);
      rumpf[2]. PositionSetzen(x -2, y);
      break;
    }

  }
}