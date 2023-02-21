package HandlingDatastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import HumanCloud.DoubleLinkedList;
import HumanCloud.DoubleLinkedListException;
import HumanCloud.EmptyLinkedListException;
import HumanCloud.EmptyQueueException;
import HumanCloud.EmptyStackException;
import HumanCloud.LinkedList;
import HumanCloud.Queue;
import HumanCloud.Stack;

public class Menu extends MenuItem {

	HashMap<Integer, MenuItem> listmap = new HashMap<>();

	static Stack stk = new Stack(5);
	static Queue que = new Queue(5);
	static LinkedList ll = new LinkedList();
	static DoubleLinkedList dl = new DoubleLinkedList();
	static Scanner sc = new Scanner(System.in);

	public Menu() {
	}

	public Menu(int menuId, String menuName) {
		super(menuId, menuName);
	}

	public void addMenuName(MenuItem menuItem) {
		int menuId = menuItem.getId();
		listmap.put(menuId, menuItem);
	}

	public void displayMenu() {
		System.out.println("DataStructure");
		listmap.forEach((k, v) -> {
			System.out.println(+k + ":" + v.getItemName());
		});
		System.out.println("enter a choice:");
		int menuId = sc.nextInt();
		if (menuId == 5) {
			System.exit(0);
		}
		displaymenuItem(menuId);
	}

	public void displaymenuItem(int menuId) {
		Menu menu = (Menu) listmap.get(menuId);
		System.out.println(menu.getItemName());
		menu.listmap.forEach((k, v) -> {
			System.out.println(k + ":" + v.getItemName());
		});

		System.out.println("Enter choice number:  ");
		int choice = sc.nextInt();
		switch (menu.getItemName()) {
		case "stack": {
			StackOperation(choice);
			break;
		}
		case "Queue": {
			QueueOperation(choice, menuId);
			break;
		}
		case "LinkedList": {
			LinkedListOpertion(choice, menuId);
			break;
		}
		case "DoubleLinkedList": {
			DoubleLinkedListOperation(choice, menuId);
			break;
		}
		case "default": {
			System.err.println("Invalid choice");
			break;
		}
		}
		displaymenuItem(menuId);
	}

	public void StackOperation(int choice) {
		if (choice == 1) {
			System.out.println("Put the Value: ");
			int val = sc.nextInt();
			stk.push(val);
			System.out.println("Value is add successfully");

		} else if (choice == 2) {
			try {
				int val = stk.pop();
				System.out.println("value is delete successfully");
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}

		} else if (choice == 3) {
			int val;
			try {
				val = stk.peek();
				System.out.println("value is top" + val);
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
		} else if (choice == 4) {
			displayMenu();
		} else {
			System.err.println("Invalid Choice");
		}
	}

	public void QueueOperation(int choice, int menuId) {
		if (choice == 1) {
			System.out.println("Put the Value: ");
			int val = sc.nextInt();
			que.enqueue(val);
			System.out.println("Value is add successfully");
			displaymenuItem(menuId);
		} else if (choice == 2) {
			try {
				int val = que.dequeue();
				System.out.println("value is delete successfully");
			} catch (EmptyQueueException e) {
				e.printStackTrace();
			}
		} else if (choice == 3) {
			try {
				que.display();
				System.out.println("value is Display");

			} catch (EmptyQueueException e) {
				e.printStackTrace();
			}
			System.out.println("value is top");
			displaymenuItem(menuId);
		} else if (choice == 4) {
			displayMenu();
		} else {
			System.err.println("Invalid Choice");
			displaymenuItem(menuId);
		}
	}

	public void LinkedListOpertion(int choice, int menuId) {
		if (choice == 1) {
			System.out.println("Put the Value: ");
			int val = sc.nextInt();
			ll.insert(val);
			System.out.println("Value is add successfully");
			displaymenuItem(menuId);
		} else if (choice == 2) {
			try {
				ll.display();
				System.out.println("value is display successfully");

			} catch (EmptyLinkedListException e) {
				e.printStackTrace();
			}

		} else if (choice == 3) {
			int val = sc.nextInt();
			try {
				ll.delete(val);
				System.out.println("value is delete successfully");

			} catch (EmptyLinkedListException e) {
				e.printStackTrace();
			}
			displaymenuItem(menuId);
		} else if (choice == 4) {
			displayMenu();
		} else {
			System.err.println("Invalid Choice");
			displaymenuItem(menuId);
		}
	}

	public void DoubleLinkedListOperation(int choice, int menuId) {
		if (choice == 1) {
			System.out.println("Put the Value: ");
			int val = sc.nextInt();
			dl.addtoend(val);
			System.out.println("Value is add successfully");
			displaymenuItem(menuId);
		} else if (choice == 2) {
			int val = sc.nextInt();
			dl.addtobegin(val);
			System.out.println("value is add successfully");
		} else if (choice == 3) {
			try {
				dl.displayForward();
				System.out.println("value is display successfully");
			} catch (DoubleLinkedListException e) {
				e.printStackTrace();
			}
		} else if (choice == 4) {
			int val = sc.nextInt();
			dl.displayBackward();
			System.out.println(" value is display successfully ");
		} else if (choice == 5) {
			int val = sc.nextInt();
			try {
				dl.deleteForward(val);
				System.out.println("value is deleteForward");
			} catch (DoubleLinkedListException e) {
				e.printStackTrace();
			}
		} else if (choice == 6) {
			displayMenu();
		} else {
			System.err.println("Invalid Choice");
			displaymenuItem(menuId);
		}
	}
}
