import java.util.EmptyStackException;

class StackArray{
     private Student[] stackArray;
     private int top;

     StackArray(int maxsize) {
         stackArray=new Student[maxsize];
         top=-1;
         System.out.println("array is ready for given no of Employees");
     }

     public int size() {
         return top + 1; // Returns the number of elements in the stack
     }

     public boolean isEmpty() {
         return top == -1; // Returns true if the stack is empty
     }

     public boolean isFull() {
         return top == stackArray.length - 1; // Returns true if the stack is full
     }
	 
     public void display()
     {
         System.out.println("-----Array is-----------");
         for(int i=top;i>=0;i--)
             System.out.println(stackArray[i]+" ");
         System.out.println();
     }
     //OPERATION ON STACK
     // push an element
     public void push(Student s)
     {
         if(isFull())
         {
             System.out.println("Stack OVERFLOW!!!!!!");
             return;
         }
         top=top+1;
         stackArray[top]=s;
     }
        // pop an element
        public Student pop()
        {
            Student s;
            if(isEmpty())
            {
                System.out.println("Stack UNDERFLOW!!!!!!");
                throw new EmptyStackException();
            }
            s=stackArray[top];
            top=top-1;
            return s;
        }

    //peek
    public Student peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack UNDERFLOW!!!!!!");
            throw new EmptyStackException();
        }
        return stackArray[top];

    }
    //search if array contains a particular email or not
    public String search(String email) {
        for (int i = 0; i <= top; i++) {
            if (stackArray[i].getEmail().equals(email)) {
                return "Email is present in Stack !!"; // Email found in the stack
            }
        }
        return "Email not found"; // Email not found in the stack
    }


}