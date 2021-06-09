
 class SCHIFFEVIER
{ 
    RUMPFSYMBOL[] rumpf;
    SCHIFFEVIER (int x, int y, char richtung)
    {
      rumpf = new RUMPFSYMBOL [4];
      rumpf.PositionSetzen (x, y);
      
    }
    
}
