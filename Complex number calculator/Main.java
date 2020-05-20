#include <iostream>
using namespace std;

class ComplexNumber
{

public:
    double real;
    double imaginary;

    void add(ComplexNumber a, ComplexNumber b)
    {

        //Just add real- and imaginary-parts
        double real = a.real + b.real;
        double imaginary = a.imaginary + b.imaginary;
        ComplexNumber c = ComplexNumber(real, imaginary);
        if (imaginary >= 0)
            cout << c.real << "+" << c.imaginary << "i";
        else
            cout << c.real << c.imaginary << "i";
    }

    void sub(ComplexNumber a, ComplexNumber b)
    {

        //Just subtract real- and imaginary-parts
        double real = a.real - b.real;
        double imaginary = a.imaginary - b.imaginary;
        ComplexNumber c = ComplexNumber(real, imaginary);
        if (imaginary >= 0)
            cout << c.real << "+" << c.imaginary << "i";
        else
            cout << c.real << c.imaginary << "i";
    }

    void multiply(ComplexNumber a, ComplexNumber b)
    {

        //Use binomial theorem to find formula to multiply complex numbers
        double real = a.real * b.real - a.imaginary * b.imaginary;
        double imaginary = a.imaginary * b.real + a.real * b.imaginary;
        ComplexNumber c = ComplexNumber(real, imaginary);

        if (imaginary >= 0)
            cout << c.real << "+" << c.imaginary << "i";
        else
            cout << c.real << c.imaginary << "i";
    }

    void divide(ComplexNumber a, ComplexNumber b)
    {

        //Again binomial theorem
        double real = (a.real * b.real + a.imaginary * b.imaginary) / (b.real * b.real + b.imaginary * b.imaginary);
        double imaginary = (a.imaginary * b.real - a.real * b.imaginary) / (b.real * b.real + b.imaginary * b.imaginary);
        ComplexNumber c = ComplexNumber(real, imaginary);
        if (imaginary >= 0)
            cout << c.real << "+" << c.imaginary << "i";
        else
            cout << c.real << c.imaginary << "i";
    }

    /*
     * Constructor to create complex numbers
     */
    ComplexNumber(double real, double imaginary)
    {
        this->real = real;
        this->imaginary = imaginary;
    }
};

int main()
{

    /*
     * Variables for the real- and imaginary-parts of
     * two complex numbers
     */
    double realA;
    double imaginaryA;
    double realB;
    double imaginaryB;
    int choice;

    /*
     * User input
     */
    cin >> choice >> realA >> imaginaryA >> realB >> imaginaryB;

    /*
     * Creation of two objects of the type "ComplexNumber"
     */
    ComplexNumber a = ComplexNumber(realA, imaginaryA);
    ComplexNumber b = ComplexNumber(realB, imaginaryB);

    /*
     * Calling the functions to add, subtract, multiply and 
     * divide the two complex numbers.
     */
    switch (choice)
    {
    case 1:
        a.add(a, b);
        break;
    case 2:
        a.sub(a, b);
        break;
    case 3:
        a.multiply(a, b);
        break;
    default:
        cout << "Invalid choice";
    }
    return 0;
}