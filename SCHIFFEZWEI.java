
 class SCHIFFEZWEI
 { RUMPFSYMBOL [] rumpf;
  public int x;
  public int y; 
  SCHIFFEZWEI (int x, int y, char richtung)
  {
      rumpf = new RUMPFSYMBOL [2];
      rumpf[0]= new RUMPFSYMBOL();
      rumpf[1] = new RUMPFSYMBOL();
  }
  
  void SchiffevierSetzen (int x, int y, char richtung)
  { switch (richtung)
     {case 'N':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y +1);
      break;
      case 'n':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y-1);
      break;
      case 'O':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x +1, y);
      break;
      case 'o':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x -1, y);
      break;
    }
  }
}