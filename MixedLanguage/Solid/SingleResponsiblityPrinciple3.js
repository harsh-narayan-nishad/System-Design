//for multiple coutries with different tax rate

class Product {
    constructor(title, price) {
      this.title = title;
      this.price = price;
    }
  getPrice() {
      return this.price;
    }
  }
  const TAX_RATES = {
    "DE": {
      rate: 0.10,
      limit: 0
    },
    "UK": {
      rate: 0.12,
      limit: 60
    },
    "US": {
      rate: 0.11,
      limit: 0
    }
  }
  class TaxCalculator {
    static calculateTax(product, taxConfig) {
      return taxConfig.limit < product.getPrice() ? product.getPrice() * taxConfig.rate : 0
    }
  }
  const table = new Product('a nice table', 55);
  const totalAmountDE = table.getPrice() + TaxCalculator.calculateTax(table, TAX_RATES.DE);
  const totalAmountUK = table.getPrice() + TaxCalculator.calculateTax(table, TAX_RATES.UK);
  console.log("Total Amount in Germany: ", totalAmountDE);
  console.log("Total Amount in UK: ", totalAmountUK);