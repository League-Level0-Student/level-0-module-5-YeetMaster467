
  /*** Go to the recipe to run the demonstration before starting this program ***/

int x = 340;
int speed = 2;
int otherX = x*2;
int otherSpeed = 2;

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1000,700);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {
        
        background(#B9B9B9);
        
  
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
        for(int i=0; i<50; i++){
        
          ellipse(x,350, 500-i*10, 500-i*10);
        }
        
         x += speed; 
         
         if(x >= width || x<=0){
           speed *= -1;
         }
          
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
        if(mousePressed){
          println(mouseX + "  " + mouseY);
        }
        
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
        
        
         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
        
        
            
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        for(int i=0; i<50; i++){
        
          ellipse(otherX,350, 500-i*10, 500-i*10);
        }
        
         otherX -= otherSpeed; 
         
         if(x >= width || x<=0){
           otherSpeed *= -1;
         }
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
