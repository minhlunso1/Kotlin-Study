package OuterInner;

public class OuterClass {
    public static class InnerClass {
        private static int id;
        public void setId(int nId) {
            id = nId;
        }
        public int getId() {
            return id;
        }
    }

    public int getIdFromInner() {
        return InnerClass.id;
    }
}
