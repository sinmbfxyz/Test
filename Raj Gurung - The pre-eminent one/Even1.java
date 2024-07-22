class Even4{
    public void Solve(int x, int y) {
        for (int i = x; i < y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class Even1 {
    public static void main(String[] args) {
        Even4 e = new Even4();
        e.Solve(1, 50);
    }
}