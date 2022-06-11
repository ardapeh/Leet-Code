public class romanToInt {
    public static int roman2Int(String s){
        int sum = 0;
        int index = 0;
        char []charArray = s.toCharArray();
        while(index < charArray.length){
            switch (charArray[index]){
                case 'I':
                    if(index != charArray.length-1){
                        if (charArray[index+1] == 'V'){
                            sum += 4;
                            index += 2;
                            break;
                        }else if (charArray[index+1] == 'X'){
                            sum += 9;
                            index += 2;
                            break;
                        }
                    }
                    sum++;
                    index++;
                    break;

                case 'V':
                    sum += 5;
                    index++;
                    break;

                case 'X':
                    if(index != charArray.length-1) {
                        if (charArray[index+1] == 'L'){
                            sum += 40;
                            index += 2;
                            break;
                        }else if (charArray[index+1] == 'C'){
                            sum += 90;
                            index += 2;
                            break;
                        }
                    }

                    sum += 10;
                    index++;
                    break;

                case 'L':
                    sum += 50;
                    index++;
                    break;

                case 'C':
                    if(index != charArray.length-1){
                        if (charArray[index+1] == 'D'){
                            sum += 400;
                            index += 2;
                            break;
                        }else if (charArray[index+1] == 'M'){
                            sum += 900;
                            index += 2;
                            break;
                        }
                    }
                    sum += 100;
                    index++;
                    break;

                case 'D':
                    sum += 500;
                    index++;
                    break;

                case 'M':
                    sum += 1000;
                    index++;
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(roman2Int("III"));
    }
}
