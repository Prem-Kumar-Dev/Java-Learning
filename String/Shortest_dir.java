public class Shortest_dir {
    public static void main(String[] args) {
        int x=0,y=0;

        String path = ("WNEENESENNN");

        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    x+=1;
                    break;
                case 'E':
                    y+=1;
                    break;
                case 'W':
                    y-=1;
                    break;
                case 'S':
                    x-=1;
                    break;
            }
        }

        float spath= (float) Math.sqrt((x*x)+(y*y));
        System.out.println(spath);
    }
}