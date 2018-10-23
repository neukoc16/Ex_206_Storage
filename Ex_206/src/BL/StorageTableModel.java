package BL;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Konstantin
 */
public class StorageTableModel extends AbstractTableModel {

    private final ArrayList<Article> items = new ArrayList<>();
    private final String colNames[] = {"ID", "Description", "Amount", "Place"};

    public void add(Article i) {
        items.add(i);
    }

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

    public void load(File f) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            try {
                Object o;
                while ((o = ois.readObject()) instanceof Article) {
                    add((Article) o);
                }
            } catch (EOFException e) {
            }
        }
    }

    public void save(File f) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Article sender1 : items) {
            oos.writeObject(sender1);
        }
    }
}
