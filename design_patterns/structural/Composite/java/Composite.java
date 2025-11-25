package Composite.java;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public Component getComponent(int ind) {
        if (ind >= components.size() || components.size() < 0)
            return null;
        return components.get(ind);
    }

    private List<Component> components = new ArrayList<Component>();
}
