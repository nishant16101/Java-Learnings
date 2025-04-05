class Printer{
    public <T> void printArray(T[] array){
        for(T element :array){
            System.out.println(element+" ");
        }
        System.out.println();
    }
}
class genericmethod{
    public static void main(String[] args) {
        Printer printer = new Printer();
        Integer[] intArray ={1,2,3,5};
        String[] strArray = {"Java","C++","Python"};
        printer.printArray(intArray);
        printer.printArray(strArray);
    }
}