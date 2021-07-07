
 class SCHIFFEZWEI
 { RUMPFSYMBOL [] rumpf;
  public int x;
  public int y; 
  SCHIFFEZWEI ()
  {
      rumpf = new RUMPFSYMBOL [2];
      rumpf[0]= new RUMPFSYMBOL();
      rumpf[1] = new RUMPFSYMBOL();
  }
  
  void SchiffezweiSetzen (int x, int y, char richtung)
  { switch (richtung)
     {case 'S':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y +1);
      break;
      case 'N':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y-1);
      break;
      case 'O':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x +1, y);
      break;
      case 'W':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x -1, y);
      break;
    }
  }
}