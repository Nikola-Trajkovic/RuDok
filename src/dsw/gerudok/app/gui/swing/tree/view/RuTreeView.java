package dsw.gerudok.app.gui.swing.tree.view;

import dsw.gerudok.app.gui.swing.tree.controller.RuTreeCellEditor;
import dsw.gerudok.app.gui.swing.tree.controller.RuTreeSelectionListener;
import dsw.gerudok.app.gui.swing.tree.model.RuTreeItem;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public class RuTreeView extends JTree {


    public RuTreeView(DefaultTreeModel defaultTreeModel) {
        setModel(defaultTreeModel);
        RuTreeCellRenderer ruTreeCellRenderer = new RuTreeCellRenderer();
        addTreeSelectionListener(new RuTreeSelectionListener());
        setCellEditor(new RuTreeCellEditor(this, ruTreeCellRenderer));
        setCellRenderer(ruTreeCellRenderer);
        setEditable(true);

    }
}