package Practise;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler {
	public EventHandler() {
		Frame f = new Frame();
		final Label label = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(300, 300);
		Button b = new Button("show");
		b.setBounds(250, 250, 300, 300);

		final List list = new List();
		list.setBounds(25, 25, 100, 100);
		list.add("Stack");
		list.add("Queue");
		list.add("LinkedList");
		list.add("DoubleLinkedList");
		f.add(label);
		f.add(b);
		f.add(list);
		f.setSize(250, 250);
		f.setLayout(null);
		f.setVisible(true);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "Select the Operations:" + list.getItem(list.getSelectedIndex());

				for (String frame : list.getSelectedItems()) {
					data += frame + " ";
				}
				label.setText(data);
			}
		});

	}

	public static void main(String[] args) {
		new EventHandler();
	}
}
