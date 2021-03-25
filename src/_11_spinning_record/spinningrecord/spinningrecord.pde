int angle = 10;
void setup(){
    size(600,600); 
    //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
                pictureOfRecord.resize(400,400); 
                
}

void draw(){

  if(mousePressed){
angle=angle+10;
  }
  rotateImage(pictureOfRecord,angle);
          image(pictureOfRecord, 0, 0);  //in draw method
        
      
           
}
PImage pictureOfRecord;  
 void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
