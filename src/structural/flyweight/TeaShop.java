package structural.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TeaShop {

    private final TeaMaker teaMaker;
    private final Map<Integer, KarakTea> orders = new HashMap<>();

    public TeaShop(TeaMaker teaMaker) {
        this.teaMaker = teaMaker;
    }

    public void takeOrder(String teaType, int table) {
        orders.put(table, teaMaker.make(teaType));
    }

    public void serve() {
        orders.forEach((table, tea) -> {
            System.out.println("Serving '" + tea.getPreference() + " tea' to table: " + table);
        });
    }
}
