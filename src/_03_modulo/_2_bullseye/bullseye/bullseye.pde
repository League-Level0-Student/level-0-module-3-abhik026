
void setup() {
 size(500,500);
  // set the size of your sketch

}

void draw() {
  for(int i = 400; i>10; i-=30){
     if(i % 60 == 10 ){
      fill(0,0,0);
      
  }
    else{
    fill(#E02020);
    }
    ellipse(250,250,i,i);
  
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
