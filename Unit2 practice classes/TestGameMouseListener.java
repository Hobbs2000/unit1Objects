import java.awt.event.*;

public class TestGameMouseListener implements MouseListener
{
    
    private int mouseX, mouseY;
    private boolean clicked;
    
    public void mouseClicked(MouseEvent event)
    {
        mouseX = event.getX();
        mouseY = event.getY();
        clicked = true;
    }
    
    public void mouseEntered(MouseEvent event)
    {
        
    }
    
    public void mouseExited(MouseEvent event)
    {
        
    }
    
    public void mousePressed(MouseEvent event)
    {
        mouseClicked(event);
        clicked = true;
    }
    
    public void mouseReleased(MouseEvent event)
    {
     clicked = false;   
    }
    
    public boolean isMousePressed()
    {
        return true;
    }
    
    public int getX()
    {
        return mouseX;
    }
    
    public int getY()
    {
        return mouseY;
    }
}