//https://muatik.medium.com/oop-solid-with-examples-d3dc310d72c3

//This class has only to calculate the tax, only one work, nothing else
class Product {
    constructor(title, price, taxRate) {
      this.title = title;
      this.price = price;
      this.taxRate = taxRate;
    }
    calculateTax() {
      return this.price * this.taxRate;
    }
  }
  const table = new Product('a nice table', 55, 0.1);
  console.log(table.calculateTax(table));