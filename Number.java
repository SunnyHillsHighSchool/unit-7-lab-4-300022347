//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Kim


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
//private instance variable (must be an Integer)
private Integer num;
//constructor
public Number()
{
  num = 0;
}

public Number(Integer initNum)
{
  num = initNum;
}
//getter method
public Integer getNum()
{
  return num;
}

//setter method
public void setNum(int n)
{
  num = n;
}
//isOdd method

public void isOdd(int p)
{
  boolean odd = false;

  if((p%2)==0)
  {
    odd = false;
  }

  else
  {
    odd = true;
  }

}






//isPerfect method
public void isPerfect(int a)
{
  int total = 0;
  boolean perfect = false;

  for(int i=0; i<(a-1);i++)
  {
    if((a%i)==0)
    {
      total+=i;
    }

  }

  if(total==a)
  {
    perfect = true;
  }

  else
  {
    perfect = false;
  }
}

}
//toString