package tw.org.iii.helloapp;

/**
 * Created by user25 on 2016/4/8.
 */
public class CLotto {

    public String GetNumber(){

        int count =0;
        int[] numbers=new int[6];
        while(count<6) {
            double d = Math.random() * 100;
            int temp = (int) d;
            if(temp>0&&temp<50){
                if(NumberNotExist(temp,numbers)) {
                    numbers[count] = temp;
                    count++;
                }
            }
        }
        for(int i=0;i<numbers.length;i++ ){
            for(int j=0;j<numbers.length-1;j++ ){

                if(numbers[j+1]<numbers[j]){
                    int t=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=t;
                }
            }
        }
        String data="";
        for(int i:numbers)
            data+=String.valueOf(i)+" ";
        return data;

    }

    private boolean NumberNotExist(int temp, int[] numbers) {
        for(int i:numbers){
            if(i==temp)
                return false;
        }
        return true;
    }
}
