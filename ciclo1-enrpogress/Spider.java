   public class Spider {
    private Triangle body1;
    private Triangle body2;
    private Triangle body3;
    private Triangle body4; 
    private Rectangle leg1;
    private Rectangle leg2;
    private Rectangle leg3;
    private Rectangle leg4;
    private Circle head1;
    private Circle head2;
    
    public Spider() {  
  body1 = new Triangle();
  body1.changeColor("blue");
  body1.changeSize(-85,70);
  body1.moveVertical(110);
  body1.moveHorizontal(40);
  
  body2 = new Triangle();
  body2.changeColor("blue");
  body2.changeSize(35,-60);
  body2.moveVertical(-7);
  body2.moveHorizontal(40);
  
  body3 = new Triangle();
  body3.changeColor("red");
  body3.changeSize(-50,30);
  body3.moveVertical(110);
  body3.moveHorizontal(40);
  
  body4 = new Triangle();
  body4.changeColor("red");
  body4.changeSize(35,-40);
  body4.moveVertical(-4);
  body4.moveHorizontal(40);
  
  head1 = new Circle();
  head1.changeColor("blue");
  head1.moveVertical(100);
  head1.changeSize(45);
  head1.moveHorizontal(138);
  
  head2 = new Circle();
  head2.changeColor("red");
  head2.moveVertical(105);
  head2.changeSize(30);
  head2.moveHorizontal(145);

  leg1 = new Rectangle();
        leg1.changeColor("blue");
        leg1.changeSize(5,130);  
        leg1.moveHorizontal(45);
        leg1.moveVertical(40);
        
  leg2 = new Rectangle();
        leg2.changeColor("blue");
        leg2.changeSize(5,110);  
        leg2.moveHorizontal(55);
        leg2.moveVertical(50); 

  leg3 = new Rectangle();
        leg3.changeColor("blue");
        leg3.changeSize(5,99);  
        leg3.moveHorizontal(60);
        leg3.moveVertical(60); 
        
  leg4 = new Rectangle();
        leg4.changeColor("blue");
        leg4.changeSize(5,90);  
        leg4.moveHorizontal(65);
        leg4.moveVertical(70);
        
          
}

    public void makeVisible() {       
        body1.makeVisible();
        body2.makeVisible();
        body3.makeVisible();
        leg1.makeVisible();
        leg2.makeVisible();
        leg3.makeVisible();
        leg4.makeVisible();
        head1.makeVisible();
        head2.makeVisible();
        body4.makeVisible();
        
        
        
    }
}    








