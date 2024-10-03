package ukf.sk.vlastne_komponenty;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public  class  PostZnacka extends Canvas
{
    private int w,h;
    private  Color c;



    public PostZnacka(int w,int h,Color c) {
        super(w,h);
        this.h=h;
        this.w = w;
        this.c = c;
        GraphicsContext gc = getGraphicsContext2D();
        Vykresli(gc);
    }
    private  void Vykresli(GraphicsContext gc)
    {
        gc.setStroke(c);
        gc.strokeRect(0,0,w,h);
        gc.strokeLine(0,0,w,h);
        gc.strokeLine(0,h,w,0);

    }




}
