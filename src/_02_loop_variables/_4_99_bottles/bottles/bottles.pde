for(int i=99;i>-1;i--){
int bottlesleft = i-1;
if(bottlesleft>1){
  System.out.println(i+ " bottles of beer on the wall, "+i+" bottles of beer.\nTake one"
  +" down, pass it around, "+ bottlesleft+" bottles of beer on the wall\n" );
}
else if(bottlesleft == 1){
 
  System.out.println(i+ " bottles of beer on the wall, "+i+" bottles of beer.\nTake one"
  +" down, pass it around, "+ bottlesleft+" bottle of beer on the wall\n" );
}
else if(bottlesleft == 0){
 
  System.out.println(i+ " bottle of beer on the wall, "+i+" bottle of beer.\nTake one"
  +" down, pass it around, "+ bottlesleft+" bottles of beer on the wall\n" );
}
else{
System.out.println( "No more bottles of beer on the wall, no more bottles of beer.\nGo to"
+" the store buy some more, 99 bottles of beer on the wall..." );
}
}
