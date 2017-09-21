package OuterInner;

public class OuterClass {
    public static class InnerClass {
        private static int id;
    }

    public int getIdFromInner() {
        return InnerClass.id;
    }
}
