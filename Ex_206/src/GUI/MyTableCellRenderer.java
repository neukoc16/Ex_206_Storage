package GUI;

import BL.Article;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * @author Konstantin
 */
public class MyTableCellRenderer implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Article i = (Article) value;
        JLabel label = new JLabel();
        if (i.getAmount() == 0) {
            label.setForeground(Color.red);
        }
        if (isSelected) {
            label.setBackground(Color.black);
            label.setForeground(Color.black);
        }
        switch (column) {
            case 0:
                label.setText(i.getId() + "");
                break;
            case 1:
                label.setText(i.getDescription());
                break;
            case 2:
                label.setText(i.getAmount() + "");
                break;
            case 3:
                label.setText(i.getPlace() + "");
                break;
            default:
                label.setText("???");
        }
        return label;
    }
    
}
