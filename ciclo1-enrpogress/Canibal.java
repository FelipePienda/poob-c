   public class Spider {
    private Triangle body;
    private Rectangle leg1;
    private Rectangle leg2;
    
  body = new Triangle();
  body.changeColor("black");
  body.changeSize(30, 20);
  body.moveVertical(30);
  body.moveHorizontal(-70);
  
}

    public void makeVisible() {
        head.makeVisible();
        body.makeVisible();
    }
}    








