public class Flyweight {
    private static final String colors[] = { "Green", "Orange"};
    public static void main(String[] args) {

        for(int i=0; i < 10; ++i) {
            Tree circle = (Tree)Factory.getTree(colors[(int)(Math.random()*colors.length)]);
            circle.setSize((int)(Math.random()*10));
            circle.draw();
        }
    }
}
