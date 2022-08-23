class HelloWorld {
    private int id;
    public int setId(int id){
        return id;
    }
    public void getId(){
        this.id=id;
    }
    public static void main(String[] args) {
        HelloWorld hw=new HelloWorld();
        hw.setId(15);
    }
}
