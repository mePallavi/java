public class arrays {

    public static void main(String[] args)
    {
        String icecream[] = {"vanilla", "strawberry", "chocolate"};
        int price[] = {20, 40, 50};

        System.out.println(icecream[0] + "=" + price[0]);
        System.out.println(icecream[1] + "=" + price[1]);
        System.out.println(icecream[2] + "=" + price[2]);

        System.out.println("--------------");
        
        //2D-arrays
        int[][] lotteryCard = { {20, 15, 7},                       {8, 7, 19},
                                {7, 13, 47} };
        
        //another way of declaring an empty 2d-array
        int[][] lotteryCard2 = new int[3][3];
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;
        lotteryCard2[1][0] = 8;
        lotteryCard2[1][1] = 7;
        lotteryCard2[1][2] = 19;
        lotteryCard2[2][0] = 7;
        lotteryCard2[2][1] = 13;
        lotteryCard2[2][2] = 47;
        //[row][col]

        System.out.println(lotteryCard[0][0]);

        System.out.println("--------------");

        for(int i=0; i<3; ++i) {
            System.out.println(lotteryCard[i][i]);
        }

        System.out.println("--------------");

        for(int i=0; i<3; ++i) {
            for(int j=0; j<3; ++j) {
                System.out.println(lotteryCard2[i][j]);
            }
        }
    }
}
