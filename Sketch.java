import processing.core.PApplet;

public class Sketch extends PApplet {
  int intRow;
  int intColumn;
  int intX = 0;
  int intY = 0;
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    // Create "for" loops to draw boxes along rows and columns in the first box   
    for(intRow = 0; intRow < 300; intRow+= 10){
      for(intColumn = 0 ; intColumn < 300; intColumn+= 10){
        intX = 3 + intRow; 
        intY = 303 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    for(intRow = 0; intRow < 300; intRow+= 10){
      for(intColumn = 0 ; intColumn < 300; intColumn+= 10){
        intX = 303 + intRow; 
        intY = 303 + intColumn; 

        // Use "if" statement to make every other column change colors to black
        if(intRow % 20 == 0){
          fill(255, 255, 255);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else{
          fill(0, 0, 0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

      for(intRow = 0; intRow < 300; intRow+= 10){
        for(intColumn = 0 ; intColumn < 300; intColumn+= 10){
          intX = 603 + intRow; 
          intY = 303 + intColumn; 

          // Use "if" statement to make every other row change colors to black  
          if(intColumn % 20 == 0){
          fill(0, 0, 0);
          noStroke();
          rect(intX, intY, 5, 5);
          }
          else{
            fill(255, 255, 255);
            noStroke();
          rect(intX, intY, 5, 5);
          }
  
        }
      }
  
    }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

    for(intRow = 0; intRow < 300; intRow+= 10){
      for(intColumn = 0 ; intColumn < 300; intColumn+= 10){
        intX = 903 + intRow; 
        intY = 303 + intColumn; 

        // use "if" statement and "&&" operator to make grid pattern using squares 
        if(intColumn % 20 != 0 && intRow % 20 == 0){
        fill(255, 255, 255);
        noStroke();
        rect(intX, intY, 5, 5);
        }
        else{
        fill(0, 0, 0);
        noStroke();
        rect(intX, intY, 5, 5);
        }

      }
    }

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    
    /* Use arithmetic sequence in "for" loop to produce one more square each row going down to the left,
     *starting from the end of the 5th box
     */
      for(intColumn = 1 ; intColumn <= 300; intColumn+= 10){
      for(intRow = 1; intRow <= intColumn; intRow+= 10 ){
          intX = 293 - intRow;
          intY = intColumn; 
  
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
  
        }
      }

  }

  public void draw_section6(){

    /* Use arithmetic sequence in "for" loop to produce one more square each row going down to the right,
     *starting from the beggining of the 6th box
     */
    for(intColumn = 1 ; intColumn <= 300; intColumn+= 10){
    for(intRow = 1; intRow <= intColumn; intRow+= 10 ){
        intX = 303 + intRow;
        intY = intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }

  }

  public void draw_section7(){

    /* Use arithmetic sequence in "for" loop to produce one more square each row going down to the left,
     *starting from the end of the 7th box
     */
    for(intRow = 1; intRow <= 300; intRow+= 10 ){
      for(intColumn = 1 ; intColumn <= intRow; intColumn+= 10){
        intX = 893 - intRow;
        intY = intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }

  }
  
  public void draw_section8(){
    
    /* Use arithmetic sequence in "for" loop to produce one more square each row going down to the right,
     *starting from the begginng of the 8th box
     */
    for(intRow = 1; intRow <= 300; intRow+= 10 ){
      for(intColumn = 1 ; intColumn <= intRow; intColumn+= 10){
        intX = 903 + intRow;
        intY = intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }

  }

}