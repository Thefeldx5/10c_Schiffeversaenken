
 class SCHIFFEVIER
{ 
  RUMPFSYMBOL[] rumpf;
  public int x;
  public int y;
  SCHIFFEVIER ()
  {
    rumpf = new RUMPFSYMBOL [4];
    rumpf[0]= new RUMPFSYMBOL();
    rumpf[1]= new RUMPFSYMBOL();
    rumpf[2]= new RUMPFSYMBOL();
    rumpf[3]= new RUMPFSYMBOL();
  }
   
  void SchiffevierSetzen (int x, int y, char richtung)
  { switch (richtung)
     {case 'S':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y +1);
      rumpf[2]. PositionSetzen(x, y+2);
      rumpf[3]. PositionSetzen(x, y+3);
      break;
      case 'N':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x, y-1);
      rumpf[2]. PositionSetzen(x, y-2);
      rumpf[3]. PositionSetzen(x, y-3);
      break;
      case 'O':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x +1, y);
      rumpf[2]. PositionSetzen(x +2, y);
      rumpf[3]. PositionSetzen(x +3, y);
      break;
      case 'W':
      rumpf[0]. PositionSetzen(x, y);
      rumpf[1]. PositionSetzen(x -1, y);
      rumpf[2]. PositionSetzen(x -2, y);
      rumpf[3]. PositionSetzen(x -3, y);
      break;
    }
  }
      
  }

