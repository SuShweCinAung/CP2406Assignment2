import javafx.scene.paint.Stop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StopLight extends JPanel {
    StopLightDrawing light=new StopLightDrawing();
    public StopLight(){
        JButton changeButton=new JButton("Switch");
        light.setPreferredSize(new Dimension(160,260));

        buttonListener l=new buttonListener();
        changeButton.addActionListener(l);

        add(light);
        add(changeButton);

    }
    class buttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            light.changeColor();
        }
    }
}
