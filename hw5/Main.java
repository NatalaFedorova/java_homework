package labirint;
import java.util.ArrayDeque;
import java.util.Queue;

    //  queue
    class Node
    {
        // (x, y) представляет собой координаты ячейки матрицы, а
        // `dist` представляет их минимальное расстояние от источника
        int x, y, dist;

        Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public class Main {
        // Ниже массивы детализируют все четыре возможных перемещения из ячейки
        private static final int[] row = { -1, 0, 0, 1 };
        private static final int[] col = { 0, -1, 1, 0 };

        // Функция проверки возможности перехода на позицию (строка, столбец)
        // от текущей позиции. Функция возвращает false, если (строка, столбец)
        // недопустимая позиция или имеет значение 0 или уже посещено.
        private static boolean isValid(int[][] mat, boolean[][] visited, int row, int col)
        {
            return (row >= 0) && (row < mat.length) && (col >= 0) && (col < mat[0].length)
                    && mat[row][col] == 1 && !visited[row][col];
        }

        // Находим кратчайший маршрут в матрице `mat` из источника
        // ячейка (i, j) в ячейку назначения (x, y)
        private static int findShortestPathLength(int[][] mat, int i, int j, int x, int y)
        {
            // базовый случай: неверный ввод
            if (mat == null || mat.length == 0 || mat[i][j] == 0 || mat[x][y] == 0) {
                return -1;
            }

            // Матрица `M × N`
            int M = mat.length;
            int N = mat[0].length;

            // создаем матрицу для отслеживания посещенных ячеек
            boolean[][] visited = new boolean[M][N];

            // создаем пустую queue
            Queue<Node> q = new ArrayDeque<>();

            // помечаем исходную ячейку как посещенную и ставим исходный узел в queue
            visited[i][j] = true;
            q.add(new Node(i, j, 0));

            // сохраняет длину самого длинного пути от источника к месту назначения
            int min_dist = Integer.MAX_VALUE;

            // цикл до тех пор, пока queue не станет пустой
            while (!q.isEmpty())
            {
                // удалить передний узел из очереди и обработать его
                Node node = q.poll();

                // (i, j) представляет текущую ячейку, а `dist` хранит ее
                // минимальное расстояние от источника
                i = node.x;
                j = node.y;
                int dist = node.dist;

                // если пункт назначения найден, обновляем `min_dist` и останавливаемся
                if (i == x && j == y)
                {
                    min_dist = dist;
                    break;
                }

                // проверяем все четыре возможных перемещения из текущей ячейки
                // и ставим в queue каждое допустимое движение
                for (int k = 0; k < 4; k++)
                {
                    // проверяем, можно ли выйти на позицию
                    // (i + row[k], j + col[k]) от текущей позиции
                    if (isValid(mat, visited, i + row[k], j + col[k]))
                    {
                        // отметить следующую ячейку как посещенную и поставить ее в queue
                        visited[i + row[k]][j + col[k]] = true;
                        q.add(new Node(i + row[k], j + col[k], dist + 1));
                    }
                }
            }

            if (min_dist != Integer.MAX_VALUE) {
                return min_dist;
            }
            return -1;
        }
        static void pprint(int[][] m) {
            int rows = m.length;
            int colums = m[0].length;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < colums; j++) {
                    if (m[i][j] == 0)
                        System.out.printf("%s", " @ ");
                    else System.out.printf("%s", " . ");

                }
                System.out.println();
            }
        }




        public static void main(String[] args)
        {
            int[][] mat =
                    {
                            { 1, 1, 1, 1, 1, 1, 1, 1},
                            { 1, 1, 0, 1, 1, 1, 1, 1},
                            { 1, 1, 0, 1, 0, 1, 0, 1},
                            { 1, 1, 0, 1, 1, 1, 0, 1},
                            { 1, 1, 0, 1, 1, 1, 0, 1},
                            { 1, 0, 0, 0, 0, 0, 0, 1},
                            { 1, 1, 0, 1, 1, 1, 0, 1},
                            { 1, 1, 0, 1, 1, 1, 0, 1},
                            { 1, 1, 1, 1, 1, 1, 0, 1},
                            { 1, 1, 1, 1, 1, 1, 0, 1},
                            { 1, 1, 1, 1, 1, 1, 1, 1}
                    };

            pprint(mat);
            int x = 7;
            int y = 5;
            int i = 0;
            int j = 5;

            int min_dist = findShortestPathLength(mat, x, y, i, j);

            if (min_dist != -1) {
                System.out.println("Кратчайший путь между точками (" + x +", "+ y
                        + ") и (" + i +", "+ j
                        + ") равен "+ min_dist);
            } else {
                System.out.println("Путь не найден");
            }
        }
    }

