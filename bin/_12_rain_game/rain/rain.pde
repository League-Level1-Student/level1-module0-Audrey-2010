int down = 100;
int x = 10;
int score = 0;
void setup() {
  size(600,600);

}
void draw() {

background(250,250,250);      
fill(0, 6, 255);
    stroke(0, 0, 0);
    ellipse(x, down, 40,80);
         fill(#C6C6C6);
rect(mouseX, 590, 250, 250);
  if(mousePressed){
    System.out.println(mouseY);
  }
 down = down+10;
if(down>=height){
    x = (int) random (width);
down=0;
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    
}


  }
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
