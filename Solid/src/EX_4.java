public class EX_4 {
    /**
     * Абстрактный класс родитель для геометрической фигуры
     */
    public abstract class GeometricFigure {
        
        /**
         * абстрактный метод для рассчета площади фигуры
         * @return возвращает площадь фигуры
         */
        abstract public int area();
    }

    /**
     * Наследник класса GeometricFigure. Работает с прямоугольниками
     */
    public class Rectangle extends GeometricFigure {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int area() {
            return this.width * this.height;
        }
    }

    /**
     * Наследник класса GeometricFigure. Работает с квадратами
     */
    public class Square extends GeometricFigure {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public int area() {
            return this.side * this.side;
        }
    }
}