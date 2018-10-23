package BL;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Konstantin
 */
public class StorageModel extends AbstractTableModel {

    private final LinkedList<Item> items = new LinkedList<>();
    private String colNames[] = {"ID", "Description", "Amount", "Place"};

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return items.get(rowIndex);
    }

}
