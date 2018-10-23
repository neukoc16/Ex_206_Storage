package GUI;

import BL.Item;
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
        Item i = (Item) value;
        JLabel label = new JLabel();
        if (i.getAmount() == 0) {
            label.setBackground(Color.GRAY);
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
