public class GridViewer {
    public static void view(int[][] grid) {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                switch(grid[i][j])
                {
                    case maze.EMPTY:
                        System.out.print("  ");
                        break;
                        
                    case maze.WALL:
                        System.out.print("###");
                        break;
                        
                    case maze.START:
                        System.out.print("^^");
                        break;
                        
                    case maze.END:
                        System.out.print("$$$");
                        break;
                        
                    case maze.VISITED:
                        System.out.print("..");
                        break;
                        
                    default:
                        throw new AssertionError();
                }
            }
            System.out.println();
        }
    }
    } }