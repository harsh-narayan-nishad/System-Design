class Product {
    constructor(title, price, taxRate) {
      this.title = title;
      this.price = price;
      this.taxRate = taxRate;
    }
  getPrice() {
      return this.price;
    }
    
    getTaxRate() {
      return this.taxRate;
    }
  }
  class TaxCalculator {
    static calculateTax(product) {
      return product.getPrice() * product.getTaxRate();
    }
  }
  const table = new Product('a nice table', 55, 0.1);
  console.log(TaxCalculator.calculateTax(table))