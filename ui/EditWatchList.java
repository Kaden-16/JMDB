import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EditWatchList extends JButton {
    private int clickCount = 0;
    private JButton editButton;
    private String title;

    public EditWatchList(String title) {
        this.editButton = new JButton("Add to Watch List");
        this.title = title;
        editButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount % 2 == 1) {
                    DropDownList.add(title);
                    editButton.setText("Remove From Watch List");
                } else {
                    DropDownList.remove(title);
                    editButton.setText("Add to Watch List");
                }
                
            }
        });
    }
    
    public JButton getButton() {
        return editButton;
    }

}
