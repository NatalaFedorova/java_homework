package hw1;

import java.util.ArrayList;

public class Research {
    public static final ArrayList<String> result = new ArrayList<>();
    public static ArrayList<Node> tree = null;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }
}
