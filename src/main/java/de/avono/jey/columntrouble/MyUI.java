package de.avono.jey.columntrouble;

import org.tepi.filtertable.FilterTable;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class MyUI extends UI
{

   @Override
   protected void init(VaadinRequest request)
   {
      VerticalLayout layout = new VerticalLayout();
      setContent(layout);

      Panel panel = new Panel();
      panel.setWidth("200px");
      layout.addComponent(panel);

      FilterTable filterTable = new FilterTable();
      BeanItemContainer<Item> ds = new BeanItemContainer<Item>(Item.class);
      ds.addItem(new Item());
      ds.addItem(new Item());
      filterTable.setContainerDataSource(ds);
      filterTable.setFilterBarVisible(true);
      filterTable.setWidth("100%");
      filterTable.setVisibleColumns("property1", "property2");

      panel.setContent(filterTable);
   }

}
