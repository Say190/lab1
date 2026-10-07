package les3.rainbow;

public class Rainbow {

    public static final int RED = 1;
    public static final int ORANGE = 2;
    public static final int YELLOW = 3;
    public static final int GREEN = 4;
    public static final int BLUE = 5;
    public static final int INDIGO = 6;
    public static final int VIOLET = 7;

    public static final int RED_ORANGE = 101;
    public static final int ORANGE_YELLOW = 102;
    public static final int YELLOW_GREEN = 103;
    public static final int GREEN_BLUE = 104;
    public static final int BLUE_INDIGO = 105;
    public static final int INDIGO_VIOLET = 106;
    public static final int VIOLET_RED = 107;


    public void printColor (int number){

        switch(number){
            case RED: {
                System.out.println("Красный");
                break;
            }
            case ORANGE: {
                System.out.println("Оранжевый");
                break;
            }
            case YELLOW: {
                System.out.println("Жёлтый");
                break;
            }
            case GREEN: {
                System.out.println("Зелёный");
                break;
            }
            case BLUE: {
                System.out.println("Голубой");
                break;
            }
            case INDIGO: {
                System.out.println("Синий");
                break;
            }
            case VIOLET: {
                System.out.println("Фиолетовый");
                break;
            }
            default:
                System.out.println("Цвет с выбранным номером не найден.");
        }

    }

    private void printMixedColor(int number) {
        switch (number) {
            case RED_ORANGE:
                System.out.println("Красно-оранжевый");
                break;
            case ORANGE_YELLOW:
                System.out.println("Оранжево-жёлтый");
                break;
            case YELLOW_GREEN:
                System.out.println("Жёлто-зелёный");
                break;
            case GREEN_BLUE:
                System.out.println("Зелёно-голубой");
                break;
            case BLUE_INDIGO:
                System.out.println("Голубо-синий");
                break;
            case INDIGO_VIOLET:
                System.out.println("Сине-фиолетовый");
                break;
            default:
                System.out.println("Полуцвет с таким номером не найден.");
        }
    }



    public void twoPrintColor(int number){

        if (number >= RED_ORANGE && number <= VIOLET_RED){
            printMixedColor(number);
        } else {
            printColor(number);
        }

    }

}
